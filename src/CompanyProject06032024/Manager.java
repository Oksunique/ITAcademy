package CompanyProject06032024;

import CompanyProject06032024.enums.TaskStatus;
import CompanyProject06032024.enums.Unit;

import java.util.List;

public class Manager {
    public Unit unit;
    public List<Developer> developers;
    public List<Task> tasks;

    public Manager(Unit unit, List<Developer> developers, List<Task> tasks) {
        this.unit = unit;
        this.developers = developers;
        this.tasks = tasks;
    }

    public Manager() {

    }

    public Manager(String java, String javaDeveloper, String created) {
    }

    public Unit getUnit() {
        return unit;
    }

    public void setUnit(Unit unit) {
        this.unit = unit;
    }

    public List<Developer> getDevelopers() {
        return developers;
    }

    public void setDevelopers(List<Developer> developers) {
        this.developers = developers;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }
    public void distributeTasks() {

        new Thread(() -> {
            for (Developer developer : developers) {
                if (developer.getUnit() == Unit.JAVA) {
                    developer.setTask(new Task("1", "Java Task", TaskStatus.CREATED, "path/to/java"));
                } else {
                    developer.setTask(new Task("2", "Kotlin Task", TaskStatus.CREATED, "path/to/kotlin"));
                }
            }
        }).start();
    }
}
