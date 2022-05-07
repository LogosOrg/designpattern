package designpatterns.decorator.practice;

public abstract class Beverage {
    public enum Size { TALL, GRANDE, VENTI };
    Size size = Size.TALL;
    
    String description = "default value";
    public String getDescription(){
        return description;
    }
    public void setSizeTALL(){
        this.size = Size.TALL;
    }
    public void setSizeGRANDE(){
        this.size = Size.GRANDE;
    }
    public void setSizeVENTI(){
        this.size = Size.VENTI;
    }
    public Size getSize() {
        return this.size;
    }
    public abstract double cost();
}
