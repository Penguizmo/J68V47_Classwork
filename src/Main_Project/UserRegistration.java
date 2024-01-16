package Main_Project;

import java.io.*;
import java.util.*;

public class UserRegistration {
    private static final String USERS_FILE = "users.txt";
    private static final String TASKS_FILE = "tasks.txt";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Forget Me Not!");
        System.out.println("1. Login");
        System.out.println("2. Register");
        System.out.println("3. Exit");
        int option = scanner.nextInt();
        scanner.nextLine();
        switch (option) {
            case 1:
                System.out.println("Enter username: ");
                String loginUsername = scanner.nextLine();
                System.out.println("Enter password: ");
                String loginPassword = scanner.nextLine();
                if (checkUser(loginUsername, loginPassword)) {
                    manageTasks(scanner, loginUsername);
                } else {
                    System.out.println("Invalid credentials.");
                }
                break;
            case 2:
                System.out.println("Enter new username: ");
                String newUsername = scanner.nextLine();
                System.out.println("Enter new password: ");
                String newPassword = scanner.nextLine();
                registerUser(newUsername, newPassword);
                break;
            case 3:
                System.exit(0);
        }
    }

    private static boolean checkUser(String username, String password) {
        try (BufferedReader reader = new BufferedReader(new FileReader(USERS_FILE))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts[0].equals(username) && parts[1].equals(password)) {
                    return true;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    private static void registerUser(String username, String password) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(USERS_FILE, true))) {
            writer.write(username + "," + password);
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void manageTasks(Scanner scanner, String username) {
        while (true) {
            System.out.println("1. Create task");
            System.out.println("2. Delete task");
            System.out.println("3. Edit task");
            System.out.println("4. Exit");
            int option = scanner.nextInt();
            scanner.nextLine();
            switch (option) {
                case 1:
                    System.out.println("Enter task name: ");
                    String taskName = scanner.nextLine();
                    System.out.println("Enter task description: ");
                    String taskDescription = scanner.nextLine();
                    System.out.println("Enter task priority (1-3): ");
                    int taskPriority = scanner.nextInt();
                    scanner.nextLine();
                    createTask(username, taskName, taskDescription, taskPriority);
                    break;
                case 2:
                    System.out.println("Enter task name to delete: ");
                    String deleteTaskName = scanner.nextLine();
                    deleteTask(username, deleteTaskName);
                    break;
                case 3:
                    System.out.println("Enter task name to edit: ");
                    String editTaskName = scanner.nextLine();
                    editTask(scanner, username, editTaskName);
                    break;
                case 4:
                    return;
            }
        }
    }

    private static void createTask(String username, String taskName, String taskDescription, int taskPriority) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(TASKS_FILE, true))) {
            writer.write(username + "," + taskName + "," + taskDescription + "," + taskPriority);
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void deleteTask(String username, String taskName) {
        File tempFile = new File("temp.txt");
        try (BufferedReader reader = new BufferedReader(new FileReader(TASKS_FILE));
             BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts[0].equals(username) && parts[1].equals(taskName)) {
                    continue;
                }
                writer.write(line);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        tempFile.renameTo(new File(TASKS_FILE));
    }

    private static void editTask(Scanner scanner, String username, String taskName) {
        File tempFile = new File("temp.txt");
        try (BufferedReader reader = new BufferedReader(new FileReader(TASKS_FILE));
             BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts[0].equals(username) && parts[1].equals(taskName)) {
                    System.out.println("Enter new task description: ");
                    String newTaskDescription = scanner.nextLine();
                    System.out.println("Enter new task priority (1-3): ");
                    int newTaskPriority = scanner.nextInt();
                    scanner.nextLine();
                    writer.write(username + "," + taskName + "," + newTaskDescription + "," + newTaskPriority);
                } else {
                    writer.write(line);
                }
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        tempFile.renameTo(new File(TASKS_FILE));
    }
}