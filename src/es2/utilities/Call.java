package es2.utilities;

public class Call {
//    ATTRIBUTI
    private int durata;
    private String calledNumber;

//    COSTRUTTORE
    public Call(int durata, String calledNumber){
        this.durata = durata;
        this.calledNumber = calledNumber;
    }

    @Override
    public String toString() {
        return "Durata della chiamata: " + durata + ", numero chiamato: " + calledNumber;
    }
}
