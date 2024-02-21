package finalStudingProject21022024;

import java.util.Arrays;

public class ReportsMain {
    public static void main(String[] args) {

        SecurityOfficer securityOfficer = SecurityOfficer.getInstance();
        securityOfficer.checkReports();

        ReportsFactory reportsFactory = new ReportsFactory();
        Reports[] reports = new Reports[4];

        for (int i = 0; i < reports.length; i++) {
            reports[i] = reportsFactory.createReport(BankEmployees.Specialization.values()[i]);
        }

        Arrays.stream(reports)
                .forEach(report -> System.out.println("Number of reports: " + report.countReports()));

        int totalReports = Arrays.stream(reports)
                .map(Reports::countReports)
                .reduce(0, Integer::sum);
        System.out.println("Total number of reports: " + totalReports);

        Arrays.stream(BankEmployees.Specialization.values())
                .forEach(specialization -> {
                    Reports report = reportsFactory.createReport(specialization);
                    System.out.println("Report from " + specialization + ": " + report.countReports());
                });
    }
}
