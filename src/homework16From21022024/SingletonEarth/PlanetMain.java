package homework16From21022024.SingletonEarth;

public class PlanetMain {
    public static void main(String[] args) {
        Earth earth = Earth.getInstance();
        earth.rotate();
        earth.revolve();
        earth.leaveSystem();
        earth.goIntoInterstellarSpace();

        Mars mars = new Mars();
        mars.rotate();

        Mars mars1 = new Mars();
        mars1.revolve();

        Mars mars2 = new Mars();
        mars2.leaveSystem();

        Mars mars3 = new Mars();
        mars3.goIntoInterstellarSpace();

        Jupiter jupiter = new Jupiter();
        jupiter.rotate();

        Jupiter jupiter2 = new Jupiter();
        jupiter2.leaveSystem();


    }
}
