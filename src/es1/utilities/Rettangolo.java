package es1.utilities;

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
    public double perimeter(){
        return (base + height) / 2;
    }

    public double area(){
        return base * height;
    }
}
