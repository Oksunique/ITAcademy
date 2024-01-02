package homework9From29122023;

class ApplianceKitchen extends Appliance {
    private String type;

    public ApplianceKitchen(String name, int power, String type) {
        super(name, power);
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
