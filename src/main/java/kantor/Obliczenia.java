
package kantor;


public class Obliczenia {
    private double zloty = 1;
    private double euro = 4.3;
    private double dollar = 3.8;
    private double funt = 4.9;
    private double frankSzwajcarski = 3.6;

    public double oblicz(UserInput userInput) {
        return oblicz(userInput.getAmount(), userInput.getInitialCurrency(), userInput.getTargetCurrency());
    }

    public double oblicz(int wartosc1, String waluta1, String waluta2) {
        double wynik = 0;
        if ("zloty".equals(waluta1)) {
            if ("zloty".equals(waluta2)) {
                wynik = wartosc1 / zloty;
            }
            if ("euro".equals(waluta2)) {
                wynik = wartosc1 / euro;
            }
            if ("dollar".equals(waluta2)) {
                wynik = wartosc1 / dollar;
            }
            if ("funt".equals(waluta2)) {
                wynik = wartosc1 / funt;
            }
            if ("frankSzwajcarski".equals(waluta2)) {
                wynik = wartosc1 / frankSzwajcarski;
            }
        }

        //WARTOŚĆ WEJŚCIOWA JEST W EURO
        if ("euro".equals(waluta1)) {
            wartosc1 = (int) (wartosc1 * euro); //OTRZYMUJEMY WARTOŚĆ WEJŚCIOWĄ W ZŁOTÓWKACH
            if ("zloty".equals(waluta2)) {
                wynik = wartosc1 / zloty;
            }
            if ("euro".equals(waluta2)) {
                wynik = wartosc1 / euro;
            }
            if ("dollar".equals(waluta2)) {
                wynik = wartosc1 / dollar;
            }
            if ("funt".equals(waluta2)) {
                wynik = wartosc1 / funt;
            }
            if ("frankSzwajcarski".equals(waluta2)) {
                wynik = wartosc1 / frankSzwajcarski;
            }
        }
        //WARTOŚĆ WEJŚCIOWA JEST W DOLLARACH
        if ("dollar".equals(waluta1)) {
            wartosc1 = (int) (wartosc1 * dollar); //OTRZYMUJEMY WARTOŚĆ WEJŚCIOWĄ W ZŁOTÓWKACH
            if ("zloty".equals(waluta2)) {
                wynik = wartosc1 / zloty;
            }
            if ("euro".equals(waluta2)) {
                wynik = wartosc1 / euro;
            }
            if ("dollar".equals(waluta2)) {
                wynik = wartosc1 / dollar;
            }
            if ("funt".equals(waluta2)) {
                wynik = wartosc1 / funt;
            }
            if ("frankSzwajcarski".equals(waluta2)) {
                wynik = wartosc1 / frankSzwajcarski;
            }
        }
        //WARTOŚĆ WEJŚCIOWA JEST W FUNTACH
        if ("funt".equals(waluta1)) {
            wartosc1 = (int) (wartosc1 * euro); //OTRZYMUJEMY WARTOŚĆ WEJŚCIOWĄ W ZŁOTÓWKACH
            if ("zloty".equals(waluta2)) {
                wynik = wartosc1 / zloty;
            }
            if ("euro".equals(waluta2)) {
                wynik = wartosc1 / euro;
            }
            if ("dollar".equals(waluta2)) {
                wynik = wartosc1 / dollar;
            }
            if ("funt".equals(waluta2)) {
                wynik = wartosc1 / funt;
            }
            if ("frankSzwajcarski".equals(waluta2)) {
                wynik = wartosc1 / frankSzwajcarski;
            }
        }
        //WARTOŚĆ WEJŚCIOWA JEST WE FRANKACH
        if ("frank".equals(waluta1)) {
            wartosc1 = (int) (wartosc1 * euro); //OTRZYMUJEMY WARTOŚĆ WEJŚCIOWĄ W ZŁOTÓWKACH
            if ("zloty".equals(waluta2)) {
                wynik = wartosc1 / zloty;
            }
            if ("euro".equals(waluta2)) {
                wynik = wartosc1 / euro;
            }
            if ("dollar".equals(waluta2)) {
                wynik = wartosc1 / dollar;
            }
            if ("funt".equals(waluta2)) {
                wynik = wartosc1 / funt;
            }
            if ("frankSzwajcarski".equals(waluta2)) {
                wynik = wartosc1 / frankSzwajcarski;
            }
        }
        return wynik;
    }
}
