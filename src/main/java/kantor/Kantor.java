
package kantor;

import java.io.IOException;

public class Kantor {

    public static void main(String[] args){
        Kantor kantor = new Kantor();
        kantor.run();
    }

    private void run(){
       Obliczenia kantor = new Obliczenia(); 
       try{       
       double result = kantor.obliczenia(new UserInput()); 
        
       //result TO JEST WYNIK OBLICZEŃ
       System.out.printf("%2.2f,\n",result);
        }
        catch(IOException e){
            System.out.println("Wystąpił wyjątek");
        }
        }
       //double inne=ojro.getRateEuro();
       //System.out.println(inne);        
    }

