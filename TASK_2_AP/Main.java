public class Main {
    public static void main(String[] args) {
        // Set up dependencies
        EmployeeManager repository = new EmployeeManager();
        Notifier notifier = new SMSNotification();
        //or
        Notifier notifier1 = new EmailNotification();
        EmployeeService employeeService = new EmployeeService(repository, notifier);
        EmployeeService employeeService1 = new EmployeeService(repository, notifier1);
        // Initialize HR and Manager
        HR hr = new HR(repository);
        Manager manager = new Manager(employeeService);

        // Onboard a new employee
        FullTimeEmployee employee = new FullTimeEmployee(1, "Alice", "alice@example.com", "555-1234", "123 Main St", 50000, "Junior Developer");
        hr.onboardEmployee(employee);

        // Apply a bonus to the employee
        hr.applyBonus(employee, 5000);

        // Approve a salary increase and promote employee
        manager.approveSalaryIncrease(employee, 10);
        manager.promoteEmployee(employee, "Senior Developer", 10000);
    }
}
