package Assignments;

public class employee implements printable{

    int empId;
    String empName;
    String empRole;
    String empState;

    public employee() {
    }

    public employee(int empId, String empName, String empRole, String empState) {
        this.empId = empId;
        this.empName = empName;
        this.empRole = empRole;
        this.empState = empState;
    }

    @Override
    public void print() {
        System.out.println("employee class print method");  
        System.out.println(this.empId+" "+this.empName+" "+this.empRole+" "+this.empState);      
    }
    
}
