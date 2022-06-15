package Task16;

/*
    Создать класс Cat.
    У кота должны быть такие свойства как имя, возраст, вес, порода.
    Создать конструктор по умолчанию, конструктор с 4 параметрами, конструктор с 2 параметрами(имя и возраст)
    Переопределить метод toString
    Реализовать для класса Cat свою версию метода equals, который будет сравнивать котов только по весу и возрасту.

    Создать 2 кота и вывести на экран результат их сравнения
*/

import GetSomething.Get;

import java.io.IOException;
import java.util.Objects;

public class Cat {
    public String name;
    public int age;
    public double weight;
    public String breed;

    public Cat() {
    }

    public Cat(String name, int age, double weight, String breed) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.breed = breed;
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void CatUpdate() throws IOException {
        System.out.print("Enter the name of the cat: ");
        this.name = Get.string();
        System.out.print("Enter the age of the cat: ");
        this.age = Math.abs(Get.intNumber());
        System.out.print("Enter the weight of the cat: ");
        this.weight = Math.abs(Get.doubleNumber());
        System.out.print("Enter the breed of the cat: ");
        this.breed = Get.string();
    }

    public static void CatListFill(Cat[] catList) throws IOException {
        for(int i = 0; i < catList.length; i++) {
            catList[i] = new Cat();
            System.out.println("Cat #" + (i+1) + ":");
            catList[i].CatUpdate();
        }
    }

    private static void CatListEqualsLogic(boolean deflt, Cat[] catList) throws IOException {
        int n = catList.length;
        if (deflt) {
            catList[0].CatEquals(catList[1]);
        } else {
            while (true) {
                System.out.print("\nEnter the first cat number: ");
                int a = 0;
                int b = 0;
                while (true) {
                    a = Get.intNumber();
                    if (a <= 0 || a > n) {
                        System.out.println("We don't have that many cats! Try again!");
                    } else break;
                }
                System.out.print("Enter the second cat number: ");
                while (true) {
                    b = Get.intNumber();
                    if (b <= 0 || b > n) {
                        System.out.println("We don't have that many cats! Try again!");
                    } else break;
                }
                catList[a-1].CatEquals(catList[b-1]);
                System.out.println("0 - compare other cats from the list, 1 - exit the program");
                int choise;
                while (true) {
                    choise = Get.intNumber();
                    if (choise == 0 || choise == 1) {
                        break;
                    } else System.out.println("Incorrect answer! Try again!");
                }
                if (choise == 1) {
                    break;
                }
            }
        }
    }

    // Сравнение котов в любом готовом массиве Cat
    public static void CatListEquals(Cat[] catList) throws IOException {
        boolean deflt = false;
        int n = catList.length;
        if (n < 2) {
            System.out.println("There are too few cats in your array!");
        } else {
            if (n == 2) {
                deflt = true;
            }
            CatListEqualsLogic(deflt, catList);
        }
    }

    // Сравнение котов в временном, заполненным пользователем, массиве Cat
    public static void CatListEquals() throws IOException {
        boolean deflt = false;
        System.out.print("Enter the number of cats in question (2 by default): ");
        int n = Get.intNumber();
        if (n <= 2) {
            n = 2;
            deflt = true;
        }
        Cat[] catList = new Cat[n];
        for(int i = 0; i < n; i++) {
            catList[i] = new Cat();
            System.out.println("Cat #" + (i+1) + ":");
            catList[i].CatUpdate();
        }
        CatListEqualsLogic(deflt, catList);
    }

    public void CatEquals(Cat cat) {
        if (this.equals(cat)) {
            System.out.println("Cats are the same!");
        } else System.out.println("Cats are different!");
    }

    @Override
    public String toString() {
        return "Cat.Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", breed='" + breed + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return age == cat.age && Double.compare(cat.weight, weight) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, weight);
    }

    public static void main(String[] args) throws IOException {
        // Сравнение котов в любом готовом массиве Cat
        Cat[] catList = new Cat[3];
        CatListFill(catList);
        CatListEquals(catList);
        // Сравнение котов в временном, заполненным пользователем, массиве Cat
        CatListEquals();
    }
}
