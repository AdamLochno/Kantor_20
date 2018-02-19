
package kantor_2.pkg0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Kantor_20 {
    public int wartosc1;
    public String waluta1,waluta2;
    
    public static void main(String[] args) throws IOException 
    {
        //WPROWADZAMY WARTOŚCI
        PushData pushdata = new PushData();
        pushdata.PushData();
        
        //ZACIĄGAMY DANE ODNOSNIE WALUT
        PullData pulldata = new PullData();        
        pulldata.getRateEuro();
        pulldata.getRateDollar();
        pulldata.getRateFunt();
        pulldata.getRateFrank();
        pulldata.Druk();
        
        //PROGRAM LICZY
        Obliczenia kantor= new Obliczenia();
        kantor.obliczenia();
        
        //PROGRAM WYŚWIETLA WYNIKI
        kantor.wyswietlWynik();
        
                
    }
    
}
