
public class Manager {
    private EmployeeService employeeService;

    public Manager(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    public void approveSalaryIncrease(Employee employee, double percentageIncrease) {
       // logic for evaluating performance
    }

    public void evaluateEmployeePerformance(Employee employee) {

    }

    public void promoteEmployee(Employee employee, String newTitle, double raiseAmount) {

    }
}
