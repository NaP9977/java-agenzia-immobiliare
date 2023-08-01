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

public class Immobili extends AgenziaImmobiliare {
    private String codice;
    private String indirizzo;
    private int cap;
    private String città;
    private int superficie;
    private int personeInteressate;


    public Immobili(String codice, String indirizzo, int cap, String città, int superficie) {
        this.codice = codice;
        this.indirizzo = indirizzo;
        this.cap = cap;
        this.città = città;
        this.superficie = superficie;
        this.personeInteressate = 0;

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



    public int getCap() {
        return cap;
    }



    public String getCittà() {
        return città;
    }



    public int reimpostaSuperficie(int superificie) {
        Scanner scan = new Scanner(System.in);
        int nuovaSuperficie = Integer.parseInt(scan.nextLine());
        return superificie = nuovaSuperficie;
    }

    public int getPersoneInteressate() {
        return personeInteressate;
    }

    public void incrementaPersoneInteressate() {
        personeInteressate++;
    }

    @Override
    public String toString() {
        return "Immobili:" +
                "codice='" + codice + '\'' +
                ", indirizzo='" + indirizzo + '\'' +
                ", cap=" + cap +
                ", città='" + città + '\'' +
                ", superficie=" + superficie +
                ", personeInteressate=" + personeInteressate +
                '}';
    }
}











