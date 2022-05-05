package designpatterns.strategy;

public class MonterreyMilk implements Milk {
    public void moreProtein(){
        System.out.println("Milk from Toronto has more protein.");
    }

    public String getName(){
        return "MonterreyMilk";
    }
}
