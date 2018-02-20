
package kantor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class PushData {
    public int wartosc1;
    public String waluta1, waluta2;
    private BufferedReader reader;

    public void PushData() throws IOException {
        reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Wybierz walutę docelową ZLOTY,EURO,DOLLAR,FUNT,FRANK:");
        waluta2 = reader.readLine();

        //ZMIANA WARTOŚCI NA MAŁE ZNAKI       
        waluta1 = waluta1.replaceAll("[^a-zA-Z]+", "").toLowerCase();
        waluta2 = waluta2.replaceAll("[^a-zA-Z]+", "").toLowerCase();

        System.out.println("a:" + wartosc1 + " waluta1:" + waluta1 + " waluta2:" + waluta2);
    }

    public int getAmount() {
        System.out.println("Wprowadź wartość do obliczeń:");
        return Integer.parseInt(readLine());
    }

    public String getInitialCurrency() {
        System.out.println("Wybierz walutę początkową ZLOTY,EURO,DOLLAR,FUNT,FRANK:");
        return readLine();
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