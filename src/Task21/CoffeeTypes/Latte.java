package Task21.CoffeeTypes;

import Task21.Coffee;

public class Latte extends Coffee {
    public Latte(double cost) {
        super(cost);
    }

    @Override
    public void makeCoffee() {
        super.makeCoffee();
        System.out.println("Make latte");
    }

    @Override
    public String toString() {
        return "Latte - " + super.getCost() + "$";
    }
}
