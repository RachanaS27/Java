package employeeManagementSys;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class employeeRunner {
   static Scanner scan = new Scanner(System.in);
   static Scanner scan1 = new Scanner(System.in);
   static List<employeeDto> l1 = employeeDAO.getList1();
   
    public static void main(String[] args) {
        employeeDAO empDAO = new employeeDAO();

        while(true)
        {
            int userChoice;
            System.out.println("Welcome to Employee Management System");
            System.out.println("1. Add employees");
            System.out.println("2. Display employees");
            System.out.println("3. Update employees");
            System.out.println("4. Delete employees");
            System.out.println("5. group employee by role");
            System.out.println("6. partition employee by salary");
            System.out.println("7. load data from file");
            System.out.println("8. Exit");

            userChoice= scan.nextInt();
            switch(userChoice)
            {
                case 1:employeeDto empDTO =employeeDAO.employeeInformation(); 
                        System.out.println(empDAO.addEmployee(empDTO));
                        break;
                case 2:System.out.println(empDAO.printEmployee());
                        break;
                case 3:
                        System.out.println("Enter id ");
                        String id = scan1.nextLine();
                        System.out.println("the id provided by you is : "+id);
                        System.out.println("Enter new salary ");
                        Double salary1 = scan.nextDouble();
                        System.out.println("the salary provided by you is : "+salary1);

                        System.out.println(empDAO.updateEmployee(id, salary1));
                        break;
                case 4:
                        System.out.println("Enter the id");
                        String id1 =scan1.nextLine();
                        System.out.println("the id provided by you is : "+id1);
                        System.out.println(empDAO.deleteEmployee(id1));
                        break;
                case 5: 
                        System.out.println("Get employees group by Role");
                        l1.stream().collect(Collectors.groupingBy(employeeDto::getRole)).
                        forEach((k,v)->{
                        System.out.println("key "+k);
                        v.forEach(e->{
                        System.out.println("value "+e);
                                });
                        });
                        break;
                case 6:
                        System.out.println("Get employees partitioned by salary");
                        l1.stream().collect(Collectors.partitioningBy(e->(e.getSalary()>1000)))
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
                        break;

                case 7: List<employeeDto> l2 = employeeDAO.getList1();
                        new employeeDAO().loadData(l2);
                        break;

                case 8:System.out.println("Thank you for using Employee Management System");
                        scan.close();
                        System.exit(0);
                        break;
                default:System.out.println("enter valid choice");
                break;
            }


            
        }
    }
}
