import com.recurly.v3.Client;
import com.recurly.v3.ClientBuilder;
import com.recurly.v3.resources.Site;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Main {
    public static void main(String[] args) {
        final Client client = ClientBuilder.build("aaaaaaaaaapikey");

        client.getSite("subdomain-ben").enqueue(new Callback<Site>() {
            public void onResponse(Call<Site> call, Response<Site> response) {
                System.out.println("Response Code: " + response.code());
                System.out.println("Body: "+ response.raw());
                Site site = response.body();
                System.out.println("Site id: " + site.getId());
                System.out.println("Site subdomain: " + site.getSubdomain());
                System.out.println("Site createdAt: " + site.getCreatedAt());
                System.out.println("Site updatedAt: " + site.getCreatedAt());
                System.out.println("Site address.country: " + site.getAddress().getCountry());
            }
            public void onFailure(Call<Site> call, Throwable throwable) {
                System.out.println(throwable.getMessage());
            }
        });

//        client.getSites().enqueue(new Callback<Pager<Site>>() {
//            public void onResponse(Call<Pager<Site>> call, Response<Pager<Site>> response) {
//                Pager<Site> sites = response.body();
//                for (Site site : sites) {
//                    System.out.println("Site: " + site.getId());
//                }
//            }
//
//            public void onFailure(Call<Pager<Site>> call, Throwable throwable) {
//                System.out.println(throwable.getMessage());
//            }
//        });


//        client.createAccount("subdomain-ben", account).enqueue(new Callback<Account>() {
//            public void onResponse(Call<Account> call, Response<Account> response) {
//                System.out.println("response code: " + response.code());
//                Account newAccount = response.body();
//                System.out.println("Account id: "+newAccount.getId());
//                System.out.println("Account created: "+newAccount.getCreatedAt());
//                System.out.println("Account updated: "+newAccount.getUpdatedAt());
//                System.out.println("Account address street: "+newAccount.getAddress().getStreet1());
//                System.out.println("Account address city: "+newAccount.getAddress().getCity());
//                System.out.println("Account address region: "+newAccount.getAddress().getRegion());
//                System.out.println("Account address country: "+newAccount.getAddress().getCountry());
//            }
//            public void onFailure(Call<Account> call, Throwable throwable) {
//                System.out.println(throwable.getMessage());
//            }
//        });


//        CreateAccount account = new CreateAccount();
//        account.setCode("benjamin.dumonde1234567@example.com");
//        account.setFirstName("benjamin");
//        account.setLastName("derp");
//
//        Address address = new Address();
//        address.setCity("New Orleans");
//        address.setStreet1("123 Main St");
//        address.setCountry("US");
//        address.setRegion("LA");
//
//        account.setAddress(address);
//
//        try {
//            Response<Account> response = client.createAccount("subdomain-ben", account).execute();
//            final Account newAccount = response.body();
//            System.out.println("Account id: "+newAccount.getId());
//            System.out.println("Account created: "+newAccount.getCreatedAt());
//            System.out.println("Account updated: "+newAccount.getUpdatedAt());
//            System.out.println("Account address street: "+newAccount.getAddress().getStreet1());
//            System.out.println("Account address city: "+newAccount.getAddress().getCity());
//            System.out.println("Account address region: "+newAccount.getAddress().getRegion());
//            System.out.println("Account address country: "+newAccount.getAddress().getCountry());
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }
}
