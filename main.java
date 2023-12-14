import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

class Expense {
    String category;
    double amount;
    String description;

    public Expense(String category, double amount, String description) {
        this.category = category;
        this.amount = amount;
        this.description = description;
    }
}

class ExpenseTracker {
    private Map<String, Double> budgets = new HashMap<>();
    private List<Expense> expenses = new ArrayList<>();

    public void logExpense(String category, double amount, String description) {
        expenses.add(new Expense(category, amount, description));
        System.out.println("Expense logged successfully.");
    }

    public void setBudget(String category, double budgetAmount) {
        budgets.put(category, budgetAmount);
        System.out.println("Budget set successfully for category: " + category);
    }

    public void visualizeExpenses() {
        // Visualization code (not implemented in this simplified example)
        System.out.println("Visualization of expenses (graph or chart) goes here.");
    }

    public void remindAboutDueBills() {
        // Reminder code (not implemented in this simplified example)
        System.out.println("Reminder: Upcoming bills or budget limits approaching.");
    }

    public static void main(String[] args) {
        ExpenseTracker expenseTracker = new ExpenseTracker();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Log Expense\n2. Set Budget\n3. Visualize Expenses\n4. Remind about Due Bills\n5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter expense category: ");
                    String category = scanner.nextLine();
                    System.out.print("Enter expense amount: ");
                    double amount = scanner.nextDouble();
                    scanner.nextLine();  // Consume the newline character
                    System.out.print("Enter expense description: ");
                    String description = scanner.nextLine();
                    expenseTracker.logExpense(category, amount, description);
                    break;
                case 2:
                    System.out.print("Enter budget category: ");
                    String budgetCategory = scanner.nextLine();
                    System.out.print("Enter budget amount: ");
                    double budgetAmount = scanner.nextDouble();
                    expenseTracker.setBudget(budgetCategory, budgetAmount);
                    break;
                case 3:
                    expenseTracker.visualizeExpenses();
                    break;
                case 4:
                    expenseTracker.remindAboutDueBills();
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
