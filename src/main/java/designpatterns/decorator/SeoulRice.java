package designpatterns.decorator;

public class SeoulRice extends Bibimbap {
    public SeoulRice(){
        
    }
    public String getDescription(){
        return "SeoulRice";
    }

    public double cost(){
        return 2000;
    }
}
