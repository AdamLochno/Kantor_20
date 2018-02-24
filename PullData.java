
package kantor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class PullData 

{
   
  public double getRateEuro() throws MalformedURLException, IOException
  {       
      URL urlEuro = new URL ("http://api.nbp.pl/api/exchangerates/rates/A/eur/?format=JSON");
      URLConnection con = urlEuro.openConnection();
      InputStream is =con.getInputStream();
      BufferedReader br = new BufferedReader(new InputStreamReader(is));
      String line = null;  
        
      String numbers = line.substring(line.length() - 9);//WZIĘCIE OSTATNICH 9 ZNAKÓW
      numbers = numbers.substring(0, numbers.length() - 3);//USUNIĘCIE 3 OSTATNICH ZNAKÓW - NAWIASY
      double valueEuro = Double.parseDouble(numbers);            
      System.out.println("EURO: "+valueEuro); 
      return valueEuro;        
  }
  
  public void Druk()    //METODA SPRAWDZAJĄCA 
  {      
      
  }
  
    public double getRateDollar() throws MalformedURLException, IOException
  {
      URL urlDollar = new URL ("http://api.nbp.pl/api/exchangerates/rates/A/usd/?format=JSON");
      URLConnection con = urlDollar.openConnection();
      InputStream is =con.getInputStream();
      BufferedReader br = new BufferedReader(new InputStreamReader(is));
      String line = null;
        
      String numbers = line.substring(line.length() - 9);//WZIĘCIE OSTATNICH 9 ZNAKÓW
      numbers = numbers.substring(0, numbers.length() - 3);//USUNIĘCIE 3 OSTATNICH ZNAKÓW - NAWIASY
      double valueDollar = Double.parseDouble(numbers);            
      System.out.println("Dollar: "+valueDollar); 
      return valueDollar;
  }
    
      public double getRateFunt() throws MalformedURLException, IOException 
  {
      URL urlDollar = new URL ("http://api.nbp.pl/api/exchangerates/rates/a/gbp/?format=json");
      URLConnection con = urlDollar.openConnection();
      InputStream is =con.getInputStream();
      BufferedReader br = new BufferedReader(new InputStreamReader(is));
      String line = null;
        
      String numbers = line.substring(line.length() - 9);//WZIĘCIE OSTATNICH 9 ZNAKÓW
      numbers = numbers.substring(0, numbers.length() - 3);//USUNIĘCIE 3 OSTATNICH ZNAKÓW - NAWIASY
      double valueFunt = Double.parseDouble(numbers);            
      System.out.println("Funt: "+valueFunt); 
      return valueFunt;
  }
        
      public double getRateFrank() throws MalformedURLException, IOException
  {
      URL urlDollar = new URL ("http://api.nbp.pl/api/exchangerates/rates/a/chf/?format=JSON");
      URLConnection con = urlDollar.openConnection();
      InputStream is =con.getInputStream();
      BufferedReader br = new BufferedReader(new InputStreamReader(is));
      String line = null;
        
      String numbers = line.substring(line.length() - 9);//WZIĘCIE OSTATNICH 9 ZNAKÓW
      numbers = numbers.substring(0, numbers.length() - 3);//USUNIĘCIE 3 OSTATNICH ZNAKÓW - NAWIASY
      double valueFrank = Double.parseDouble(numbers);            
      System.out.println("Frank: "+valueFrank); 
      return valueFrank;        
  }   

}
