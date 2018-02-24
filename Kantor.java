
package kantor;

public class Kantor {

    public static void main(String[] args) 
    {
        Kantor kantor = new Kantor();
        kantor.run();
    }

    private void run() 
    {
        Obliczenia kantor = new Obliczenia();
        double result = kantor.oblicz(new UserInput());
        System.out.println(result);
    }
}
