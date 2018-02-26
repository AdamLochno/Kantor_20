
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
   
  public double getRateEuro() throws MalformedURLException, IOException{       
      URL urlEuro = new URL ("http://api.nbp.pl/api/exchangerates/rates/A/eur/?format=JSON");
      URLConnection con = urlEuro.openConnection();
      InputStream is =con.getInputStream();
      BufferedReader br = new BufferedReader(new InputStreamReader(is));
      String line = null; 
      
      double valueEuro=0;
      while ((line = br.readLine()) !=null){
      String numbers = line.substring(line.length() - 9);//WZIĘCIE OSTATNICH 9 ZNAKÓW
      numbers = numbers.substring(0, numbers.length() - 3);//USUNIĘCIE 3 OSTATNICH ZNAKÓW - NAWIASY
      valueEuro = Double.parseDouble(numbers);            
      System.out.println("EURO: "+valueEuro); //SPRAWDZENIE ILE WART JEST EURO
             
  }      
      return valueEuro; 
       
}  
    public double getRateDollar() throws MalformedURLException, IOException{
      URL urlDollar = new URL ("http://api.nbp.pl/api/exchangerates/rates/A/usd/?format=JSON");
      URLConnection con = urlDollar.openConnection();
      InputStream is =con.getInputStream();
      BufferedReader br = new BufferedReader(new InputStreamReader(is));
      String line = null;
      
      double valueDollar=0;
      while ((line = br.readLine()) !=null){
      String numbers = line.substring(line.length() - 9);//WZIĘCIE OSTATNICH 9 ZNAKÓW
      numbers = numbers.substring(0, numbers.length() - 3);//USUNIĘCIE 3 OSTATNICH ZNAKÓW - NAWIASY
      valueDollar = Double.parseDouble(numbers);
      System.out.println("Dollar: "+valueDollar); //SPRAWDZENIE ILE WART JEST DOLLAR
      }
      return valueDollar;
  
}    
      public double getRateFunt() throws MalformedURLException, IOException{
      URL urlDollar = new URL ("http://api.nbp.pl/api/exchangerates/rates/a/gbp/?format=json");
      URLConnection con = urlDollar.openConnection();
      InputStream is =con.getInputStream();
      BufferedReader br = new BufferedReader(new InputStreamReader(is));
      String line = null;
      
      double valueFunt=0;
      while ((line = br.readLine()) !=null){
      String numbers = line.substring(line.length() - 9);//WZIĘCIE OSTATNICH 9 ZNAKÓW
      numbers = numbers.substring(0, numbers.length() - 3);//USUNIĘCIE 3 OSTATNICH ZNAKÓW - NAWIASY
      valueFunt = Double.parseDouble(numbers);            
      System.out.println("Funt: "+valueFunt); //SPRAWDZENIE ILE WART JEST FUNT
      }
      return valueFunt;
  }
        
      public double getRateFrank() throws MalformedURLException, IOException{
      URL urlDollar = new URL ("http://api.nbp.pl/api/exchangerates/rates/a/chf/?format=JSON");
      URLConnection con = urlDollar.openConnection();
      InputStream is =con.getInputStream();
      BufferedReader br = new BufferedReader(new InputStreamReader(is));
      String line = null;
      
      double valueFrank=0;
      while ((line = br.readLine()) !=null){
      String numbers = line.substring(line.length() - 9);//WZIĘCIE OSTATNICH 9 ZNAKÓW
      numbers = numbers.substring(0, numbers.length() - 3);//USUNIĘCIE 3 OSTATNICH ZNAKÓW - NAWIASY
      valueFrank = Double.parseDouble(numbers);            
      System.out.println("Frank: "+valueFrank); 
      System.out.println("Frank: "+valueFrank); //SPRAWDZENIE ILE WART JEST FRANK
      }
      return valueFrank;        
  }   

}
