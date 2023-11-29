package es1;

public class Rettangolo {

//    ATTRIBUTI
    public double height;
    public double base;

//  COSTRUTTORI
    public Rettangolo(double base, double height){
        this.base = base;
        this.height = height;
    }

//  METODI
    public static double perimeter( double b, double h){
        return (b + h) / 2;
    }

    public static double area( double b, double h){
        return b * h;
    }
}
