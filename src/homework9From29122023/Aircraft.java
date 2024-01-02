package homework9From29122023;

class Aircraft {
    private String type;
    private int range;
    private int capacity;
    private int payload;

    public Aircraft(String type, int range, int capacity, int payload) {
        this.type = type;
        this.range = range;
        this.capacity = capacity;
        this.payload = payload;
    }

    public String getType() {
        return type;
    }

    public int getRange() {
        return range;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getPayload() {
        return payload;
    }
}

