package MAIN;

import CONTROLLER.EmployeeController;
import MODEL.Address;
import MODEL.EmployeeManager;
import MODEL.FullTimeEmployee;
import VIEW.EmployeeView;

public class Main {
    public static void main(String[] args) {
        // Create the model, view, and controller objects
        EmployeeManager model = new EmployeeManager();
        EmployeeView view = new EmployeeView();
        Address address = new Address("hallRoad","KHULNA","KHULNA","5400");
        EmployeeController controller = new EmployeeController(model, view);

        // Add a sample employee
        FullTimeEmployee employee = new FullTimeEmployee(1,"sobuj",address,"1732xxxx","dsghfd@gmail.com",4516356,"Software Engineer");
        model.save(employee);

        // Display employee details before promotion
        System.out.println("Before Promotion:");
        controller.promoteEmployee(1, "Senior Software Engineer", 5000);

        // Display employee details after promotion
        System.out.println("\nAfter Promotion:");
        controller.promoteEmployee(1, "Lead Software Engineer", 10000);
    }
}
