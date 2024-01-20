package lesson11.tasks;

public enum Status {

    SUCCESS(1) {
        @Override
        public int getStatusCode() {
            return 1212;
        }
    },
    FAILED(0);

    private int statusCode;

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    Status(int statusCode) {
        this.statusCode = statusCode;
    }

    public static Status getStatusByCode(int statusCode) {
        for (Status status : Status.values()) {
            if (statusCode == status.getStatusCode()) return status;
        }
        return null;
    }
}
