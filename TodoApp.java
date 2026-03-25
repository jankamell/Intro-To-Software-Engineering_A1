import java.util.ArrayList;
import java.util.Scanner;

public class TodoApp {

    public static void main(String[] args) {

        Scanner task_input = new Scanner(System.in);
        ArrayList<String> tasks = new ArrayList<>();

        int choice = 0;

        while (choice != 4) {

            System.out.println("\n#--- To Do List ---#");
            System.out.println("1. Add Task(s)");
            System.out.println("2. View Tasks");
            System.out.println("3. Remove Task");
            System.out.println("4. Exit");
            System.out.print("Choose: ");

            choice = task_input.nextInt();
            task_input.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("How many tasks do you want to add?? ");
                    int task_no = task_input.nextInt();
                    task_input.nextLine();

                    for (int i = 1; i <= task_no; i++) {
                        System.out.print("Enter task " + i + ": ");
                        String task = task_input.nextLine();
                        tasks.add(task);
                    }

                    System.out.println("Tasks added successfully!");
                    break;

                case 2:
                    System.out.println("\nYour Tasks:");
                    if (tasks.isEmpty()) {
                        System.out.println("No tasks added yet.");
                    } else {
                        for (int i = 0; i < tasks.size(); i++) {
                            System.out.println((i + 1) + ". " + tasks.get(i));
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter task number you want remove: ");
                    int num = task_input.nextInt();

                    if (num > 0 && num <= tasks.size()) {
                        tasks.remove(num - 1);
                        System.out.println("Task removed!");
                    } else {
                        System.out.println("Invalid number.");
                    }
                    break;

                case 4:
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        }

        task_input.close();
    }
}