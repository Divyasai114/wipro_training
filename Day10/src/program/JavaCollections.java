package program;
import java.util.ArrayList;

public class JavaCollections {
    static class Department {
        private String name;
        private double sales;
        private double expenses;

        public Department(String name, double sales, double expenses) {
            this.name = name;
            this.sales = sales;
            this.expenses = expenses;
        }
        public double getProfit() {
            return sales - expenses;
        }
        public String getName() {
            return name;
        }
    }

    public static void main(String[] args) {
        ArrayList<Department> departments = new ArrayList<>();
        departments.add(new Department("Sales", 200000, 150000));
        departments.add(new Department("Marketing", 15000, 10100));
        departments.add(new Department("HR", 30000, 20000));

        // Sort by profit descending
        departments.sort((d1, d2) -> Double.compare(d2.getProfit(), d1.getProfit()));

        System.out.println("Departments sorted by profit (descending):");
        for (Department dept : departments) {
            System.out.println(dept.getName() + " profit: " + dept.getProfit());
        }
    }
}
