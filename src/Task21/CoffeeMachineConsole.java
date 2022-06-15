package Task21;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class CoffeeMachineConsole {

    static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void MakeOrder() {
        ArrayList<Coffee> coffees = new ArrayList<Coffee>();
        CoffeeFactory coffeeFactory = new CoffeeFactory();
        CoffeeMachine coffeeMachine = new CoffeeMachine(coffeeFactory);

        System.out.println("Available drinks:");
        System.out.println("1 - Americano\n2 - Cappuccino\n3 - Latte\n4 - Tea");
        double choice;
        double totalCost = 0;
        while (true) {
            System.out.print("Enter drink number (0 - finish order): ");
            while (true) {
                try {
                    choice = Integer.parseInt(READER.readLine());
                    break;
                } catch (Exception exception) {
                    System.out.println("Input error, please try again.");
                    System.out.print("Enter drink number (0 - finish order): ");
                }
            }
            if (choice == 0) {
                System.out.println("Drink selection is over.");
                System.out.println("You ordered: ");
                break;
            } else if (choice == 1) {
                coffees.add(coffeeMachine.orderCoffee(CoffeeType.AMERICANO));
            } else if (choice == 2) {
                coffees.add(coffeeMachine.orderCoffee(CoffeeType.CAPPUCCINO));
            } else if (choice == 3) {
                coffees.add(coffeeMachine.orderCoffee(CoffeeType.LATTE));
            } else if (choice == 4) {
                coffees.add(coffeeMachine.orderCoffee(CoffeeType.TEA));
            } else {
                System.out.println("This action does not exist, please try again.");
            }
        }
        for (Coffee coffee : coffees) {
            System.out.println(coffee.toString());
            totalCost += coffee.getCost();
        }
        System.out.println("The total order value: " + totalCost + "$");
        System.out.println("Your drinks will be ready now, please wait a moment.");
        for (Coffee coffee : coffees) {
            coffee.makeCoffee();
        }
        System.out.println("Thanks for your order.");
    }
}
