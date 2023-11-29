package es1;


import es1.utilities.Rettangolo;

public class Main {
    public static void main(String[] args) {
        Rettangolo rectangle1 = new Rettangolo(10.5, 5.5);
        Rettangolo rectangle2 = new Rettangolo(4,7.5);

        System.out.println(stampaRettangolo(rectangle1));
        System.out.println(stampaDueRettangoli(rectangle1, rectangle2));


    }

    public static String stampaRettangolo(Rettangolo rect){
        return "L'area del rettangolo è di: " + rect.area() + " e il suo perimetro è " + rect.perimeter();
    }

    public static String stampaDueRettangoli(Rettangolo rect1, Rettangolo rect2){
        return "L'area del primo rettangolo è " + rect1.area() + " e il suo perimetro è " + rect1.perimeter() + "; l'area del secondo rettangolo è "
                + rect2.area() + " e il suo perimetro è " + rect2.perimeter() + "; la somma dell'area dei due rettangoli è " + (rect1.area() + rect2.area()) +
                " e la somma del perimetro dei due rettangoli è " + (rect1.perimeter() + rect2.perimeter());
    }
}