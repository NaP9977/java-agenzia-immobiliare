package org.java.esercitazione;

public class Box extends Immobili {
    private int postiAuto;

    public Box(String codice, String indirizzo, int cap, String città, int superficie) {
        super(codice,indirizzo,cap,città,superficie);
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



