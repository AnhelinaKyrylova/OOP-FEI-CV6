import javax.swing.JFrame;

public class Main {

    // Definujem enum mimo metódy main
    enum Farba {
        CERNA(true),
        MODRA(false),
        ZELENA(false),
        CERVENA(false),
        ZLTA(false);

        private boolean jeCierna;

        Farba(boolean jeCierna) {
            this.jeCierna = jeCierna;
        }

        public boolean isCierna() {
            return jeCierna;
        }
    }

    public static void main(String[] args) {
        // Vytvárame nové okno
        JFrame okno = new JFrame("Moj prvy program");
        okno.setSize(400, 300); // Nastavím veľkosť okna na 400 x 300 pixelov
        okno.setVisible(true); // Nastavím viditeľnosť okna na true

        // Prechádzam cez všetky hodnoty enumu Farba a vypisujeme, či sú čierne alebo nie
        for (Farba f : Farba.values()) {
            if (f.isCierna()) {
                System.out.println(f + " je cierna.");
            } else {
                System.out.println(f + " nie je cierna.");
            }
        }
    }

}