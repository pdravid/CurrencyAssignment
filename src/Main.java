/**
 * Created by Pushkar Dravid on 12-01-2015.
 */

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String country = in.nextLine();
        Country c = new Country(country);
        System.out.println(c.getCurrencyName().getName());
        System.out.println(c.getCurrencyName().getSymbol());


    }


}

