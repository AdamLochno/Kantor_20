
package kantor;

import java.io.IOException;


public class Kantor {

    public static void main(String[] args) throws IOException {
        Kantor kantor = new Kantor();
        kantor.run();
    }

    private void run() throws IOException {
        PushData pushdata = new PushData();
        pushdata.PushData();

        PullData pulldata = new PullData();
        pulldata.getRateEuro();
        pulldata.getRateDollar();
        pulldata.getRateFunt();
        pulldata.getRateFrank();
        pulldata.Druk();

        Obliczenia kantor = new Obliczenia();
        kantor.obliczenia();

        kantor.wyswietlWynik();
    }

}
