////Si vuole progettare un’applicazione in grado di gestire un’agenzia immobiliare.
////Gli immobili sono caratterizzati da:
////un codice alfanumerico,
////indirizzo,
////cap,
////città
////una superficie espressa in mq attraverso un numero intero.
////Definire all’interno della classe Immobile un attributo per memorizzare il
//// numero di persone interessate all’acquisto e aggiungere un metodo per
//// incrementare questo numero.
package org.java.esercitazione;

import java.util.Scanner;

public class Immobili {
   private  String codice;
   private  String indirizzo;
   private  int cap;
   private  String città;
    private int superficie;

    public Immobili(String codice, String indirizzo, int cap, String città, int superficie){
        this.codice = this.codice;
        this.indirizzo = this.indirizzo;
        this.cap = this.cap;
        this.città = this.città;
        this.superficie = this.superficie;

    }

    public int getSuperficie() {
        return superficie;
    }



    public String getCodice() {
        return codice;
    }



    public String getIndirizzo() {
        return indirizzo;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    public int getCap() {
        return cap;
    }

    public void setCap(int cap) {
        this.cap = cap;
    }

    public String getCittà() {
        return città;
    }

    public void setCittà(String città) {
        this.città = città;
    }

    public int ReimpostaSuperficie(int superificie){
        Scanner scan = new Scanner(System.in);
        int nuovaSuperficie = Integer.parseInt(scan.nextLine());
        return superificie = nuovaSuperficie;
    }

    @Override
    public String toString() {
        return "Immobili{" +
                "codice='" + codice + '\'' +
                ", indirizzo='" + indirizzo + '\'' +
                ", cap=" + cap +
                ", città='" + città + '\'' +
                ", superficie=" + superficie +
                '}';
    }
}
