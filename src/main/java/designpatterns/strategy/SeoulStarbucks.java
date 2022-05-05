package designpatterns.strategy;

public class SeoulStarbucks extends Starbucks {
    public SeoulStarbucks(){
        coffee = new Capuchino();
        milk = new SeoulMilk();
    }
}