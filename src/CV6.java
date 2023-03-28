public class CV6 {
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
        for (Farba f : Farba.values()) {
            if (f.isCierna()) {
                System.out.println(f + " je cierna.");
            } else {
                System.out.println(f + " nie je cierna.");
            }
        }
    }
}
