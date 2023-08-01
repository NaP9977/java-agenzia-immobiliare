//Definire per ciascuna delle tre classi il metodo toString() in modo da fornire una descrizione completa dell’immobile.
//Definire nella classe Immobile il metodo reimpostaSuperfici che prende in input
// la nuova superficie.
//Implementare nella classe Villa l’overload di questo metodo.
// In questo caso prenderà i parametri superficie e superficieGiardino.
//Definire una classe AgenziaImmobiliare che contiene una lista di immobili e presenta
//un metodo per aggiungere un immobile
//un metodo per la ricerca di un immobile a partire dal codice alfanumerico
//un metodo per restituire l’immobile che ha avuto il maggior numero di persone interessate
//Creare una classe Main con metodo main nel quale testare tutte le funzionalità
// delle classi (modificato)
package org.java.esercitazione;

import java.util.ArrayList;

public class AgenziaImmobiliare {
    private ArrayList<Immobili> listaImmobili;

    public AgenziaImmobiliare() {
        this.listaImmobili = new ArrayList<>();
    }

    public void aggiungiImmobili(Immobili immobile) {
        listaImmobili.add(immobile);
    }

    public Immobili cercaImmobile(String codice) {

        for (Immobili immobile : listaImmobili) {

            if (codice.equals(immobile.getCodice())) {
                return immobile;

            }
        }
        return null;
    }


    public void aumentoPersoneInteressate(String codice, int personeInteressate) {
        for (Immobili immobili : listaImmobili) {
            if (codice.equals(immobili.getCodice())) {
                immobili.incrementaPersoneInteressate();
                break;
            }
        }
    }

    public Immobili trovaImmobilePiùPopolare() {
        Immobili immobilePopolare = null;
        for (Immobili immobile : listaImmobili) {
            if (immobile.getPersoneInteressate() > immobilePopolare.getPersoneInteressate()) {
                immobilePopolare = immobile;
            }
        }
        return immobilePopolare;
    }

    @Override
    public String toString() {
        return "AgenziaImmobiliare:" +
                "listaImmobili=" + listaImmobili +
                '}';
    }

}



