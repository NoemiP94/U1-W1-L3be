package es2.utilities;

import java.util.ArrayList;

public class SIM {
//        ATTRIBUTI
    private String phoneNumber;
    private double availableCredit;
    private ArrayList<Call> lastFiveCalls;



    //    COSTRUTTORE
    public SIM(String phoneNumber){
        this.phoneNumber = phoneNumber;
        this.availableCredit = 0;
        this.lastFiveCalls = new ArrayList<>();
    }
//    METODI
    public void makeCall(int durata, String calledNumber){
        if(availableCredit > 0){
            lastFiveCalls.add(new Call(durata, calledNumber));
            availableCredit -= durata * 0.3;
        }else{
            System.out.println("Caricare la SIM! Credito insufficiente!");
        }
    }

    public void addCredit( double money){
        availableCredit += money;
    }

    public void stampaDatiSIM(){
        System.out.println("Numero di telefono: " + phoneNumber);
        System.out.println("Credito disponibile: " + availableCredit + " €");
        System.out.println("Ultime cinque chiamate: ");
        for(int i = Math.max(0, lastFiveCalls.size() - 5); i < lastFiveCalls.size(); i++){
            System.out.println("Chiamata " + (i + 1) + ": " + lastFiveCalls.get(i));
        }
    }

}
