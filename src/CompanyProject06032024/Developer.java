package CompanyProject06032024;

import CompanyProject06032024.enums.Unit;

public interface Developer {
    void develop();
    Unit getUnit();
    void setTask(Task task);
    Task getTask();
    public default void task() {
        System.out.println("Developer is performing a task.");
    }
}
