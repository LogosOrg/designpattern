package designpatterns.decorator.practice;

public class Mocha extends CondimentDecorator {
    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    public double cost() {
        switch (beverage.getSize()) {
            case TALL:
                return beverage.cost() + .30;
            case GRANDE: 
                return beverage.cost() + .50;
            case VENTI:
                return beverage.cost() + .70;
            default: 
                return beverage.cost();
        }
    }
}
