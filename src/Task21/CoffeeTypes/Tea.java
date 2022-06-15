package Task21.CoffeeTypes;

import Task21.Coffee;

public class Tea extends Coffee {
    public Tea(double cost) {
        super(cost);
    }

    @Override
    public void makeCoffee() {
        super.makeCoffee();
        System.out.println("Make tea");
    }

    @Override
    public String toString() {
        return "Tea - " + super.getCost() + "$";
    }
}
