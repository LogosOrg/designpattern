package designpatterns.decorator.practice;

public class Espresso extends Beverage{
    public Espresso() {
        description = "Coffee(Espresso)";
    }

    public double cost() {
        return 1.99;
    }


    
}
