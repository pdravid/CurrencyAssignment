import java.util.spi.CurrencyNameProvider;

/**
 * Created by Pushkar Dravid on 12-01-2015.
 */
public class Country {
    protected String countryName;

    Country(String countryName) {
        this.countryName = countryName;
    }

    public Currency getCurrencyName() {
        Currency currency = null;
        if (countryName.equals("India")) {
            currency = new Rupee();
        } else if (countryName.equals("US")) {
            currency = new Dollar();
        } else if (countryName.equals("UK")) {
            currency = new Euro();
        }
        return currency;
    }
}
