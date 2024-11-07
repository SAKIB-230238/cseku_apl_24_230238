
public class HR {
    private EmployeeDataAccess employeeRepository;

    public HR(EmployeeDataAccess employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public void onboardEmployee(Employee employee) {
     // onboarding employee
    }

    public void adjustSalary(Employee employee, double newSalary) {

    }

    public void applyBonus(Employee employee, double bonusAmount) {
    }

    public void applyDeduction(Employee employee, double deductionAmount) {

    }

    public void offboardEmployee(int employeeId) {

    }
}
