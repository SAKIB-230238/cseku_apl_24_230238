package CONTROLLER;
import MODEL.FullTimeEmployee;
import MODEL.EmployeeManager;
import VIEW.FullTimeEmployeeView;

public class FullTimeEmployeeController {
    private EmployeeManager model;
    private FullTimeEmployeeView view;
    public FullTimeEmployeeController(EmployeeManager model, FullTimeEmployeeView view) {
        this.model = model;
        this.view = view;
    }
    public void addFullTimeEmployee(FullTimeEmployee employee) {
    }  // add a fullTime employee to database
    public void displayFullTimeEmployee(int id) {
    }   // see details of an employee
    public void removeFullTimeEmployee(int id) {
    }   // remove a employee from database
}
