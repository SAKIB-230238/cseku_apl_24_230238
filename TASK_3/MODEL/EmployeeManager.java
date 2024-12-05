package MODEL;

import java.util.HashMap;
import java.util.Map;

public class EmployeeManager {
    private Map<Integer, Employee> database = new HashMap<>();

    // Save an employee to the database
    public void save(Employee employee) {
        database.put(employee.getId(), employee);
    }

    // Find an employee by ID
    public Employee findById(int employeeId) {
        return database.get(employeeId);
    }

    // Delete an employee
    public void delete(int employeeId) {
        database.remove(employeeId);
    }

    // promotion of an employee
    public void promoteEmployee(int id, String newRole,int salary) {
    }

    public void addEmployee(FullTimeEmployee employee) {
        save(employee);
    }
}