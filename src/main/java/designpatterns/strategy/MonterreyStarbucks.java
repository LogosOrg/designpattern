package designpatterns.strategy;

public class MonterreyStarbucks extends Starbucks {
    public MonterreyStarbucks(){
        super("Monterrey");
        coffee = new Americano();
        milk = new MonterreyMilk();
    }
}
