package designpatterns.strategy;

public class TokyoMilk implements Milk {
    public void moreProtein(){
        System.out.println("Milk from Tokyo has more protein.");
    }
    public String getName(){
        return "TokyoMilk";
    }
}
