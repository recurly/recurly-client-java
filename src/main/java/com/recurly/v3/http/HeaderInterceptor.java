package com.recurly.v3.http;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

public class HeaderInterceptor implements Interceptor {

    private String apiVersion;
    private String authToken;

    public HeaderInterceptor(final String authToken, final String apiVersion) {
        this.apiVersion = apiVersion;
        this.authToken = authToken;
    }

    public Response intercept(final Chain chain) throws IOException {
        Request original = chain.request();

        Request.Builder builder = original.newBuilder()
                .header("Authorization", authToken)
                .header("Accept", "application/vnd.recurly." + apiVersion)
                .header("Content-Type", "application/json")
                .header("User-Agent", "Java v3 Client");

        Request request = builder.build();
        return chain.proceed(request);
    }
}
