package designpatterns.strategy;

public class Capuchino implements Coffee {
    public void moreCaffeine(){
        System.out.println("Capuchino needs more caffeine.");
    }

    public String getName(){
        return "Capuchino";
    }
}
