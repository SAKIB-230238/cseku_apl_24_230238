package MODEL;

public class FullTimeEmployee extends Employee {
    public FullTimeEmployee(int id, String name,Address address,String phoneNumber,String email, double salary, String title) {
        super(id, name, address,email, salary,title);
    }
    @Override
    public String getEmployeeType() {
        return "Full-Time";
    }
}