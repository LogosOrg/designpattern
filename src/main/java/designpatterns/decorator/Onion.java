package designpatterns.decorator;

public class Onion extends CondimentDecorator{
    public Onion(Bibimbap bibimbap){
        this.bibimbap = bibimbap;
    }

    public String getDescription(){
        return bibimbap.getDescription() + ", Onion";
    }

    public double cost(){
        return bibimbap.cost() + 100;
    }
}
