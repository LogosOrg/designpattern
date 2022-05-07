package designpatterns.decorator.practice;

public class DarkRoast extends Beverage{
    public DarkRoast() {
        description = "Coffee(Dark Roast)";
    }
    public double cost() {
        switch (getSize()){
            case TALL:
                return 1;
            case GRANDE:
                return 2;
            case VENTI:
                return 3;
            default:
                return 1;
        }   
    }
    
}
