package lesson6;

public class Student {
    private int age;
    private String name;
    private int grade;
    private String city;

    public Student(String name, int age,  int grade, String city) {
        this.age = age;
        this.name = name;
        this.grade = grade;
        this.city = city;
    }

    public Student() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void personInfo() {
        System.out.println("Hello! My name is " + this.name + " I'm " + this.age);
    }
}
