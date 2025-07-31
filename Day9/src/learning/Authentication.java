package learning;
import java.util.LinkedList;
import java.util.Scanner;

class User {
    private String username;
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }
    public String getUsername() {
        return username;
    }
    public String getPassword() {
        return password;
    }
}

public class Authentication {
    private LinkedList<User> userList;

    public Authentication() {
        userList = new LinkedList<>();
    }

    // Register a new user
    public void register(String username, String password) {
        // Check if username already exists
        for (User user : userList) {
            if (user.getUsername().equals(username)) {
                System.out.println("Username already exists. Choose a different one.");
                return;
            }
        }
        userList.add(new User(username, password));
        System.out.println("User registered successfully!!");
    }

    // Login user
    public boolean login(String username, String password) {
        for (User user : userList) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                return true; // Login successful
            }
        }
        return false; // Login failed
    }

    public static void main(String[] args) {
        Authentication auth = new Authentication();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n----- MENU -----");
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter username: ");
                    String regUsername = sc.nextLine();
                    System.out.print("Enter password: ");
                    String regPassword = sc.nextLine();
                    auth.register(regUsername, regPassword);
                    break;
                case 2:
                    System.out.print("Enter username: ");
                    String logUsername = sc.nextLine();
                    System.out.print("Enter password: ");
                    String logPassword = sc.nextLine();
                    if (auth.login(logUsername, logPassword)) {
                        System.out.println("Login successful! Welcome, " + logUsername + "!");
                    } else {
                        System.out.println("Login failed. Invalid credentials.");
                    }
                    break;
                case 3:
                    System.out.println("Exiting...");
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
