package homework7From18122023;

public class MainPhone {
    public static void main(String[] args) {
        Phone phoneN = new Phone("123456789", "Nokia 8800", 0.1);
        Phone phoneS = new Phone("987654321", "Samsung", 0.3);
        Phone phoneIP = new Phone("123454321", "iPhone15", 0.12);
//Вывод в консоль их значения.
        System.out.println("Specifications: " + phoneN.getNumber() + " " + phoneN.getModel()+ " " + phoneN.getWeight());
        System.out.println("Specifications: " + phoneS.getNumber() + " " + phoneS.getModel()+ " " + phoneS.getWeight());
        System.out.println("Specifications: " + phoneIP.getNumber() + " " + phoneIP.getModel()+ " " + phoneIP.getWeight());

        phoneN.receiveCall("Serhio", phoneN.getNumber());
        phoneS.receiveCall("Savelij",phoneS.getNumber());
        phoneIP.receiveCall("Alex", "111111111");

        phoneN.sendMessage(" " + phoneN.getModel() + " from number" + " " + "222222222", "333333333");
        phoneS.sendMessage(" " + phoneS.getModel() + " from number" + " " + "555555555");
        phoneIP.sendMessage(" " + phoneIP.getModel() + " from number" + " " +"666666666", "777777777","444444444");
    }
}
