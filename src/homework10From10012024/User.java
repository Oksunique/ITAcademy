package homework10From10012024;
//Создать класс User с полями firstName lastName.
//Добавить getters/setters
//Реализовать методы equals & hashCode
//Создавать два экземпляра User, оба с именем John Smith
//Добавить оба экземпляра в HashSet

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class User {
    private String firstName;
    private String lastName;

    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {

        return firstName;
    }

    public void setFirstName(String firstName) {

        this.firstName = firstName;
    }

    public String getLastName() {

        return lastName;
    }

    public void setLastName(String lastName) {

        this.lastName = lastName;
    }

    // Переопределение метода equals для сравнения двух объектов User
    //  с целью корректного сравнения и хэширования объектов типа User
    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        User user = (User) o;
        return Objects.equals(firstName, user.firstName) && Objects.equals(lastName, user.lastName);
    }

    // Переопределение метода hashCode для корректной работы с HashSet
    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }

    public static void main(String[] args) {

        User user1 = new User("John", "Smith");
        User user2 = new User("John", "Smith");

        // Создаем HashSet для хранения экземпляров класса User
        Set<User> userSet = new HashSet<>();

        // Добавляем оба экземпляра класса User в HashSet
        userSet.add(user1);
        userSet.add(user2);

        System.out.println(userSet);
    }
}
