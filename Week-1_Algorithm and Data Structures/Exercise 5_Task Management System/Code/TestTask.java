package algorithm_data_structures.task_management_system;

public class TestTask {
 public static void main(String[] args) {
	 
     TaskManager manager = new TaskManager();

     manager.addTask(new Task("T101", "Fix Bug #12", "Pending"));
     manager.addTask(new Task("T102", "Implement Login", "Completed"));
     manager.addTask(new Task("T103", "Write Tests", "In Progress"));

     System.out.println("\n All Tasks:");
     manager.displayAllTasks();

     System.out.println("\n Searching for T102:");
     Task found = manager.searchTask("T102");
     if (found != null) found.display();
     else System.out.println("Task not found.");

     System.out.println("\n Deleting T101:");
     manager.deleteTask("T101");

     System.out.println("\n Remaining Tasks:");
     manager.displayAllTasks();
 }
}

