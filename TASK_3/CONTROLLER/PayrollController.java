package CONTROLLER;
import MODEL.Employee;
import MODEL.Payroll;
import VIEW.PayrollView;
import MODEL.Employee;
public class PayrollController {
    private Payroll model;
    private PayrollView view;

    // Constructor to initialize the model and view
    public PayrollController(Payroll model, PayrollView view) {
        this.model = model;
        this.view = view;
    }

    // Method to calculate and display the salary of an employee
    public void displayEmployeeSalary(Employee employee) {
    }
}