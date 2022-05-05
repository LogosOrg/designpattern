package designpatterns.strategy;

public class Americano implements Coffee {
    String moreCaffeine = "No thanks";

    public void moreCaffeine(){
        this.moreCaffeine = "More caffeine";
    }

    public String getName(){
        return "Americano";
    }

    @Override
    public String getCaffeineStatus() {
        return this.moreCaffeine;
    }

}
