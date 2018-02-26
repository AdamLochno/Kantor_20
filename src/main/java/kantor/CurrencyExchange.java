
package kantor;

public class CurrencyExchange {

    public static void main(String[] args) {
        CurrencyExchange currencyExchange = new CurrencyExchange();
        currencyExchange.run();
    }

    private void run() {
        Obliczenia kantor = new Obliczenia();
        double result = kantor.oblicz(new UserInput());
        System.out.println(result);
    }
}
