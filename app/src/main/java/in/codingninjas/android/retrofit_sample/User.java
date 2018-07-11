package in.codingninjas.android.retrofit_sample;

public class User {

    int id;

    String name;

    String username;

    String email;

    class Address{

        String street;

        String suite;

        String city;

        String zipcode;

        class Geo{

            String latitude;

            String longitude;
        }
    }

    String phone;

    String website;

    class Company{

        String name;

        String catchPhrase;

        String bs;
    }
}
