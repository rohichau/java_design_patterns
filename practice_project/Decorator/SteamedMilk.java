package Decorator;

public class SteamedMilk extends Addon{

    Beverage bev;
    public static final Integer cost = 30;

    SteamedMilk(Beverage bev){
        this.bev = bev;
    }


    @Override
    public Integer cost() {
        return bev.cost() + cost;
    }

    @Override
    public String type() {
        return bev.type() + "and Streamed Milk";
    }
    
}
