
package kantor;

public class Kantor {

    public static void main(String[] args) {
        Kantor kantor = new Kantor();
        kantor.run();
    }

    private void run() {

        Obliczenia kantor = new Obliczenia(new UserInput());
        kantor.obliczenia();
        kantor.wyswietlWynik();

    }
}
