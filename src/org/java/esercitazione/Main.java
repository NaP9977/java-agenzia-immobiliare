package org.java.esercitazione;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        AgenziaImmobiliare agenziaImmobiliare = new AgenziaImmobiliare();

        Box box = new Box ("123LKJMHG", "via Umberto eco", 3589, "Napoli", 200, 7);
Villa villa = new Villa("LKNT987", "Via Giordano Bruno", 3456, "Milano", 500, 5, 9, 500 );
Abitazione abitazione = new Abitazione("NNN777","Umberto Giordano", 5556, "Roma", 6, 700, 9);
Box box1 = new Box("LLL888", "Via I ottobre", 6667, "Torino", 700, 8);
agenziaImmobiliare.AggiungiImmobili(box);
agenziaImmobiliare.AggiungiImmobili(box1);
agenziaImmobiliare.AggiungiImmobili(villa);
agenziaImmobiliare.AggiungiImmobili(abitazione);
System.out.println("Inserisci il codice da cercare");
String codiceDacercare = "LLL888";

System.out.println(agenziaImmobiliare.CercaImmobile(codiceDacercare));


    }
}
