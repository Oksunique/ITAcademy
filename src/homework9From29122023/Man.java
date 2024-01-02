package homework9From29122023;
//Создать класс Man (человек), с полями: имя, возраст, пол и вес. Определить методы задания //имени, возраста и веса.
// Создать производный класс Student, имеющий поле года обучения. Определить методы задания и увеличения года обучения.

public class Man {
    String name;
    int age;
    char gender;
    double weight;

    void setName(String name) {
        this.name = name;
    }

    void setAge(int age) {
        this.age = age;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    void setWeight(double weight) {
        this.weight = weight;
    }
}

