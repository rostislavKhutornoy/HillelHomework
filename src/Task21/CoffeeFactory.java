package Task21;

import Task21.CoffeeTypes.Americano;
import Task21.CoffeeTypes.Cappuccino;
import Task21.CoffeeTypes.Latte;
import Task21.CoffeeTypes.Tea;

public class CoffeeFactory {
    public Coffee createCoffee (CoffeeType type) {
        Coffee coffee = null;

        switch (type) {
            case AMERICANO:
                coffee = new Americano(1.5);
                break;
            case CAPPUCCINO:
                coffee = new Cappuccino(2);
                break;
            case LATTE:
                coffee = new Latte(1.8);
                break;
            case TEA:
                coffee = new Tea(1.3);
                break;
        }
        return coffee;
    }
}
