package designpatterns.strategy;

public class SeoulStarbucks extends Starbucks {
    public SeoulStarbucks(){
        super("Seoul");
        coffee = new Capuchino();
        milk = new SeoulMilk();
    }
}