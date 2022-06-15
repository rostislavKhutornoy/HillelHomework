package Task21.CoffeeTypes;

import Task21.Coffee;

public class Cappuccino extends Coffee {
    public Cappuccino(double cost) {
        super(cost);
    }

    @Override
    public void makeCoffee() {
        super.makeCoffee();
        System.out.println("Make cappuccino");
    }

    @Override
    public String toString() {
        return "Cappuccino - " + super.getCost() + "$";
    }
}
