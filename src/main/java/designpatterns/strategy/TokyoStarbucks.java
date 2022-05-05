package designpatterns.strategy;

public class TokyoStarbucks extends Starbucks {
    public TokyoStarbucks(){
        coffee = new Latte();
        milk = new TokyoMilk();
    }
}
