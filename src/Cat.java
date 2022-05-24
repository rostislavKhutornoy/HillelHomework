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

    @Override
    public String toString() {
        return "Cat{" +
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

    public static void main(String[] args) {
        Cat cat1 = new Cat("Barsik",7,5,"Lop-eared");
        Cat cat2 = new Cat("Markiz", 8, 7, "Munchkin");
        Cat cat3 = new Cat("Belik", 7, 5, "Munchkin");
        System.out.println(cat1);
        System.out.println(cat2);
        System.out.println(cat3);
        System.out.println(cat1.equals(cat2));
        System.out.println(cat1.equals(cat3));
    }
}
