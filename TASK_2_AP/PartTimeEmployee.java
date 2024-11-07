public class PartTimeEmployee extends Employee {

    public PartTimeEmployee(int id, String name, String email, String phoneNumber, String address, double salary, String title) {
        super(id, name, email, phoneNumber, address, salary, title);     // call super class means Employee class
    }

    @Override
    public String getEmployeeType() {
        return "Part Time";
    }
}
