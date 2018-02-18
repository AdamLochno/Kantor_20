
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
            System.out.println("EURO"+line);
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
            System.out.println("Dolar"+line);
        }
  }
    
    
    
}
