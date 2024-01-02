package homework9From29122023;

class AviationCompany {
    private Aircraft[] aircrafts;

    public AviationCompany(Aircraft[] aircrafts) {
        this.aircrafts = aircrafts;
    }

    public void printAircraftHierarchy() {
        System.out.println("Aircraft Hierarchy:");
        for (Aircraft aircraft : aircrafts) {
            System.out.println(aircraft.getType()+ " " + aircraft.getRange());
        }
    }

    public int calculateTotalCapacity() {
        int totalCapacity = 0;
        for (Aircraft aircraft : aircrafts) {
            totalCapacity += aircraft.getCapacity();
        }
        return totalCapacity;
    }

    public int calculateTotalPayload() {
        int totalPayload = 0;
        for (Aircraft aircraft : aircrafts) {
            totalPayload += aircraft.getPayload();
        }
        return totalPayload;
    }

    public void sortByRange() {
        }

    public void findAircraftInRange(int minRange, int maxRange) {
        System.out.println("Aircraft sorted by range (" + minRange + " - " + maxRange + " km):");
        for (Aircraft aircraft : aircrafts) {
            if (aircraft.getRange() >= minRange && aircraft.getRange() <= maxRange) {
                System.out.println(aircraft.getType()+ " "+ aircraft.getRange());
            }
        }
    }
}
