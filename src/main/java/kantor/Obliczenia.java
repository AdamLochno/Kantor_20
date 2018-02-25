
package kantor;

import java.io.IOException;


public class Obliczenia 
{
    private double zloty = 1;
    private double euro = 4.6;
    private double dollar = 3.8;
    private double funt = 4.9;
    private double frankSzwajcarski = 3.6;
    

    public double obliczenia(UserInput userInput) 
    {
        return oblicz(userInput.getAmount(), userInput.getInitialCurrency(), userInput.getTargetCurrency());
    }   
      
    private PullData pullData = new PullData();
         
    public double oblicz(int Amount, String InitialCurrency, String TargetCurrency) 
    {
        double wynik = 0;
//        euro = valueEuro;
        if ("zloty".equals(InitialCurrency)) {
            if ("zloty".equals(TargetCurrency)) {
                wynik = Amount / zloty;
            }
            if ("euro".equals(TargetCurrency)) 
            {
                pullData.getRateEuro();
                wynik = Amount /valueEuro;
            }
            if ("dollar".equals(TargetCurrency)) {
                wynik = Amount / dollar;
            }
            if ("funt".equals(TargetCurrency)) {
                wynik = Amount / funt;
            }
            if ("frankSzwajcarski".equals(TargetCurrency)) {
                wynik = Amount / frankSzwajcarski;
            }
        }

        //WARTOŚĆ WEJŚCIOWA JEST W EURO
        if ("euro".equals(InitialCurrency)) {
            Amount = (int) (Amount * euro); //OTRZYMUJEMY WARTOŚĆ WEJŚCIOWĄ W ZŁOTÓWKACH
            if ("zloty".equals(TargetCurrency)) {
                wynik = Amount / zloty;
            }
            if ("euro".equals(TargetCurrency)) {
                wynik = Amount / euro;
            }
            if ("dollar".equals(TargetCurrency)) {
                wynik = Amount / dollar;
            }
            if ("funt".equals(TargetCurrency)) {
                wynik = Amount / funt;
            }
            if ("frankSzwajcarski".equals(TargetCurrency)) {
                wynik = Amount / frankSzwajcarski;
            }
        }
        //WARTOŚĆ WEJŚCIOWA JEST W DOLLARACH
        if ("dollar".equals(InitialCurrency)) {
            Amount = (int) (Amount * dollar); //OTRZYMUJEMY WARTOŚĆ WEJŚCIOWĄ W ZŁOTÓWKACH
            if ("zloty".equals(TargetCurrency)) {
                wynik = Amount / zloty;
            }
            if ("euro".equals(TargetCurrency)) {
                wynik = Amount / euro;
            }
            if ("dollar".equals(TargetCurrency)) {
                wynik = Amount / dollar;
            }
            if ("funt".equals(TargetCurrency)) {
                wynik = Amount / funt;
            }
            if ("frankSzwajcarski".equals(TargetCurrency)) {
                wynik = Amount / frankSzwajcarski;
            }
        }
        //WARTOŚĆ WEJŚCIOWA JEST W FUNTACH
        if ("funt".equals(InitialCurrency)) {
            Amount = (int) (Amount * euro); //OTRZYMUJEMY WARTOŚĆ WEJŚCIOWĄ W ZŁOTÓWKACH
            if ("zloty".equals(TargetCurrency)) {
                wynik = Amount / zloty;
            }
            if ("euro".equals(TargetCurrency)) {
                wynik = Amount / euro;
            }
            if ("dollar".equals(TargetCurrency)) {
                wynik = Amount / dollar;
            }
            if ("funt".equals(TargetCurrency)) {
                wynik = Amount / funt;
            }
            if ("frankSzwajcarski".equals(TargetCurrency)) {
                wynik = Amount / frankSzwajcarski;
            }
        }
        //WARTOŚĆ WEJŚCIOWA JEST WE FRANKACH
        if ("frank".equals(InitialCurrency)) {
            Amount = (int) (Amount * euro); //OTRZYMUJEMY WARTOŚĆ WEJŚCIOWĄ W ZŁOTÓWKACH
            if ("zloty".equals(TargetCurrency)) {
                wynik = Amount / zloty;
            }
            if ("euro".equals(TargetCurrency)) {
                wynik = Amount / euro;
            }
            if ("dollar".equals(TargetCurrency)) {
                wynik = Amount / dollar;
            }
            if ("funt".equals(TargetCurrency)) {
                wynik = Amount / funt;
            }
            if ("frankSzwajcarski".equals(TargetCurrency)) {
                wynik = Amount / frankSzwajcarski;
            }
        }
        return wynik;
    }
}
