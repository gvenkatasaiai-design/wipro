import java.util.*;

public class CountryTreeSet {

    TreeSet<String> t1 = new TreeSet<>();

    public TreeSet<String> saveCountryNames(String countryName) {
        t1.add(countryName);
        return t1;
    }

    public String getCountry(String countryName) {
        for (String country : t1) {
            if (country.equals(countryName)) {
                return country;
            }
        }
        return null;
    }

    public static void main(String[] args) {

        CountryTreeSet obj = new CountryTreeSet();

        obj.saveCountryNames("India");
        obj.saveCountryNames("USA");
        obj.saveCountryNames("Japan");
        obj.saveCountryNames("Australia");

        System.out.println(obj.getCountry("Japan"));
        System.out.println(obj.getCountry("China"));
    }
}