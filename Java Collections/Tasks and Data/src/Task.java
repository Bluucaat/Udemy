public class Task implements Comparable<Task>{
    @Override
    public int compareTo(Task o) {
        int result = this.projectName.compareTo(o.projectName);
        if(result == 0){
            result = this.taskDescription.compareTo(o.taskDescription);
        }
        return result;
    }

    public enum Status {
    ASSIGNED, IN_PROGRESS, NOT_YET_ASSIGNED
    }
    public enum Priority {
    LOW, MEDIUM, HIGH
    }
    private String assignee;
    private String projectName;
    private String taskDescription;
    private Priority priority;
    private Status status;

    public Task(String assignee, String projectName, Priority priority) {
        this(assignee, projectName, null, priority);
    }

    public Task(String assignee, String projectName, String taskDescription, Priority priority) {
        this(assignee, projectName, taskDescription, priority, assignee == null? Status.IN_PROGRESS : Status.ASSIGNED);
    }

    public Task(String assignee, String projectName, String taskDescription, Priority priority, Status status) {
        this.assignee = assignee;
        this.projectName = projectName;
        this.taskDescription = taskDescription;
        this.priority = priority;
        this.status = status;
    }

    public String getAssignee() {
        return assignee;
    }

    public void setAssignee(String assignee) {
        this.assignee = assignee;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "%-20s %-25s %-10s %-10s %s".formatted(projectName, taskDescription,
                priority, assignee, status);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Task task = (Task) o;
        return getAssignee().equals(task.getAssignee()) && getProjectName().equals(task.getProjectName());
    }

    @Override
    public int hashCode() {
        int result = getAssignee().hashCode();
        result = 31 * result + getProjectName().hashCode();
        return result;
    }
}
