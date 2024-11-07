
public class EmployeeService {
    private EmployeeDataAccess repository;
     private Notifier notifier;

    public EmployeeService(EmployeeDataAccess repository,Notifier notifier) {
        this.repository = repository;
         this.notifier=notifier;
    }   // constructor

    public void addEmployee(Employee employee) {
    }  // method for add a employee to database

    public Employee getEmployee(int id) {
        return repository.findById(id);
    }   // find a employee from database

    public void deleteEmployee(int id) {

    }  // delete a employee from database
    public void adjustEmployeeSalary(Employee employee, double newSalary) {
        // adjust employee salary and sent email or SMS to updated salary
    }
}
