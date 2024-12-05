package CONTROLLER;
import MODEL.EmployeeManager;
public class ReportController {
    private EmployeeManager employeeManager;
    public ReportController(EmployeeManager employeeManager) {
        this.employeeManager = employeeManager;
    }
    public void generateEmployeeReport() {
    }   // generate all employee report

    public void generatePayrollReport() {
    }    // generate all payrollReport
}