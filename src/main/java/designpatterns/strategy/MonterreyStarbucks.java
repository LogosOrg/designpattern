package designpatterns.strategy;

public class MonterreyStarbucks extends Starbucks {
    public MonterreyStarbucks(){
        coffee = new Americano();
        milk = new MonterreyMilk();
    }
}
