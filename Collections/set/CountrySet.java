import java.util.*;

public class CountrySet {

    HashSet<String> h1 = new HashSet<>();

    public HashSet<String> saveCountryNames(String countryName) {
        h1.add(countryName);
        return h1;
    }

    public String getCountry(String countryName) {
        for (String country : h1) {
            if (country.equals(countryName)) {
                return country;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        CountrySet obj = new CountrySet();

        obj.saveCountryNames("India");
        obj.saveCountryNames("USA");
        obj.saveCountryNames("Japan");
        obj.saveCountryNames("Australia");

        System.out.println(obj.getCountry("India"));
        System.out.println(obj.getCountry("Canada"));
    }
}