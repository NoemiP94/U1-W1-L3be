package es3.utilities;

import java.util.ArrayList;
import java.util.List;

public class Carrello {
//    ATTRIBUTI
    private Cliente customer;
    private List<Articolo> elencoArticoli;
    private double totale;

//    COSTRUTTORE
    public Carrello(Cliente customer){
        this.customer = customer;
        this.elencoArticoli = new ArrayList<>();
        this.totale = 0.0;
    }

//    METODI
    public void addArticle(Articolo article){
        elencoArticoli.add(article);
        totale += article.getPrezzo();
    }

    public void removeArticle(Articolo article){
        elencoArticoli.remove(article);
        totale -= article.getPrezzo();
    }

    public void printDetails(){
        System.out.println("Cliente: " + customer.getNomeCognomeCliente());
        System.out.println("Lista degli articoli presenti nel carrello");
        for(Articolo article : elencoArticoli){
            System.out.println(" " + article.getDescrizioneArticolo() + " - prezzo: " + article.getPrezzo() + " €");
        }
        System.out.println("Totale costo degli articoli: " + totale + " €");
    }
}
