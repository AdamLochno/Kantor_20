
package kantor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class PushData 

{
    public int wartosc1;
    public String waluta1,waluta2;
    
    public void PushData() throws IOException
    {
         //WPROWADZENIE WARTOŚCI
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Wprowadź wartość do obliczeń:");
        wartosc1 = Integer.parseInt(br.readLine());
        
        System.out.println("Wybierz walutę początkową ZLOTY,EURO,DOLLAR,FUNT,FRANK:");
        waluta1 = br.readLine();
        
        System.out.println("Wybierz walutę docelową ZLOTY,EURO,DOLLAR,FUNT,FRANK:");
        waluta2 = br.readLine();
        
        //ZMIANA WARTOŚCI NA MAŁE ZNAKI       
        waluta1 = waluta1.replaceAll("[^a-zA-Z]+","").toLowerCase();
        waluta2 = waluta2.replaceAll("[^a-zA-Z]+","").toLowerCase();
        
        System.out.println("a:"+wartosc1 +" waluta1:"+waluta1+" waluta2:"+waluta2);   
    }
}