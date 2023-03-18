package Decorator;

public class Latte implements Beverage{

    Integer cost = 90;
    @Override
    public Integer cost() {
        // TODO Auto-generated method stub
        return cost;
    }

    @Override
    public String type() {
        return "I am a Latte";
    }
    
}
