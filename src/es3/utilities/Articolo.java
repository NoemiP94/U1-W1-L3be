package es3.utilities;

public class Articolo {
//    ATTRIBUTI
    private int codiceArticolo;
    private String descrizioneArticolo;
    private double prezzo;
    private int pezziDisponibili;

//    GETTER
    public int getCodiceArticolo() {
        return this.codiceArticolo;
    }

    public String getDescrizioneArticolo() {
        return this.descrizioneArticolo;
    }

    public double getPrezzo() {
        return this.prezzo;
    }

    public int getPezziDisponibili() {
        return this.pezziDisponibili;
    }

    //    COSTRUTTORE
    public Articolo(int codiceArticolo, String descrizioneArticolo, double prezzo, int pezziDisponibili){
        this.codiceArticolo = codiceArticolo;
        this.descrizioneArticolo = descrizioneArticolo;
        this.prezzo = prezzo;
        this.pezziDisponibili = pezziDisponibili;

    }

//    METODI
    public static void stampaArticolo(Articolo article){
        System.out.println("Codice articolo: " + article.codiceArticolo + "; descrizione: " + article.descrizioneArticolo +
                "; prezzo: " + article.prezzo + " €; pezzi disponibili in magazzino: " + article.pezziDisponibili);
    }
}
