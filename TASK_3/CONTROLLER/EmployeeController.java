package CONTROLLER;
import MODEL.EmployeeManager;
import VIEW.EmployeeView;

public class EmployeeController {
    private EmployeeManager model;
    private EmployeeView view;
    public EmployeeController(EmployeeManager model, EmployeeView view) {
        this.model = model;
        this.view = view;
    }
    // Method to promote an employee
    public void promoteEmployee(int id, String newRole,int salary) {
    }

}
