package CompanyProject06032024;

import CompanyProject06032024.enums.TaskStatus;

public class Task {
    private String id;
    private String content;
    private TaskStatus status;
    private String path;

    public Task(String id, String content, TaskStatus status, String path) {
        this.id = id;
        this.content = content;
        this.status = status;
        this.path = path;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public TaskStatus getStatus() {
        return status;
    }

    public void setStatus(TaskStatus status) {
        this.status = status;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
