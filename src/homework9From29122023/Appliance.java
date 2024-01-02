package homework9From29122023;

class Appliance implements AppliancePossibilities {
    protected String name;
    protected int power;

    public Appliance(String name, int power) {
        this.name = name;
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public int getPower() {
        return power;
    }

    @Override
    public void connectToOutlet() {
        System.out.println("Connecting " + name + " to the outlet.");
    }

    @Override
    public void calculatePower() {
        System.out.println("Calculating power consumption for " + name + ": " + power + "W");
    }

    @Override
    public void otherOperations() {
        // Реализация других операций с прибором
    }
}

