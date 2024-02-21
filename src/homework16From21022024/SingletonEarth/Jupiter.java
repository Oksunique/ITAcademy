package homework16From21022024.SingletonEarth;

public class Jupiter implements Planet {
    @Override
    public void rotate() {
        System.out.println("The planet Jupiter rotates on its axis.");
    }

    @Override
    public void revolve() {
        System.out.println("The planet Jupiter orbits the Sun.");
    }

    @Override
    public void leaveSystem() {
        System.out.println("The planet Jupiter has left its system.");
    }

    @Override
    public void goIntoInterstellarSpace() {
        System.out.println("The planet Jupiter has left its system.");
    }
}
