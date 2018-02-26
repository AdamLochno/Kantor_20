
package kantor;

import java.io.IOException;
import java.net.MalformedURLException;


public class Obliczenia 
{
    private double zloty = 1;
    private double wklad;
    

    public double obliczenia(UserInput userInput) throws MalformedURLException, IOException 
    {
        return oblicz(userInput.getAmount(), userInput.getInitialCurrency(), userInput.getTargetCurrency());
    }   
      
    private PullData pullData = new PullData();
         
    public double oblicz(int Amount, String InitialCurrency, String TargetCurrency) throws MalformedURLException, IOException 
    {
        double wynik = 0;
//        euro = valueEuro;
        if ("zloty".equals(InitialCurrency)){
            wklad = Amount;
            if ("zloty".equals(TargetCurrency)){
                wynik = wklad / zloty;
            }
            if ("euro".equals(TargetCurrency)){                
                wynik = wklad /pullData.getRateEuro();
            }
            if ("dollar".equals(TargetCurrency)){
                wynik = wklad / pullData.getRateDollar();
            }
            if ("funt".equals(TargetCurrency)){
                wynik = wklad / pullData.getRateFunt();
            }
            if ("frankSzwajcarski".equals(TargetCurrency)){
                wynik = wklad / pullData.getRateFrank();
            }
        }

        //WARTOŚĆ WEJŚCIOWA JEST W EURO
        if ("euro".equals(InitialCurrency)){
            wklad = (double) (Amount * pullData.getRateEuro()); //OTRZYMUJEMY WARTOŚĆ WEJŚCIOWĄ W ZŁOTÓWKACH
            if ("zloty".equals(TargetCurrency)){
                wynik = wklad / zloty;
            }
            if ("euro".equals(TargetCurrency)){
                wynik = wklad / pullData.getRateEuro();
            }
            if ("dollar".equals(TargetCurrency)){
                wynik = wklad / pullData.getRateDollar();
            }
            if ("funt".equals(TargetCurrency)){
                wynik = wklad / pullData.getRateFunt();
            }
            if ("frankSzwajcarski".equals(TargetCurrency)){
                wynik = wklad / pullData.getRateFrank();
            }
        }
        //WARTOŚĆ WEJŚCIOWA JEST W DOLLARACH
        if ("dollar".equals(InitialCurrency)){
            wklad = (double) (Amount * pullData.getRateDollar()); //OTRZYMUJEMY WARTOŚĆ WEJŚCIOWĄ W ZŁOTÓWKACH
            if ("zloty".equals(TargetCurrency)){
                wynik = wklad / zloty;
            }
            if ("euro".equals(TargetCurrency)){
                wynik = wklad / pullData.getRateEuro();
            }
            if ("dollar".equals(TargetCurrency)){
                wynik = wklad / pullData.getRateDollar();
            }
            if ("funt".equals(TargetCurrency)){
                wynik = wklad / pullData.getRateFunt();
            }
            if ("frankSzwajcarski".equals(TargetCurrency)){
                wynik = wklad / pullData.getRateFrank();
            }
        }
        //WARTOŚĆ WEJŚCIOWA JEST W FUNTACH
        if ("funt".equals(InitialCurrency)){
            wklad = (int) (Amount * pullData.getRateFunt()); //OTRZYMUJEMY WARTOŚĆ WEJŚCIOWĄ W ZŁOTÓWKACH
            if ("zloty".equals(TargetCurrency)){
                wynik = wklad / zloty;
            }
            if ("euro".equals(TargetCurrency)){
                wynik = wklad / pullData.getRateEuro();
            }
            if ("dollar".equals(TargetCurrency)){
                wynik = wklad / pullData.getRateDollar();
            }
            if ("funt".equals(TargetCurrency)){
                wynik = wklad / pullData.getRateFunt();
            }
            if ("frankSzwajcarski".equals(TargetCurrency)){
                wynik = wklad / pullData.getRateFrank();
            }
        }
        //WARTOŚĆ WEJŚCIOWA JEST WE FRANKACH
        if ("frank".equals(InitialCurrency)){
            wklad = (int) (Amount * pullData.getRateFrank()); //OTRZYMUJEMY WARTOŚĆ WEJŚCIOWĄ W ZŁOTÓWKACH
            if ("zloty".equals(TargetCurrency)){
                wynik = wklad / zloty;
            }
            if ("euro".equals(TargetCurrency)){
                wynik = wklad / pullData.getRateEuro();
            }
            if ("dollar".equals(TargetCurrency)){
                wynik = wklad / pullData.getRateDollar();
            }
            if ("funt".equals(TargetCurrency)){
                wynik = wklad / pullData.getRateFunt();
            }
            if ("frankSzwajcarski".equals(TargetCurrency)){
                wynik = wklad / pullData.getRateFrank();
            }
        }
        else{
            System.out.println("Niepoprawna wartość wprowadzona");   
            }
        System.out.println("Wynik działania: "+ Amount + " " + InitialCurrency + " zmienione na: " + TargetCurrency);
        return wynik;
        
    }
}
