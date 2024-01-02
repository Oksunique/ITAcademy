package homework9From29122023;
//Создать класс Man (человек), с полями: имя, возраст, пол и вес. Определить методы задания //имени, возраста и веса.
// Создать производный класс Student, имеющий поле года обучения. Определить методы задания и увеличения года обучения.
public class Student extends Man {
    int yearOfStudy;

    void setYearOfStudy(int yearOfStudy) {
        this.yearOfStudy = yearOfStudy;
    }

    void increaseYearOfStudy() {
        yearOfStudy++;
    }
}
