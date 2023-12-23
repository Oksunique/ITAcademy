package homework7From18122023;

public class Phone {
    private String number;
    private String model;
    private double weight;

    public Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public String getNumber() {
        return number;
    }
    public String getModel() {
        return model;
    }
    public double getWeight() {
        return weight;
    }
 //метод receiveCall (один параметр – имя звонящего).
 // Выводит на консоль сообщение “Звонит {name}”. getNumber – возвращает номер телефона. Вызвать
 //эти методы для каждого из объектов
    public void receiveCall(String callerName) {
        System.out.println("Is calling " + callerName);
    }
//второй метод receiveCall, который принимает два параметра - имя звонящего и
//номер телефона звонящего.
    public void receiveCall(String callerName, String callerNumber) {
        System.out.println("Is calling " + callerName + ", Phone number: " + callerNumber);
    }
//метод sendMessage с аргументами переменной длины. Данный метод принимает на вход номера телефонов,
// которым будет отправлено сообщение. Метод выводит на консоль номера этих телефонов.
    public void sendMessage(String... numbers) {
        for (String number : numbers) {
            System.out.println("The message is sent to phone " + number);
        }
    }
}
