
package kantor_2.pkg0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Kantor_20 {

   public static int wartosc1;
   public static String waluta1,waluta2;
    
    
    public static void main(String[] args) throws IOException 
    {
        //WPROWADZENIE WARTOŚCI
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Wprowadź wartość do obliczeń:");
        wartosc1 = Integer.parseInt(br.readLine());
        
        System.out.println("Wprowadź waluta1 ZLOTY,EURO,DOLLAR,FUNT,FRANK:");
        waluta1 = br.readLine();
        
        System.out.println("Wprowadź waluta2 ZLOTY,EURO,DOLLAR,FUNT,FRANK:");
        waluta2 = br.readLine();
        
        //ZMIANA WARTOŚCI NA MAŁE ZNAKI       
        waluta1 = waluta1.replaceAll("[^a-zA-Z]+","").toLowerCase();
        waluta2 = waluta2.replaceAll("[^a-zA-Z]+","").toLowerCase();
        
        System.out.println("a:"+wartosc1 +" waluta1:"+waluta1+" waluta2:"+waluta2);
        
        Obliczenia kantor= new Obliczenia();
        kantor.obliczenia();
        kantor.wyswietlWynik();
        PullData pulldata = new PullData();
        pulldata.getRateDollar();
    }
    
}
