package CompanyProject06032024;
import CompanyProject06032024.enums.Unit;
import CompanyProject06032024.enums.TaskStatus;
public class KotlinDeveloper implements Developer {
    private Task task;

    public KotlinDeveloper() {
        this.task = task;
    }

    @Override
    public void develop() {
        // Разработка функционала задачи
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        task.setStatus(TaskStatus.DONE);
    }

    @Override
    public Unit getUnit() {
        return Unit.KOTLIN;
    }

    @Override
    public void setTask(Task task) {
        this.task = task;
    }

    @Override
    public Task getTask() {
        return task;
    }
}
