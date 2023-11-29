package es2;

import es2.utilities.SIM;

public class Main {
    public static void main(String[] args) {
        SIM sim = new SIM("3485769571");

//        DATI INIZIALI
        System.out.println("Dati della SIM: ");
        sim.stampaDatiSIM();

//        CHIAMATE ESEMPIO

        sim.addCredit(15);
        sim.makeCall(5, "123456789");
        sim.makeCall(3, "987654321");
        sim.makeCall(15, "963258741");
        sim.makeCall(4,"147852369");
        sim.makeCall(2,"547896321");

//        DATI AGGIORNATI
        System.out.println("Dati aggiornati della SIM: ");
        sim.stampaDatiSIM();


    }
}
