
package kantor;


import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.Currency;

public class Calculator {
    private RateProvider rateProvider;

    public Calculator(RateProvider rateProvider) {
        this.rateProvider = rateProvider;
    }

    public BigDecimal handle(UserInput userInput) {
        return calculate(
                userInput.getAmount(),
                userInput.getInitialCurrency(),
                userInput.getTargetCurrency()
        );
    }

    public BigDecimal calculate(BigDecimal amount, Currency initial, Currency target) {
        if (initial.equals(target)) {
            return amount;
        }
        return amount.divide(rateProvider.getRate(initial, target), MathContext.DECIMAL64)
                .setScale(2, RoundingMode.HALF_UP);
    }
}
