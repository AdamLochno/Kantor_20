
package kantor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.Currency;


public class UserInput {
    private BufferedReader reader;

    private final String CURRENCIES = "PLN, USD, EUR";

    public UserInput() {
        reader = new BufferedReader(new InputStreamReader(System.in));
    }

    public BigDecimal getAmount() {
        System.out.println("Wprowadź wartość do obliczeń:");
        return new BigDecimal(readLine());
    }

    public Currency getInitialCurrency() {
        System.out.println("Wybierz walutę początkową: " + CURRENCIES);
        return Currency.getInstance(readLine());
    }

    public Currency getTargetCurrency() {
        System.out.println("Wybierz walutę: " + CURRENCIES);
        return Currency.getInstance(readLine());
    }

    private String readLine() {
        try {
            return reader.readLine();
        } catch (IOException e) {
            System.out.println("nie poprawne wejście, spróbuj ponownie");
            return readLine();
        }
    }
}