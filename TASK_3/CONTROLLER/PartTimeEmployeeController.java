package CONTROLLER;
import MODEL.PartTimeEmployee;
import MODEL.EmployeeManager;
import VIEW.PartTimeEmployeeView;

public class PartTimeEmployeeController {
    private EmployeeManager model;
    private PartTimeEmployeeView view;
    public PartTimeEmployeeController(EmployeeManager model, PartTimeEmployeeView view) {
        this.model = model;
        this.view = view;
    }
    public void addPartTimeEmployee(PartTimeEmployee employee) {
    }   // add partTime employee to the database
    public void displayPartTimeEmployee(int id) {
    }   // view details of partTime employee
    public void removePartTimeEmployee(int id) {
    }   // remove a employee from database
}
