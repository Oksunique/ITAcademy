package finalStudingProject21022024;

public class ReportsFactory {
    public Reports createReport(BankEmployees.Specialization specialization) {
        if (specialization == BankEmployees.Specialization.CREDIT_OFFICER) {
            return new CreditReport();
        } else if (specialization == BankEmployees.Specialization.CLIENT_MANAGER) {
            return new ClientReport();
        } else if (specialization == BankEmployees.Specialization.DEBTS_COLLECTOR) {
            return new DebtsReport();
        } else if (specialization == BankEmployees.Specialization.BANK_DIRECTOR) {
            return new DirectorReport();
        } else {
            return null;
        }
    }
}
