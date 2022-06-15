package Task5;

/*
    Перерешать примеры

    Арифметические операции
    https://metanit.com/java/tutorial/2.3.php

    И заполнить таблицу с типами данных из https://vertex-academy.com/tutorials/ru/prividenie-tipov-v-java/
*/

public class HillelMath {
    public static int a;
    public static int b;
    public static int c;
    public static int d;
    public static double result;

    public static void main(String[] args) {
        a = 20;
        b = 5;

        // Сложение, вычитание
        c = a + b; // 25
        d = b - 3; // 2
        System.out.println("Addition, subtraction:");
        System.out.println(c);
        System.out.println(d);

        // Умножение, деление
        c = a * b; // 100
        d = a / b; // 4
        System.out.println("Multiplication, division:");
        System.out.println(c);
        System.out.println(d);

        // Деление с остатком
        c = b % 2; // 1
        d = a % b; // 0
        System.out.println("Division with remainder:");
        System.out.println(c);
        System.out.println(d);

        // Инкремент и декремент
        c = --a;
        d = ++b;
        System.out.println("Increment, decrement:");
        System.out.println(c);
        System.out.println(d);

        System.out.println("Math:");
        // Класс Math
        result = Math.abs(-34.5); // Модуль
        System.out.println(result); // 34.5
        result = Math.cos(1); // Косинус
        System.out.println(result); // 0.5403023058681398
        result = Math.asin(1); // Арксинус
        System.out.println(result); // 1.5707963267948966
        result = Math.ceil(5.34); // Наименьшее целое число с плавающей точкой, которое не меньше 5.34 (value)
        System.out.println(result); // 6.0
        result = Math.floor(8.56); // Наибольшее целое число, которое не больше 8.56 (value)
        System.out.println(result); // 8.0
        result = Math.floorDiv(11, 2); // Целочисленный результат деления a на b
        System.out.println(result); // 5.0
        result = Math.log(100); // Натуральный логарифм
        System.out.println(result); // 4.605170185988092
        result = Math.log10(100); // Десятичный логарифм
        System.out.println(result); // 2.0
        result = Math.max(43, 65); // Максимальное число и минимальное из a и b
        System.out.println(result); // 65.0
        result = Math.min(43, 65);
        System.out.println(result); // 43.0
        result = Math.pow(2, 6); // Возведение в степень
        System.out.println(result); // 64.0
        result = Math.random(); // Случайное число от 0.0 до 1.0
        System.out.println(result);
        result = Math.rint(5.5); // Возвращает число double, которое представляет ближайшее к числу value целое число
        System.out.println(result); // 6.0
        result = Math.round(5.5); // Округление
        System.out.println(result); // 6.0
        result = Math.sqrt(4); // Квадратный корень
        System.out.println(result); // 2.0
        result = Math.toDegrees(3.14159); // Радианы в градусы и наоборот
        System.out.println(result); // 179.9998479605043
        result = Math.toRadians(90);
        System.out.println(result); // 1.5707963267948966
    }


}
