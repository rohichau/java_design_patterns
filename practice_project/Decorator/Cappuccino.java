package Decorator;

public class Cappuccino implements Beverage{

    Integer cost = 60;

    @Override
    public Integer cost() {
        return cost;
    }

    @Override
    public String type() {
        return "I am an Cappuccino";
    }
    
}
