package designpatterns.strategy;

public class TokyoStarbucks extends Starbucks {
    public TokyoStarbucks(){
        super("Tokyo");
        coffee = new Latte();
        milk = new TokyoMilk();
    }
}
