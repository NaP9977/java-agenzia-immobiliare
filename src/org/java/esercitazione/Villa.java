
package org.java.esercitazione;

public class Villa extends Abitazione {
    private int mqGiardino;

    public Villa(String codice, String indirizzo, int cap, String città,  int superficie, int vani, int bagni, int mqGiardino) {
        super(codice, indirizzo, cap, città, superficie, vani, bagni);
        this.mqGiardino = mqGiardino;
    }

    public int getMqGiardino() {
        return mqGiardino;
    }

    @Override
    public int ReimpostaSuperficie(int superficie) {
        return super.ReimpostaSuperficie(superficie);
    }

    public void ReimpostaSuperficie(int superficie, int nuovoMqGiardino) {
        super.ReimpostaSuperficie(superficie);
        this.mqGiardino = nuovoMqGiardino;
    }

    @Override
    public String toString() {
        return "Villa: " +
                "mq Giardino = " + getMqGiardino() +  "codice = " + "indirizzo = " + getIndirizzo() + "città = " + getCittà() + "superficie =" + getSuperficie();
    }

    }


