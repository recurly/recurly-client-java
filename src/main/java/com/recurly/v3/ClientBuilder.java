package com.recurly.v3;

// need these for ignoring SSL verification
import com.fatboyindustrial.gsonjodatime.Converters;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.recurly.v3.http.HeaderInterceptor;
import okhttp3.Credentials;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

import java.io.InvalidClassException;
import java.security.cert.CertificateException;

public class ClientBuilder {
    private static final String API_URL = "https://partner-api.recurly.com/";
    //private static OkHttpClient.Builder httpClientBuilder = new OkHttpClient.Builder();
    // TODO will want to use safe ^ version by default
    private static OkHttpClient.Builder httpClientBuilder = getUnsafeOkHttpClientBuilder();
    private static Gson gson = Converters.registerDateTime(new GsonBuilder()).create();
    private String apiKey;
    private String siteId;

    public ClientBuilder() {}

    private static OkHttpClient.Builder getUnsafeOkHttpClientBuilder() {
        try {
            // Create a trust manager that does not validate certificate chains
            final TrustManager[] trustAllCerts = new TrustManager[] {
                    new X509TrustManager() {
                        public void checkClientTrusted(java.security.cert.X509Certificate[] chain, String authType) throws CertificateException {
                        }

                        public void checkServerTrusted(java.security.cert.X509Certificate[] chain, String authType) throws CertificateException {
                        }
                        public java.security.cert.X509Certificate[] getAcceptedIssuers() {
                            return new java.security.cert.X509Certificate[]{};
                        }
                    }
            };

            // Install the all-trusting trust manager
            final SSLContext sslContext = SSLContext.getInstance("SSL");
            sslContext.init(null, trustAllCerts, new java.security.SecureRandom());
            // Create an ssl socket factory with our all-trusting manager
            final SSLSocketFactory sslSocketFactory = sslContext.getSocketFactory();

            OkHttpClient.Builder builder = new OkHttpClient.Builder();
            builder.sslSocketFactory(sslSocketFactory);
            builder.hostnameVerifier(new HostnameVerifier() {
                public boolean verify(String hostname, SSLSession session) {
                    return true;
                }
            });

            return builder;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public ClientBuilder withApiKey(String apiKey){
        this.apiKey = apiKey;
        return this;
    }
    public ClientBuilder withSiteId(String siteId){
        this.siteId = siteId;
        return this;
    }


    public Client build() throws InvalidClassException {
        if (this.apiKey == null || this.apiKey == "") {
            throw new InvalidClassException("Client", "API Key must be set");
        }
        if (this.siteId == null || this.siteId == "") {
            throw new InvalidClassException("Client", "Site ID must be set");
        }
        final String authToken = Credentials.basic(this.apiKey, "");
        final HeaderInterceptor headerInterceptor =
                new HeaderInterceptor(authToken, Client.API_VERSION);

        if (!httpClientBuilder.interceptors().contains(headerInterceptor)) {
            httpClientBuilder.addInterceptor(headerInterceptor);
        }

        if (System.getenv("RECURLY_INSECURE") != null && System.getenv("RECURLY_INSECURE").equals("true")) {
            HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
            logging.setLevel(HttpLoggingInterceptor.Level.BASIC);
            httpClientBuilder.addInterceptor(logging);
        }

        OkHttpClient client = httpClientBuilder.build();
        Client recurlyClient = new Client(client, this.siteId, this.apiKey);
        recurlyClient.apiUrl = API_URL;
        return recurlyClient;
    }
}
