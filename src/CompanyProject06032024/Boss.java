package CompanyProject06032024;

import CompanyProject06032024.enums.TaskStatus;
import CompanyProject06032024.enums.Title;

import java.util.List;

public class Boss {
    private List<Title> managers;
    private Company company;
    private List<Task> tasks;

    public Boss() {
        this.managers = managers;
        this.company = company;
        this.tasks = tasks;
    }

    public List<Title> getManagers() {
        return managers;
    }

    public void setManagers(List<Title> managers) {
        this.managers = managers;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }

    public void addUser(Company company, User user){
        getCompany().getUsers().add(user);
        }
    public List<Task> getTaskListDone (){

        List<Task> list = tasks.stream()
                .filter(task -> task.getStatus() != TaskStatus.DONE)
                .toList();

        return list;
    }
    public void getTaskStatistics() {
        long createdTasks = tasks.stream().filter(task -> task.getStatus() == TaskStatus.CREATED).count();
        long inProgressTasks = tasks.stream().filter(task -> task.getStatus() == TaskStatus.IN_PROGRESS).count();
        long doneTasks = tasks.stream().filter(task -> task.getStatus() == TaskStatus.DONE).count();

        System.out.println("Tasks in CREATED status: " + createdTasks
                + "Tasks in IN_PROGRESS status: " + inProgressTasks
                + "Tasks in DONE status: " + doneTasks);
    }
}
