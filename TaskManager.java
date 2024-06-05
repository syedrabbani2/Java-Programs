import java.io.*;
import java.util.*;

public class TaskManager {
    private List<Task> tasks;
    private static final String FILENAME = "tasks.txt";

    public TaskManager() {
        this.tasks = new ArrayList<>();
        loadTasks();
    }

    private void loadTasks() {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILENAME))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                String title = parts[0];
                String description = parts[1];
                boolean completed = Boolean.parseBoolean(parts[2]);
                tasks.add(new Task(title, description, completed));
            }
        } catch (IOException e) {
            System.out.println("Error loading tasks: " + e.getMessage());
        }
    }

    private void saveTasks() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILENAME))) {
            for (Task task : tasks) {
                writer.write(task.getTitle() + "," + task.getDescription() + "," + task.isCompleted());
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error saving tasks: " + e.getMessage());
        }
    }

    public void addTask(String title, String description) {
        Task task = new Task(title, description, false);
        tasks.add(task);
        saveTasks();
        System.out.println("Task added successfully.");
    }

    public void updateTaskStatus(String title, boolean completed) {
        Task task = findTask(title);
        if (task != null) {
            task.setCompleted(completed);
            saveTasks();
            System.out.println("Task status updated successfully.");
        } else {
            System.out.println("Task not found.");
        }
    }

    public void deleteTask(String title) {
        Task task = findTask(title);
        if (task != null) {
            tasks.remove(task);
            saveTasks();
            System.out.println("Task deleted successfully.");
        } else {
            System.out.println("Task not found.");
        }
    }

    public void viewTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks found.");
        } else {
            System.out.println("All Tasks:");
            for (Task task : tasks) {
                System.out.println(task);
            }
        }
    }

    private Task findTask(String title) {
        for (Task task : tasks) {
            if (task.getTitle().equalsIgnoreCase(title)) {
                return task;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Choose an option:");
            System.out.println("1. Add Task");
            System.out.println("2. Update Task Status");
            System.out.println("3. Delete Task");
            System.out.println("4. View Tasks");
            System.out.println("5. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.println("Enter task title:");
                    String title = scanner.nextLine();
                    System.out.println("Enter task description:");
                    String description = scanner.nextLine();
                    taskManager.addTask(title, description);
                    break;
                case 2:
                    System.out.println("Enter task title to update status:");
                    String titleToUpdate = scanner.nextLine();
                    System.out.println("Enter task status (true for completed, false for not completed):");
                    boolean status = scanner.nextBoolean();
                    taskManager.updateTaskStatus(titleToUpdate, status);
                    break;
                case 3:
                    System.out.println("Enter task title to delete:");
                    String titleToDelete = scanner.nextLine();
                    taskManager.deleteTask(titleToDelete);
                    break;
                case 4:
                    taskManager.viewTasks();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

class Task {
    private String title;
    private String description;
    private boolean completed;

    public Task(String title, String description, boolean completed) {
        this.title = title;
        this.description = description;
        this.completed = completed;
    }

    public String getDescription() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getTitle() {
        return title;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    @Override
    public String toString() {
        return "Title: " + title + ", Description: " + description + ", Status: " + (completed ? "Completed" : "Not Completed");
    }
}