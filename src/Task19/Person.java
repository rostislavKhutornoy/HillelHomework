package Task19;

/*
    1. Создать класс Person который описывает человека, с полями: имя, фамилия, возраст, вес, рост.
    Создать один или несколько конструкторов которые гарантирует что у каждого есть имя, фамилия.
    Создать массив из 100 обьектов типа Person заполненных случайными данными (Например создать массив на несколько имен и выбирать из него случайным образом).

    1.1*. Обеспечить чтобы случайные данные (вес, рост, возраст) выглядели правдоподобно:
    не было человека весом 3 кг и ростом 180 итд.
*/

public class Person {
    public String firstName;
    public String secondName;
    public int age;
    public double weight;
    public int height;

    public Person(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
    }

    public Person(String firstName, String secondName, int age, double weight, int height) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Name: " + firstName +
                " " + secondName +
                ", Age: " + age +
                ", Weight: " + weight +
                ", Height: " + height;
    }

    public String getRandomFirstName() {
        String name;
        String[] names = {"William", "Byron", "Gail", "Kathryn", "Martin",
                        "Mary", "Irma", "Bonnie", "Jason", "William",
                        "Robin", "Ronald", "Donald", "Angela", "David"};
        int random = (int) (Math.random() * (names.length - 1));
        return name = names[random];
    }

    public String getRandomSecondName() {
        String secondName;
        String[] secondNames = {"French", "Santos", "Smith", "Johnson", "Parker",
                                "Wilson", "Murray", "Palmer", "Lawrence", "Martinez",
                                "Buchanan", "James", "Hill", "May", "Bennett"};
        int random = (int) (Math.random() * (secondNames.length - 1));
        return secondName = secondNames[random];
    }

    public int getRandomAge() {
        return age = (int) (Math.random()*52 + 18);
    }

    public int getRandomHeight() {
        return height = (int) (Math.random()*41 + 150);
    }

    public double getRandomWeight(int height) {
        return (height - 100) - (height - 200)/2.0;
    }

    public void CreateRandomPerson() {
        this.firstName = getRandomFirstName();
        this.secondName = getRandomSecondName();
        this.age = getRandomAge();
        this.height = getRandomHeight();
        this.weight = getRandomWeight(this.height);
    }

    public static void FillRandomPersonList(Person[] persons) {
        for (int i = 0; i < persons.length; i++) {
            persons[i] = new Person("Null", "Null");
            persons[i].CreateRandomPerson();
            System.out.println((i+1) + ". " +persons[i].toString());
        }
    }

    public static void main(String[] args) {
        Person[] array = new Person[100];
        FillRandomPersonList(array);
    }
}
