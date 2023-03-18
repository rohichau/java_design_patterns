package Decorator;

public class Mocha implements Beverage{

    Integer cost = 100;

    @Override
    public Integer cost() {
       return cost;
    }

    @Override
    public String type() {
        return "I am a Mocha";
    }
    
}
