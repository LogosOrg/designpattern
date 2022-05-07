package designpatterns.decorator;

public abstract class Bibimbap {
    String description = "Rice";
    public String getDescription(){
        return description;
    }

    public abstract double cost();
}
