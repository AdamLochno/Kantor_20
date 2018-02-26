
package kantor;

import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.Scanner;

public class RateProvider {
    private HttpClient httpClient;

    public RateProvider(HttpClient httpClient) {
        this.httpClient = httpClient;
    }

    public BigDecimal getRate(Currency initial, Currency target) {
        if (!initial.equals(Currency.getInstance("PLN"))) {
            throw new UnsupportedOperationException();
        }

        return getFromNBP(target);
    }

    private BigDecimal getFromNBP(Currency target) {
        String url = String.format(
                "http://api.nbp.pl/api/exchangerates/rates/a/%s/?format=JSON",
                target.getCurrencyCode()
        );
        HttpGet request = new HttpGet(url);
        String json = handle(request);
        return extract(json);
    }

    private String handle(HttpGet request) {
        try {
            InputStream content = httpClient.execute(request)
                    .getEntity()
                    .getContent();
            return new Scanner(content)
                    .useDelimiter("\\A")
                    .next();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private BigDecimal extract(String responseBody) {
        return new JSONObject(responseBody)
                .getJSONArray("rates")
                .getJSONObject(0)
                .getBigDecimal("mid");
    }


}
