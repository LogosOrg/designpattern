package designpatterns.decorator.practice;

public abstract class CondimentDecorator extends Beverage {
    Beverage beverage;
    public abstract String getDescription();    
}
