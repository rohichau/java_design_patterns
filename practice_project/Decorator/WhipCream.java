package Decorator;

public class WhipCream extends Addon{

    Beverage bev;
    public static final Integer cost = 50;

    WhipCream(Beverage bev){
        this.bev = bev;
    }

    @Override
    public Integer cost() {
        return bev.cost() + cost;
    }

    @Override
    public String type() {
        return bev.type() + " and Whip cream";
    }
    
}
