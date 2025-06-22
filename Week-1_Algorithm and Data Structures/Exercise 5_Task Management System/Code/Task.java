package algorithm_data_structures.task_management_system;

public class Task {
	private String taskId;
	private String taskName;
	private String status;
	public Task(String taskId, String taskName, String status) {
		this.taskId = taskId;
		this.taskName = taskName;
		this.status = status;
	}
	public String getTaskId() {
		return taskId;
	}
	public void display() {
        System.out.println("Task ID: " + taskId + ", Name: " + taskName + ", Status: " + status);
    }
}
