package homework16From21022024.SingletonEarth;

/* Принципы дизайна ПО. SOLID. Паттерны
Планеты солнечной системы. Создайте Singleton-класс: Earth.
Затем реализуй в них интерфейс Planet с некоторыми операциями.*/

public class Earth implements Planet {
    private static Earth instance = new Earth();

    private Earth() {} // Приватный конструктор для Singleton

    public static Earth getInstance() {
        return instance;
    }

    @Override
    public void rotate() {
        System.out.println("Planet Earth rotates on its axis.");
    }

    @Override
    public void revolve() {
        System.out.println("Planet Earth orbits the Sun.");
    }

    @Override
    public void leaveSystem() {
        System.out.println("Planet Earth has left its system.");
    }

    @Override
    public void goIntoInterstellarSpace() {
        System.out.println("Planet Earth has gone into interstellar space.");
    }

}
