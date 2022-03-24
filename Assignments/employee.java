package Assignments;

public class employee implements printable,sortable{

    int empId;
    String empName;
    String empRole;
    String empState;
    double salary;

    public employee() {
    }

    

    public int getEmpId() {
        return empId;
    }



    public void setEmpId(int empId) {
        this.empId = empId;
    }



    public String getEmpName() {
        return empName;
    }



    public void setEmpName(String empName) {
        this.empName = empName;
    }



    public String getEmpRole() {
        return empRole;
    }



    public void setEmpRole(String empRole) {
        this.empRole = empRole;
    }



    public String getEmpState() {
        return empState;
    }



    public void setEmpState(String empState) {
        this.empState = empState;
    }



    public double getSalary() {
        return salary;
    }



    public void setSalary(double salary) {
        this.salary = salary;
    }



    public employee(int empId, String empName, String empRole, String empState, double salary) {
        this.empId = empId;
        this.empName = empName;
        this.empRole = empRole;
        this.empState = empState;
        this.salary = salary;
    }

    @Override
    public void print() {
        System.out.println("employee class print method");  
        System.out.println(this.empId+" "+this.empName+" "+this.empRole+" "+this.empState);      
    }
    
    @Override
    public void sortAll() {
        int[] num = {3,2,5,1,4};
        int temp;
        for(int i=0;i<num.length;i++)
        {
            for(int j=0;j<num.length - 1;j++)
            {
                if(num[j]>num[i])
                {
                    temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
        }
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }
    }
        
}
