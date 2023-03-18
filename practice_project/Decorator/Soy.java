package Decorator;

public class Soy extends Addon{

    Beverage bev;
    public static final Integer cost = 40;

    Soy(Beverage bev){
        this.bev = bev;
    }


    @Override
    public Integer cost() {
        return bev.cost() + cost;
    }

    @Override
    public String type() {
        return bev.type() + " and Soy";
    }
    
}
