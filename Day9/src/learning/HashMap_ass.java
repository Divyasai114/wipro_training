package learning;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMap_ass {
    public static void main(String[] args) {
        Map<String, Integer> studentScores = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Add student");
            System.out.println("2. Get student's marks");
            System.out.println("3. Exit");
            System.out.print("Your choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // Consume the leftover newline

            switch(choice) {
                case 1:
                    System.out.print("Enter the student's name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter the student's marks: ");
                    int marks = sc.nextInt();
                    sc.nextLine(); // Consume newline left by nextInt
                    studentScores.put(name, marks);
                    System.out.println("Student added successfully.");
                    break;
                case 2:
                    System.out.print("Enter student's name to get marks: ");
                    String studentName = sc.nextLine();
                    Integer studentMarks = studentScores.get(studentName);
                    if(studentMarks != null) {
                        System.out.println("Marks for " + studentName + " is: " + studentMarks);
                    }
                    else {
                        System.out.println("Student not found.");
                    }
                    break;
                case 3:
                    System.out.println("Exiting.......");
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again!");
            }
        }
    }
}
