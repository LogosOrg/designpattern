package designpatterns.strategy;

public class Americano implements Coffee {
    public void moreCaffeine(){
        System.out.println("Americano needs more caffeine.");
    }

    public String getName(){
        return "Americano";
    }
}
