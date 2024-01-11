package Main_App;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;

public class Main_App {
    private static HashMap<String, String> users = new HashMap<>();
    private static HashMap<String, ArrayList<Task>> userTasks = new HashMap<>();

    public static void main(String[] args) {
        System.out.println("Log In / Register");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Do you have an account? (y/n): ");
        String choice = scanner.nextLine();

        if (choice.equalsIgnoreCase("y")) {
            // Log in code
            System.out.print("Enter your username: ");
            String username = scanner.nextLine();

            System.out.print("Enter your password: ");
            String password = scanner.nextLine();

            // Validate login credentials and perform necessary actions
            if (validateUser(username, password)) {
                System.out.println("Login successful!");
                performTasks(username, scanner);
            } else {
                System.out.println("Invalid username or password!");
            }

        } else if (choice.equalsIgnoreCase("n")) {
            // Register code
            System.out.print("Enter a username: ");
            String username = scanner.nextLine();

            System.out.print("Enter a password: ");
            String password = scanner.nextLine();

            if (registerUser(username, password)) {
                System.out.println("Registration successful! You can now log in.");
                performTasks(username, scanner);
            } else {
                System.out.println("Failed to register user.");
            }

        } else {
            System.out.println("Invalid choice!");
        }

        scanner.close();
    }

    private static boolean validateUser(String username, String password) {
        return users.containsKey(username) && users.get(username).equals(password);
    }

    private static boolean registerUser(String username, String password) {
        if (users.containsKey(username)) {
            return false; // Username already exists
        }
        users.put(username, password);
        userTasks.put(username, new ArrayList<>());
        return true;
    }

    private static void performTasks(String username, Scanner scanner) {
        ArrayList<Task> tasks = userTasks.get(username);

        while (true) {
            System.out.println("\nTask Manager Menu:");
            System.out.println("1. Add New Task");
            System.out.println("2. Delete Task");
            System.out.println("3. View Tasks");

            System.out.print("Enter your choice (1-3): ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline

            switch (choice) {
                case 1:
                    addTask(username, tasks, scanner);
                    break;
                case 2:
                    deleteTask(tasks, scanner);
                    break;
                case 3:
                    viewTasks(tasks);
                    break;
                default:
                    System.out.println("Invalid choice!");
            }

            System.out.print("Continue managing tasks? (y/n): ");
            String continueChoice = scanner.nextLine();
            if (!continueChoice.equalsIgnoreCase("y")) {
                break;
            }
        }
    }

    private static void addTask(String username, ArrayList<Task> tasks, Scanner scanner) {
        System.out.print("Enter task name: ");
        String name = scanner.nextLine();

        System.out.print("Enter task description: ");
        String description = scanner.nextLine();

        System.out.print("Enter task due date: ");
        String dueDate = scanner.nextLine();

        System.out.print("Enter task priority level: ");
        int priority = scanner.nextInt();
        scanner.nextLine(); // Consume the newline

        Task task = new Task(name, description, dueDate, priority);
        tasks.add(task);

        System.out.println("Task added successfully!");
    }

    private static void deleteTask(ArrayList<Task> tasks, Scanner scanner) {
        if (tasks.isEmpty()) {
            System.out.println("No tasks to delete!");
            return;
        }

        System.out.println("Tasks:");
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i + 1) + ". " + tasks.get(i));
        }

        System.out.print("Enter the number of the task to delete: ");
        int taskNumber = scanner.nextInt();
        scanner.nextLine(); // Consume the newline

        if (taskNumber >= 1 && taskNumber <= tasks.size()) {
            tasks.remove(taskNumber - 1);
            System.out.println("Task deleted successfully!");
        } else {
            System.out.println("Invalid task number!");
        }
    }

    private static void viewTasks(ArrayList<Task> tasks) {
        if (tasks.isEmpty()) {
            System.out.println("No tasks to display!");
            return;
        }

        System.out.println("Tasks:");
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i + 1) + ". " + tasks.get(i));
        }
    }

    private static class Task {
        private String name;
        private String description;
        private String dueDate;
        private int priority;

        public Task(String name, String description, String dueDate, int priority) {
            this.name = name;
            this.description = description;
            this.dueDate = dueDate;
            this.priority = priority;
        }

        @Override
        public String toString() {
            return "Task: " + name + "\nDescription: " + description + "\nDue Date: " + dueDate + "\nPriority: " + priority;
        }
    }
}