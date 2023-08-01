package org.java.esercitazione;

public class Box extends Immobili {
    private int postiAuto;


    public Box(String codice, String indirizzo, int cap, String città, int superficie, int personeInteressate) {
        super(codice,indirizzo,cap,città, superficie, superficie, personeInteressate);
        this.postiAuto = postiAuto;
    }

    public int getPostiAuto() {
        return postiAuto;
    }




    @Override
    public String toString() {
        return "Box{" +
                "postiAuto=" + postiAuto +
                '}';
    }
}



