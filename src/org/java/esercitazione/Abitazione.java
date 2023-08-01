package org.java.esercitazione;

public class Abitazione extends Immobili {
   private  int vani;
   private  int bagni;


    public Abitazione(String codice, String indirizzo, int cap, String città, int i, int superficie, int personeInteressate) {
        super(codice, indirizzo, cap, città, superficie, superficie, personeInteressate);
    }

    public int getVani() {
        return vani;
    }

    public int getBagni() {
        return bagni;
    }


    @Override
    public String toString() {
        return "Abitazione{" +
                "vani=" + vani +
                ", bagni=" + bagni +
                '}';
    }
}
