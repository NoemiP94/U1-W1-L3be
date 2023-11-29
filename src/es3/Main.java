package es3;

import es3.utilities.Articolo;
import es3.utilities.Carrello;
import es3.utilities.Cliente;

public class Main {
    public static void main(String[] args) {
        Cliente customer1 = new Cliente(1 , "Gianni Morandi", "giannim@gmail.com", "25/07/2023");
        Articolo art1 = new Articolo(70,"Barbecue", 170.99, 5);
        Articolo art2 = new Articolo(25, "Smarthphone", 250.50, 15);
        Articolo art3 = new Articolo(10, "SmartTV", 758.99, 10);

        Carrello gianniChart = new Carrello(customer1);
        gianniChart.addArticle(art1);
        gianniChart.addArticle(art2);
        gianniChart.addArticle(art3);

        gianniChart.printDetails();
    }
}
