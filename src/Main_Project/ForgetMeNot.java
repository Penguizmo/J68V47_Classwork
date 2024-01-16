package Main_Project;

import java.io.*;
import java.util.*;

public class ForgetMeNot {
    private static String currentUser = "";
    private static Map<String, String> users = new HashMap<>();
    private static Map<String, List<String>> tasks = new HashMap<>();

    public static void main(String[] args) throws IOException {
        loadUsers();
        loadTasks();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Welcome to Forget Me Not!");
            System.out.println("1. Login");
            System.out.println("2. Register");
            System.out.println("3. Exit");
            System.out.print("Please choose an option: ");
            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    login(scanner);
                    break;
                case 2:
                    register(scanner);
                    break;
                case 3:
                    System.out.println("Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid option!");
            }
        }
    }

    private static void login(Scanner scanner) throws IOException {
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        if (users.containsKey(username) && users.get(username).equals(password)) {
            currentUser = username;
            userMenu(scanner);
        } else {
            System.out.println("Invalid username or password!");
        }
    }

    private static void register(Scanner scanner) throws IOException {
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        if (users.containsKey(username)) {
            System.out.println("Username already taken!");
        } else {
            users.put(username, password);
            saveUsers();
            System.out.println("Registered successfully!");
        }
    }

    private static void userMenu(Scanner scanner) throws IOException {
        while (true) {
            System.out.println("1. Create task");
            System.out.println("2. View tasks");
            System.out.println("3. Log out");
            System.out.print("Please choose an option: ");
            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    createTask(scanner);
                    break;
                case 2:
                    viewTasks(scanner);
                    break;
                case 3:
                    currentUser = "";
                    return;
                default:
                    System.out.println("Invalid option!");
            }
        }
    }

    private static void createTask(Scanner scanner) throws IOException {
        System.out.print("Enter task name: ");
        String taskName = scanner.nextLine();
        System.out.print("Enter task description: ");
        String taskDescription = scanner.nextLine();
        System.out.print("Enter task priority (1-3): ");
        int taskPriority = scanner.nextInt();
        scanner.nextLine();

        if (!tasks.containsKey(currentUser)) {
            tasks.put(currentUser, new ArrayList<>());
        }
        tasks.get(currentUser).add(taskName + "," + taskDescription + "," + taskPriority);
        saveTasks();
    }

    private static void viewTasks(Scanner scanner) throws IOException {
        if (!tasks.containsKey(currentUser) || tasks.get(currentUser).isEmpty()) {
            System.out.println("You currently have no tasks");
        } else {
            for (int i = 0; i < tasks.get(currentUser).size(); i++) {
                String[] task = tasks.get(currentUser).get(i).split(",");
                System.out.println((i+1) + ". " + task[0] + " - " + task[1] + " (Priority: " + task[2] + ")");
            }

            System.out.println("Enter task number to edit, or 0 to go back");
            int taskNum = scanner.nextInt();
            scanner.nextLine();

            if (taskNum > 0 && taskNum <= tasks.get(currentUser).size()) {
                editTask(scanner, taskNum - 1);
            }
        }
    }

    private static void editTask(Scanner scanner, int taskNum) throws IOException {
        System.out.print("Enter new task name: ");
        String taskName = scanner.nextLine();
        System.out.print("Enter new task description: ");
        String taskDescription = scanner.nextLine();
        System.out.print("Enter new task priority (1-3): ");
        int taskPriority = scanner.nextInt();
        scanner.nextLine();

        tasks.get(currentUser).set(taskNum, taskName + "," + taskDescription + "," + taskPriority);
        saveTasks();
    }

    private static void loadUsers() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("users.txt"));
        String line;
        while ((line = reader.readLine()) != null) {
            String[] parts = line.split(",");
            users.put(parts[0], parts[1]);
        }
        reader.close();
    }

    private static void saveUsers() throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("users.txt"));
        for (Map.Entry<String, String> entry : users.entrySet()) {
            writer.write(entry.getKey() + "," + entry.getValue());
            writer.newLine();
        }
        writer.close();
    }

    private static void loadTasks() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("tasks.txt"));
        String line;
        while ((line = reader.readLine()) != null) {
            String[] parts = line.split(",", 2);
            if (!tasks.containsKey(parts[0])) {
                tasks.put(parts[0], new ArrayList<>());
            }
            tasks.get(parts[0]).add(parts[1]);
        }
        reader.close();
    }

    private static void saveTasks() throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("tasks.txt"));
        for (Map.Entry<String, List<String>> entry : tasks.entrySet()) {
            for (String task : entry.getValue()) {
                writer.write(entry.getKey() + "," + task);
                writer.newLine();
            }
        }
        writer.close();
    }
}