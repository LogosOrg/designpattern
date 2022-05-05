package designpatterns.strategy;

public class SeoulMilk implements Milk {
    public void moreProtein(){
        System.out.println("Milk from Seoul has more protein.");
    }
    public String getName(){
        return "SeoulMilk";
    }
}