package designpatterns.strategy;

public class Capuchino implements Coffee {
    String moreCaffeine = "No thanks";

    public void moreCaffeine(){
        this.moreCaffeine = "More caffeine";
    }

    public String getName(){
        return "Capuchino";
    }

    @Override
    public String getCaffeineStatus() {
        return this.moreCaffeine;
    }
}
