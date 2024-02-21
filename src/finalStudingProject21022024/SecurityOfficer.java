package finalStudingProject21022024;

public class SecurityOfficer {
    private static final SecurityOfficer instance = new SecurityOfficer();

    private SecurityOfficer() {}

    public static SecurityOfficer getInstance() {
        return instance;
    }
    void checkReports () {
        System.out.println("All reports have been verified");
    };
}
