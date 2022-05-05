package designpatterns.strategy;

public abstract class Starbucks {
    Coffee coffee;
    Milk milk;
    String city;

    public Starbucks(String city){
        this.city = city;
    }

    public void setCoffee(Coffee cf){
        coffee = cf;
    }

    public void setMilk(Milk mk){
        milk = mk;
    }

    public void display(){
        System.out.println("-----------------------------------");
        System.out.println("City : " + this.city);
        System.out.println("Coffee : " + coffee.getName());
        System.out.println("Milk : " + milk.getName());
        System.out.println("More Caffeine : " + coffee.getCaffeineStatus());
        System.out.println("More Protein : " + milk.getProteinStatus());
        System.out.println("-----------------------------------");

    };

    public void moreCaffeine(){
        coffee.moreCaffeine();
    }
    
    public void moreProtein(){
        milk.moreProtein();
    }

   
    
}
