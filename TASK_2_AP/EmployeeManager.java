import java.util.HashMap;
import java.util.Map;
public class EmployeeManager implements EmployeeDataAccess
{
    private Map<Integer, Employee> employees = new HashMap<>();

    @Override
    public void save(Employee employee) {
       // save employee details in database
    }

    @Override
    public void delete(int employeeId) {
      // delete a employee details from database
    }

    @Override
    public Employee findById(int employeeId) {
        return null;   // find any employee by his employeeId
    }
}


