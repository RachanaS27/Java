package employeeManagementSys;

public class employeeDto {

    private String id;
    private String name;
    private String role;
    private double salary;
    private String company;
    private String address;
    private double phoneNum;

    
    public employeeDto() {
    }
    public employeeDto(String id, String name, String role, double salary, String company, String address,
            double phoneNum) {
        this.id = id;
        this.name = name;
        this.role = role;
        this.salary = salary;
        this.company = company;
        this.address = address;
        this.phoneNum = phoneNum;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public String getCompany() {
        return company;
    }
    public void setCompany(String company) {
        this.company = company;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public double getPhoneNum() {
        return phoneNum;
    }
    public void setPhoneNum(double phoneNum) {
        this.phoneNum = phoneNum;
    }
    @Override
    public String toString() {
        return "employeeDto [address=" + address + ", company=" + company + ", id=" + id + ", name=" + name
                + ", phoneNum=" + phoneNum + ", role=" + role + ", salary=" + salary + "]\n";
    }

    
}