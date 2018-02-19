
package kantor_2.pkg0;


public class Obliczenia extends Kantor_20
{
    double wartość1=0;
    double zloty = 1;
    double euro =4.3;
    double dollar = 3.8;
    double funt = 4.9;
    double frankSzwajcarski = 3.6;
    double wynik=0;
    public void obliczenia()
    {
        //WARTOŚĆ WEJŚCIOWA JEST W ZŁOTOWKACH
        if ("zloty".equals(waluta1))
        {
            if ("zloty".equals(waluta2))
            {
                wynik=wartosc1/zloty;
            } 
            if ("euro".equals(waluta2))
            {
            wynik=wartosc1/euro;
            }
            if ("dollar".equals(waluta2))
            {
                wynik=wartosc1/dollar;
            } 
            if ("funt".equals(waluta2))
            {
            wynik=wartosc1/funt;
            }
            if ("frankSzwajcarski".equals(waluta2))
            {
                wynik=wartosc1/frankSzwajcarski;
            }            
        }
        
        //WARTOŚĆ WEJŚCIOWA JEST W EURO
        if ("euro".equals(waluta1))
        {
            wartosc1=(int) (wartosc1*euro); //OTRZYMUJEMY WARTOŚĆ WEJŚCIOWĄ W ZŁOTÓWKACH
            if ("zloty".equals(waluta2))
            {
                wynik=wartosc1/zloty;
            } 
            if ("euro".equals(waluta2))
            {
            wynik=wartosc1/euro;
            }
            if ("dollar".equals(waluta2))
            {
                wynik=wartosc1/dollar;
            } 
            if ("funt".equals(waluta2))
            {
            wynik=wartosc1/funt;
            }
            if ("frankSzwajcarski".equals(waluta2))
            {
            wynik=wartosc1/frankSzwajcarski;
            }             
        }
        //WARTOŚĆ WEJŚCIOWA JEST W DOLLARACH
        if ("dollar".equals(waluta1))
        {
            wartosc1=(int) (wartosc1*dollar); //OTRZYMUJEMY WARTOŚĆ WEJŚCIOWĄ W ZŁOTÓWKACH
            if ("zloty".equals(waluta2))
            {
                wynik=wartosc1/zloty;
            } 
            if ("euro".equals(waluta2))
            {
            wynik=wartosc1/euro;
            }
            if ("dollar".equals(waluta2))
            {
                wynik=wartosc1/dollar;
            } 
            if ("funt".equals(waluta2))
            {
            wynik=wartosc1/funt;
            }
            if ("frankSzwajcarski".equals(waluta2))
            {
            wynik=wartosc1/frankSzwajcarski;
            }             
        }
        //WARTOŚĆ WEJŚCIOWA JEST W FUNTACH
        if ("funt".equals(waluta1))
        {
            wartosc1=(int) (wartosc1*euro); //OTRZYMUJEMY WARTOŚĆ WEJŚCIOWĄ W ZŁOTÓWKACH
            if ("zloty".equals(waluta2))
            {
                wynik=wartosc1/zloty;
            } 
            if ("euro".equals(waluta2))
            {
            wynik=wartosc1/euro;
            }
            if ("dollar".equals(waluta2))
            {
                wynik=wartosc1/dollar;
            } 
            if ("funt".equals(waluta2))
            {
            wynik=wartosc1/funt;
            }
            if ("frankSzwajcarski".equals(waluta2))
            {
            wynik=wartosc1/frankSzwajcarski;
            }             
        }
        //WARTOŚĆ WEJŚCIOWA JEST WE FRANKACH
        if ("frank".equals(waluta1))
        {
            wartosc1=(int) (wartosc1*euro); //OTRZYMUJEMY WARTOŚĆ WEJŚCIOWĄ W ZŁOTÓWKACH
            if ("zloty".equals(waluta2))
            {
                wynik=wartosc1/zloty;
            } 
            if ("euro".equals(waluta2))
            {
            wynik=wartosc1/euro;
            }
            if ("dollar".equals(waluta2))
            {
                wynik=wartosc1/dollar;
            } 
            if ("funt".equals(waluta2))
            {
            wynik=wartosc1/funt;
            }
            if ("frankSzwajcarski".equals(waluta2))
            {
            wynik=wartosc1/frankSzwajcarski;
            }           
        }
    }
    public void wyswietlWynik()
    {
        System.out.println("Wynikiem jest: " + wynik);
    }
}
