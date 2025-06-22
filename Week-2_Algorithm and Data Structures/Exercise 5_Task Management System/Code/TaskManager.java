package algorithm_data_structures.task_management_system;

public class TaskManager {
	private TaskNode head;

	public class TaskNode {
	    Task task;
	    TaskNode next;

	    public TaskNode(Task task) {
	        this.task = task;
	        this.next = null;
	    }
	}
	//Add Task
	 public void addTask(Task task) {
	        TaskNode newNode = new TaskNode(task);
	        if (head == null) {
	            head = newNode;
	        } else {
	            TaskNode temp = head;
	            while (temp.next != null) {
	                temp = temp.next;
	            }
	            temp.next = newNode;
	        }
	        System.out.println("Task added Successfully.");
	    }
	 //Search task
	 public Task searchTask(String id) {
	        TaskNode temp = head;
	        while (temp != null) {
	            if (temp.task.getTaskId().equals(id)) {
	                return temp.task;
	            }
	            temp = temp.next;
	        }
	        return null;
	    }
	 //Search Task
	 public void displayAllTasks() {
	        if (head == null) {
	            System.out.println("No tasks available.");
	            return;
	        }
	        TaskNode temp = head;
	        while (temp != null) {
	            temp.task.display();
	            temp = temp.next;
	        }
	    }
	 //delete task
	 public void deleteTask(String id) {
	        if (head == null) {
	            System.out.println("No tasks to delete.");
	            return;
	        }
	        if (head.task.getTaskId().equals(id)) {
	            head = head.next;
	            System.out.println("Task deleted.");
	            return;
	        }

	        TaskNode current = head;
	        TaskNode previous = null;

	        while (current != null && !current.task.getTaskId().equals(id)) {
	            previous = current;
	            current = current.next;
	        }

	        if (current != null) {
	            previous.next = current.next;
	            System.out.println("Task deleted Successfully.");
	        } else {
	            System.out.println("Task ID not found.");
	        }
	    }

}
