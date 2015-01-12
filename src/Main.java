/**
 * Created by Pushkar Dravid on 12-01-2015.
 */

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String country = getCountryName();
        Country c = new Country(country);
        System.out.println(c.getCurrencyName().getName());
        System.out.println(c.getCurrencyName().getSymbol());


    }

    private static String getCountryName() {
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }


}

