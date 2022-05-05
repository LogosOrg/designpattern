package designpatterns.strategy;

public class Latte implements Coffee {
    public void moreCaffeine() {
        System.out.println("Late needs More Caffeine");
    }

    public String getName(){
        return "Latte";
    }
}
