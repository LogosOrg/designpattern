package designpatterns.decorator;

public abstract class CondimentDecorator extends Bibimbap{
    Bibimbap bibimbap;
    public abstract String getDescription();
}
