package homework16From21022024.SingletonEarth;

public class Mars implements Planet {
    @Override
    public void rotate() {
        System.out.println("The planet Mars rotates on its axis.");
    }

    @Override
    public void revolve() {
        System.out.println("The planet Mars orbits the Sun.");
    }

    @Override
    public void leaveSystem() {
        System.out.println("The planet Mars has left its system.");
    }

    @Override
    public void goIntoInterstellarSpace() {
        System.out.println("The planet Mars has gone into interstellar space.");
    }
}
