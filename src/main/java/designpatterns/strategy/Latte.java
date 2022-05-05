package designpatterns.strategy;

public class Latte implements Coffee {
    String caffeineStatus = "No thanks";

    public String getCaffeineStatus(){
        return this.caffeineStatus;
    }

    public void moreCaffeine() {
        this.caffeineStatus ="More Caffeine";
    }

    public String getName(){
        return "Latte";
    }

}
