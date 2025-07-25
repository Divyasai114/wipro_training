package program;

public class TaskReminderMain {
	public static void main(String[] args) {
        TaskReminder reminder = new DailyTaskReminder();
        reminder.remindTasks();
    }
}
