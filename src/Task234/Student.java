package Task234;

/*
   Task 2
   1. Создать свой класс с полями (до 5 полей) и несколькими конструкторами.
   Task 3
   1. Добавить несколько статических методов.
   Task 4
   1. Перенести проект на репозиторий GitHub.
   2. Сделать несколько коммитов и веток.
*/

public class Student {
    public String name;
    public String surname;
    public String group;
    public String speciality;
    public int age;
    public static String universityInituals;
    public static int countStudents;

    public Student() {
        Student.addCount();
    }

    public Student(String name, String group) {
        this.name = name;
        this.group = group;
        Student.addCount();
    }

    public Student(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        Student.addCount();
    }

    public Student(String name, String group, String speciality) {
        this.name = name;
        this.group = group;
        this.speciality = speciality;
        Student.addCount();
    }

    public Student(String name, String surname, String group, String speciality, int age) {
        this.name = name;
        this.surname = surname;
        this.group = group;
        this.speciality = speciality;
        this.age = age;
        Student.addCount();
    }

    @Override
    public String toString() {
        return "Task234.Student{" + "name: " + name +
                " " + surname + "; age: " + age +
                "; group: " + group +
                "; speciality: " + speciality +
                "; university: " + universityInituals + "}";
    }

    public String toString(String name, String group) {
        return "Hello, my name is " + name  +
                " from the group " + group;
    }

    void sayHi() {
        System.out.println("Hello World, i'm a student");
    }

    public static void setUniversityInituals(String newInitials) {
        universityInituals = newInitials;
    }

    public static void addCount() {
        countStudents++;
    }

    public static void viewCount() {
        System.out.println("number of students: "+countStudents);
    }

    public static void main(String[] args) {
        // Объект 1
        Student student1 = new Student("Rostislav", "Khutornoi", "IT291", "Applied Mathematics and Computer Science", 19);
        // TODO: 18.04.2022 Объект 2-5
        Student student2 = new Student("Max", "IT691");
        Student student3 = new Student("John", "Doe", 20);
        Student student4 = new Student("Alex", "IT191", "Applied Mathematics");
        Student student5 = new Student();

        setUniversityInituals("LNU");
        System.out.println(student1.toString());
        System.out.println(student2.toString(student2.name, student2.group));
        System.out.println(student3.toString());
        student1.sayHi();
        viewCount();
    }
}
