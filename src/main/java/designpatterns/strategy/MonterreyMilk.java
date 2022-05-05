package designpatterns.strategy;

public class MonterreyMilk implements Milk {
    String proteinStatus = "No thanks";

    public void moreProtein(){
        this.proteinStatus = "More protein.";
    }

    public String getProteinStatus(){
        return this.proteinStatus;
    }

    public String getName(){
        return "MonterreyMilk";
    }
}
