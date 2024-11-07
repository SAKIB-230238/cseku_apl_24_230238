public interface EmployeeDataAccess {
    void save(Employee employee);   // add new employee details in database
    void delete(int employeeId);   // delete a employee from database
    Employee findById(int employeeId);   // find a employee from database by employeeId
}
