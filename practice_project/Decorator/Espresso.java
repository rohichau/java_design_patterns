package Decorator;

public class Espresso implements Beverage{

    Integer cost = 80;

    @Override
    public Integer cost() {
        // TODO Auto-generated method stub
        return cost;
    }

    @Override
    public String type() {
        return "I am an Espresso";
    }
    
}
