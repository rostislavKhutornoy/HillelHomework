package Converter.Degrees;

import Converter.Interfaces.Converter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Celsius implements Converter {

    double temperature;

    public Celsius(double temperature) {
        this.temperature = temperature;
    }

    static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    @Override
    public void convert() {
        double choice;
        double newTemperature;
        System.out.println("Select a new temperature unit");
        System.out.println("1 - Kelvin; 2 - Fahrenheit;");
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
                newTemperature = temperature + 273.15;
                System.out.println(temperature + "C = " + newTemperature + "K");
                break;
            } else if (choice == 2) {
                newTemperature = (temperature * (1.8))+32;
                System.out.println(temperature + "C = " + newTemperature + "F");
                break;
            } else {
                System.out.println("This action does not exist, please try again.");
                System.out.print("Enter: ");
            }
        }
    }
}
