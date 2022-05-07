package designpatterns.decorator;

public class Egg extends CondimentDecorator{
    public Egg(Bibimbap bibimbap){
        this.bibimbap = bibimbap;
    }

    public String getDescription(){
        return bibimbap.getDescription() + ", Egg";
    }

    public double cost(){
        return bibimbap.cost() + 200;
    }
}
