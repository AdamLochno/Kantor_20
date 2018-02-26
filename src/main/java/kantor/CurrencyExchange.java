
package kantor;

import org.apache.http.client.HttpClient;
import org.apache.http.impl.client.HttpClients;

import java.math.BigDecimal;

public class CurrencyExchange {

    public static void main(String[] args) {
        CurrencyExchange currencyExchange = new CurrencyExchange();
        currencyExchange.run();
    }

    private void run() {
        HttpClient httpClient = HttpClients.createDefault();
        RateProvider rateProvider = new RateProvider(httpClient);
        Calculator calculator = new Calculator(rateProvider);
        BigDecimal result = calculator.handle(new UserInput());
        System.out.println(result);
    }
}
