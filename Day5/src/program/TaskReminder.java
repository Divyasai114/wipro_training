package program;
import java.util.ArrayList;

abstract class TaskReminder {
    abstract void remindTasks();
}
class DailyTaskReminder extends TaskReminder {
    public void remindTasks() {
        // Initialize daily tasks
        ArrayList<String> tasks = new ArrayList<>();
        tasks.add("Check email");
        tasks.add("Attend team meeting");
        tasks.add("Complete assignment");
        tasks.add("Exercise");
        System.out.println("Today's tasks:");
        for (String task : tasks) {
            System.out.println("- " + task);
        }
    }
}
