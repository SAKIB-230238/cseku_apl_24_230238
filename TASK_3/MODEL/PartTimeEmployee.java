package MODEL;
public class PartTimeEmployee extends Employee {
    private int hoursWorkedPerWeek;
    public PartTimeEmployee(int id, String name, Address address, String phoneNumber, double salary, String role, int hoursWorkedPerWeek) {
        super(id, name, address,phoneNumber,salary, role);
        this.hoursWorkedPerWeek = hoursWorkedPerWeek;
    }
    public int getHoursWorkedPerWeek() { return hoursWorkedPerWeek; }
    public void setHoursWorkedPerWeek(int hoursWorkedPerWeek) { this.hoursWorkedPerWeek = hoursWorkedPerWeek; }

    @Override
    public String getEmployeeType() {
        return "Part-Time";
    }
}