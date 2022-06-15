package Task20;

/*
    Написать конвертер температур для конвертации градусов по Цельсию в Кельвины и Фаренгейты.
    Используйте интерфейс Converter с одним методом covert.
    Пользователь должен вводить в консоли градусы и какую систему он хотел бы их сконвертировать,
    а программа должна определять по вводу какую имплементацию использовать, конвертировать и выводить результат
*/

import Task20.Degrees.Celsius;
import Task20.Degrees.Fahrenheit;
import Task20.Degrees.Kelvin;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Converter {

    static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void ConvertTemperature() {
        double choice;
        double temperature = 0;
        System.out.println("Select the temperature unit you want to convert.");
        System.out.println("1 - Celsius; 2 - Kelvin; 3 - Fahrenheit;");
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
            if (choice >= 1 && choice <= 3) {
                while (true) {
                    System.out.println("Enter temperature value.");
                    System.out.print("Enter: ");
                    try {
                        temperature = Double.parseDouble(READER.readLine());
                        break;
                    } catch (Exception exception) {
                        System.out.println("Input error, please try again.");
                    }
                }
            }
            if (choice == 1) {
                Celsius celsius = new Celsius(temperature);
                celsius.convert();
                break;
            } else if (choice == 2) {
                Kelvin kelvin = new Kelvin(temperature);
                kelvin.convert();
                break;
            } else if (choice == 3) {
                Fahrenheit fahrenheit = new Fahrenheit(temperature);
                fahrenheit.convert();
            } else {
                System.out.println("This action does not exist, please try again.");
                System.out.print("Enter: ");
            }
        }
    }

    public static void main(String[] args) {
        ConvertTemperature();
    }
}
