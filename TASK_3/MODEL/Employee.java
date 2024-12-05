package MODEL;
public abstract class Employee {
    private int id;
    private double salary;
    private Address address;
    private String name, email, phoneNumber,title;

    public Employee(int id, String name, Address address, String phoneNumber, double salary, String title) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.salary = salary;
        this.title = title;
    }

    // Getter and Setter methods for the attributes
    public void setId(int id) {
        this.id = id;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Address getAddress() {
        return address;
    }

    public double getSalary() {
        return salary;
    }

    public String getTitle() {
        return title;
    }

    // Abstract method to return the employee type
    public abstract String getEmployeeType();

    // Method to promote employee
    public void promote(String newTitle, double salaryIncrease) {
        this.title = newTitle;
        this.salary += salaryIncrease;  // Increase salary by the specified amount
    }
}