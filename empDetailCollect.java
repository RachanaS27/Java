import java.util.Scanner;
import java.util.UUID;

public class empDetailCollect {

    static Scanner scan = new Scanner(System.in);
    static Scanner scan2 = new Scanner(System.in);

    public static employeeModel employeeInfo(){
        System.out.println("Enter the Name");
        String name = scan2.nextLine();
        scan.nextLine();
        System.out.println("Enter the role");
        String role = scan.nextLine();
        System.out.println("Enter the salary");
        double salary = scan.nextDouble();
        System.out.println("Enter the experience");
        int experience = scan.nextInt();
        System.out.println("Enter the company");
        String company = scan2.nextLine();
        scan.nextLine();
        System.out.println("Enter the address");
        String address = scan.nextLine();
        System.out.println("Enter the phoneNum");
        double phoneNum = scan.nextDouble();

        
        employeeModel emp = new employeeModel(UUID.randomUUID().toString(), name, role, salary, experience, company, address, phoneNum);
        return emp;
    }

    public static void main(String[] args) {
        
        while(true)
        {
         System.out.println("1. Enter the employee details: ");   
         System.out.println("2. Display the employee details: ");  
         System.out.println("3. Delete the employee details by Id: ");  
         System.out.println("4. Exit: ");   
         System.out.println("Enter the choice: ");
         int choice = scan.nextInt();
         switch(choice)
         {
             case 1:employeeModel emp1 = employeeInfo();
                    String s1 = new fileDB().addEmp(emp1);
                    System.out.println(s1+ "\n");
                    break;
             case 2:
                    String s2 = new fileDB().getAll();
                    System.out.println(s2+ "\n");
                    break;
             case 3:
                    System.out.println("Enter the Id");
                    scan.next();
                    String id1  = scan.nextLine();
                    String s3 = new fileDB().deleteEmp(id1);
                    System.out.println(s3+ "\n");
                    break;
             case 4:
                    System.exit(0);
                    break;
             default:
                    System.err.println("Enter valid number");
         }

        }
    }


}

