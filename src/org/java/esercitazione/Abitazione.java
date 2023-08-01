package org.java.esercitazione;

public class Abitazione extends Immobili {
   private  int vani;
   private  int bagni;


    public Abitazione(String codice, String indirizzo, int cap, String città, int vani, int superficie, int bagni) {
        super(codice, indirizzo, cap, città, superficie);
        this.vani = vani;
        this.bagni = bagni;
    }




    public int getVani() {
        return vani;
    }

    public int getBagni() {
        return bagni;
    }




    @Override
    public String toString() {
        return "Abitazione: " +
                " vani=" + vani +
                ", bagni=" + bagni + "codice = " + "indirizzo = " + getIndirizzo() + "città = " + getCittà() + "superficie =" + getSuperficie();

    }
}
