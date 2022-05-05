package designpatterns.strategy;

public abstract class Starbucks {
    Coffee coffee;
    Milk milk;

    public Starbucks(){

    }

    public void setCoffee(Coffee cf){
        coffee = cf;
    }

    public void setMilk(Milk mk){
        milk = mk;
    }

    public void display(){
        
        System.out.println(coffee.getName() + milk.getName());
    };

    public void moreCaffeine(){
        coffee.moreCaffeine();
    }
    
    public void moreProtein(){
        milk.moreProtein();
    }
    
}
