
package kantor;

import java.io.IOException;


public class Kantor {

    public static void main(String[] args) throws IOException {
        Kantor kantor = new Kantor();
        kantor.run();
    }

    private void run() throws IOException {

        Obliczenia kantor = new Obliczenia(new UserInput());
        kantor.obliczenia();
        kantor.wyswietlWynik();

    }
}
