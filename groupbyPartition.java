import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class employeeGroup{
    String name;
    double salary;
    String role;
    String state;
    public employeeGroup() {
    }
    public employeeGroup(String name, double salary, String role, String state) {
        this.name = name;
        this.salary = salary;
        this.role = role;
        this.state = state;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
    @Override
    public String toString() {
        return "EmployeeGroup [name=" + name + ", role=" + role + ", salary=" + salary + ", state=" + state + "]";
    }

    
}


public class groupbyPartition {
    static List<employeeGroup> l1 = new ArrayList<>();

    public static void main(String[] args) {
        
        employeeGroup eg1 = new employeeGroup("rahul", 77000, "developer", "karnataka");
        employeeGroup eg2 = new employeeGroup("rakesh", 58000, "developer", "karnataka");
        employeeGroup eg3 = new employeeGroup("rachana", 77000, "developer", "karnataka");
        employeeGroup eg4 = new employeeGroup("santhosh", 67000, "testing", "Tamil Nadu");
        employeeGroup eg5 = new employeeGroup("deepak", 88000, "sales", "karnataka");
        employeeGroup eg6 = new employeeGroup("sindhu", 52000, "testing", "Tamil Nadu");
        employeeGroup eg7 = new employeeGroup("lakshmi", 77000, "developer", "Andrapradesh");
        employeeGroup eg8 = new employeeGroup("geetha", 44000, "testing", "Tamil Nadu");
        employeeGroup eg9 = new employeeGroup("prakash", 34000, "sales", "Andrapradesh");
        employeeGroup eg10 = new employeeGroup("kamala", 34000, "sales", "karnataka");

        l1.add(eg1);
        l1.add(eg2);
        l1.add(eg3);
        l1.add(eg4);
        l1.add(eg5);
        l1.add(eg6);
        l1.add(eg7);
        l1.add(eg8);
        l1.add(eg9);
        l1.add(eg10);

        l1.stream().collect(Collectors.groupingBy(employeeGroup::getRole)).
        forEach((k,v)->{
            System.out.println("key "+k);
            v.forEach(e->{
                System.out.println("value "+e);
            });
        });

        l1.stream().collect(Collectors.groupingBy(employeeGroup::getState)).
        forEach((k,v)->{
            System.out.println("key "+k);
            v.forEach(e->{
                System.out.println("value "+e);
            });
        });

        l1.stream().collect(Collectors.groupingBy(employeeGroup::getSalary)).
        forEach((k,v)->{
            System.out.println("key "+k);
            v.forEach(e->{
                System.out.println("value "+e);
            });
        });

        l1.stream().collect(Collectors.partitioningBy(e->(e.salary>60000)))
        .forEach((k,v)->{
            if(k==true)
            {
                System.out.println("Employees with salary greater than 60000 are : ");
                v.forEach(e-> System.out.println(e.getName()));
            }else{
                System.out.println("Employees with salary less than 60000 are : ");
                v.forEach(e-> System.out.println(e.getName()));
            }
        });

        
    }
}
