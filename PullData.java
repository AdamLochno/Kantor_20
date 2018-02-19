
package kantor_2.pkg0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class PullData 

{

  public void getRateEuro() throws MalformedURLException, IOException
  {
      
      URL urlEuro = new URL ("http://api.nbp.pl/api/exchangerates/rates/A/eur/?format=JSON");
      URLConnection con = urlEuro.openConnection();
        InputStream is =con.getInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(is));

        String line = null;
        
        // read each line and write to System.out
        while ((line = br.readLine()) != null) 
        {
            String numbers = line.substring(line.length() - 9);//WZIĘCIE OSTATNICH 9 ZNAKÓW
            numbers = numbers.substring(0, numbers.length() - 3);//USUNIĘCIE 3 OSTATNICH ZNAKÓW - NAWIASY
            double value = Double.parseDouble(numbers);            
            System.out.println("EURO: "+value);
        }
  }
    public void getRateDollar() throws MalformedURLException, IOException
  {
      URL urlDollar = new URL ("http://api.nbp.pl/api/exchangerates/rates/A/usd/?format=JSON");
      URLConnection con = urlDollar.openConnection();
        InputStream is =con.getInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(is));

        String line = null;

        // read each line and write to System.out
        while ((line = br.readLine()) != null) 
        {
            String numbers = line.substring(line.length() - 9);//WZIĘCIE OSTATNICH 9 ZNAKÓW
            numbers = numbers.substring(0, numbers.length() - 3);//USUNIĘCIE 3 OSTATNICH ZNAKÓW - NAWIASY
            double value = Double.parseDouble(numbers);            
            System.out.println("Dollar: "+value);
        }
  }
      public void getRateFunt() throws MalformedURLException, IOException //TRZEBA ODWOŁANIE DO STRONY ZMIENIĆ
  {
      URL urlDollar = new URL ("http://api.nbp.pl/api/exchangerates/rates/a/gbp/last/10/?format=json");
      URLConnection con = urlDollar.openConnection();
        InputStream is =con.getInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(is));

        String line = null;

        // read each line and write to System.out
        while ((line = br.readLine()) != null) 
        {
            String numbers = line.substring(line.length() - 9);//WZIĘCIE OSTATNICH 9 ZNAKÓW
            numbers = numbers.substring(0, numbers.length() - 3);//USUNIĘCIE 3 OSTATNICH ZNAKÓW - NAWIASY
            double value = Double.parseDouble(numbers);            
            System.out.println("Funt: "+value);
        }
  }
        public void getRateFrank() throws MalformedURLException, IOException
  {
        URL urlDollar = new URL ("http://api.nbp.pl/api/exchangerates/rates/a/chf/?format=JSON");
        URLConnection con = urlDollar.openConnection();
        InputStream is =con.getInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(is));

        String line = null;

        // read each line and write to System.out
        while ((line = br.readLine()) != null) 
        {
            String numbers = line.substring(line.length() - 9);//WZIĘCIE OSTATNICH 9 ZNAKÓW
            numbers = numbers.substring(0, numbers.length() - 3);//USUNIĘCIE 3 OSTATNICH ZNAKÓW - NAWIASY
            double value = Double.parseDouble(numbers);
value=value+2;            
            System.out.println("Frank: "+value);
        }
  }
    
    
    
}
