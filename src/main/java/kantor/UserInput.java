
package kantor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class UserInput {
    private BufferedReader reader;

    public UserInput() {
        reader = new BufferedReader(new InputStreamReader(System.in));
    }

    public int getAmount() {
        System.out.println("Wprowadź wartość do obliczeń:");
        return Integer.parseInt(readLine());
    }

    public String getInitialCurrency() {
        System.out.println("Wybierz walutę początkową ZLOTY,EURO,DOLLAR,FUNT,FRANK:");
        return readLine().toLowerCase();
    }

    public String getTargetCurrency() {
        System.out.println("Wybierz walutę docelową ZLOTY,EURO,DOLLAR,FUNT,FRANK:");
        return readLine().toLowerCase();
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