
package org.java.esercitazione;

import java.util.Scanner;

public class Villa extends Abitazione{
   private  int mqGiardino;

    public Villa(String codice, String indirizzo, int cap, String città, int superficie) {
        super(codice, indirizzo, cap, città, superficie);
        this.mqGiardino = mqGiardino;
    }

    public int getMqGiardino() {
        return mqGiardino;
    }

    public int ReimpostaSuperficie (int superficie, int mqGiardino){
        Scanner scan = new Scanner(System.in);
        int nuovaSuperficie = Integer.parseInt(scan.nextLine());
        return mqGiardino = nuovaSuperficie;
    }

    @Override
    public String toString() {
        return "Villa{" +
                "mqGiardino=" + mqGiardino +
                '}';
    }
}
