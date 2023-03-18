package Decorator;

public class Driver {
    
    public static void main(String [] args){
        Beverage coffee  = new WhipCream(new SteamedMilk(new Soy(new Cappuccino())));
        System.out.printf("Price: " + coffee.cost() + "Type: " + coffee.type());
    }
}
