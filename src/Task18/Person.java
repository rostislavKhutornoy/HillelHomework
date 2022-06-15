package Task18;

/*
    У каждого человека есть имя, папа и мама.
    Подсказка: папа и мама это тоже люди.

    Создать класс, который бы описывал данную ситуацию.
    Создать объекты для 2 поколений людей (ребенок и его родители) и вывести информацию о них на экран.
*/

import GetSomething.Get;
import java.io.IOException;

public class Person {
    public String name;
    public Person father;
    public Person mother;

    public Person() {}

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, Person father, Person mother) {
        this.name = name;
        this.father = father;
        this.mother = mother;
    }

    @Override
    public String toString()
    {
        if (mother == null && father == null)
            return "Task18.Person name is " + name + ", no mother, no father";
        if (mother == null)
            return "Task18.Person name is " + name + ", no mother, father is " + father.name;
        if (father == null)
            return "Task18.Person name is " + name + ", mother is " + mother.name + ", no father";
        else
            return "Task18.Person name is " + name + ", mother is " + mother.name + ", father is " + father.name;
    }

    public void CreatePerson() throws IOException {
        System.out.print("Enter a name: ");
        this.name = Get.string();
        System.out.print("Enter mother's name: ");
        String motherName = Get.string();
        System.out.print("Enter father's name: ");
        String fatherName = Get.string();
        this.mother = new Person(motherName);
        this.father = new Person(fatherName);
        System.out.println(this.toString());
    }

    public static void main(String[] args) throws IOException {
        Person kid = new Person();
        kid.CreatePerson();
    }
}
