package designpatterns.decorator.practice;

public class HouseBlend extends Beverage {
    public HouseBlend(){
        description = "Coffee(House Blend)";
    }

    public double cost() {
        return .89;
    }
    
}
