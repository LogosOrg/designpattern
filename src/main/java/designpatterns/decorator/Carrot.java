package designpatterns.decorator;

public class Carrot extends CondimentDecorator{
    public Carrot(Bibimbap bibimbap){
        this.bibimbap = bibimbap;
    }

    public String getDescription(){
        return bibimbap.getDescription() + ", Carrot";
    }

    public double cost(){
        return bibimbap.cost() + 50;
    }
}
