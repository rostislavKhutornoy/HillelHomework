package Converter.Degrees;

import Converter.Interfaces.Converter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fahrenheit implements Converter {

    double temperature;

    public Fahrenheit(double temperature) {
        this.temperature = temperature;
    }

    static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    @Override
    public void convert() {
        double choice;
        double newTemperature;
        System.out.println("Select a new temperature unit");
        System.out.println("1 - Celsius; 2 - Kelvin;");
        System.out.print("Enter: ");
        while (true) {
            while (true) {
                try {
                    choice = Integer.parseInt(READER.readLine());
                    break;
                } catch (Exception exception) {
                    System.out.println("Input error, please try again.");
                    System.out.print("Enter: ");
                }
            }
            if (choice == 1) {
                newTemperature = (temperature-32) * (double) (5/9);
                System.out.println(temperature + "F = " + newTemperature + "C");
                break;
            } else if (choice == 2) {
                newTemperature = (temperature-32) * (double) (5/9) + 273.15;
                System.out.println(temperature + "F = " + newTemperature + "K");
                break;
            } else {
                System.out.println("This action does not exist, please try again.");
                System.out.print("Enter: ");
            }
        }
    }
}
