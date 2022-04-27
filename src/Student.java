public class Student {
    public String name;
    public String surname;
    public String group;
    public String speciality;
    public int age;

    public Student() {
    }

    public Student(String name, String group) {
        this.name = name;
        this.group = group;
    }

    public Student(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public Student(String name, String group, String speciality) {
        this.name = name;
        this.group = group;
        this.speciality = speciality;
    }

    public Student(String name, String surname, String group, String speciality, int age) {
        this.name = name;
        this.surname = surname;
        this.group = group;
        this.speciality = speciality;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" + "name: " + name +
                " " + surname + "; age: " + age +
                "; group: " + group +
                "; speciality: " + speciality + "}";
    }

    public String toString(String name, String group) {
        return "Hello, my name is " + name  +
                " from the group " + group;
    }

    void sayHi() {
        System.out.println("Hello World, i'm a student");
    }

    public static void main(String[] args) {
        // Объект 1
        Student student1 = new Student("Rostislav", "Khutornoi", "IT291", "Applied Mathematics and Computer Science", 19);
        // TODO: 18.04.2022 Объект 2-5
        Student student2 = new Student("Max", "IT691");
        Student student3 = new Student("John", "Doe", 20);
        Student student4 = new Student("Alex", "IT191", "Applied Mathematics");
        Student student5 = new Student();

        System.out.println(student1.toString());
        System.out.println(student2.toString(student2.name, student2.group));
        System.out.println(student3.toString());
        student1.sayHi();
    }
}
