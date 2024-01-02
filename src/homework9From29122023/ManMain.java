package homework9From29122023;
//Создать класс Man (человек), с полями: имя, возраст, пол и вес. Определить методы задания //имени, возраста и веса.
// Создать производный класс Student, имеющий поле года обучения. Определить методы задания и увеличения года обучения.

public class ManMain {
    public static void main(String[] args) {
        Man man = new Man();
        man.setName("Sergey");
        man.setAge(26);
        man.setGender('M');
        man.setWeight(80.5);

        System.out.println("Man name: " + man.name);
        System.out.println("Age: " + man.age);
        System.out.println("Gender:" + man.gender);
        System.out.println("Weight: " + man.weight);

        Student student = new Student();
        student.setName("Oksana");
        student.setAge(16);
        student.setWeight(62.5);
        student.setYearOfStudy(1);

        System.out.println("Student name: " + student.name);
        System.out.println("Age: " + student.age);
        System.out.println("Weight: " + student.weight);
        System.out.println("Year of study: " + student.yearOfStudy);

        student.increaseYearOfStudy();
        System.out.println("Increased year of study: " + student.yearOfStudy);
    }
}
