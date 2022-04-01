package employeeManagementSys;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;

public class employeeDAO {

    static Scanner scan = new Scanner(System.in);
    static Scanner scan2 = new Scanner(System.in);
    static List<employeeDto> list = new ArrayList<>();
    static {
       new employeeDAO().loadData(list);
    }
    
    public static employeeDto employeeInformation(){
        //System.out.println("Enter the Id");
        //String id = scan2.nextLine();
        System.out.println("Enter the Name");
        String name = scan2.nextLine();
        scan.nextLine();
        System.out.println("Enter the role");
        String role = scan.nextLine();
        System.out.println("Enter the salary");
        double salary = scan.nextDouble();
        System.out.println("Enter the company");
        String company = scan2.nextLine();
        scan.nextLine();
        System.out.println("Enter the address");
        String address = scan.nextLine();
        System.out.println("Enter the phoneNum");
        double phoneNum = scan.nextDouble();

        //employeeDto emp = new employeeDto(id, name, role, salary, company, address, phoneNum);
        employeeDto emp = new employeeDto(UUID.randomUUID().toString(), name, role, salary, company, address, phoneNum);
        //System.out.println(emp.toString());
        //System.out.println("the above employee is added");
        return emp;
    }

    public employeeDto destructureString(List<String> l) {
        employeeDto model = new employeeDto();
        for (int i = 0; i < l.size(); i++) {
            if (i == 0) {
                model.setAddress(l.get(i).replace("address=", ""));
            }
            if (i == 1) {
                model.setCompany(l.get(i).replace("company=", ""));
            }
            if (i == 2) {
                model.setId(l.get(i).replace("id=", ""));
            }
            if (i == 3) {
                model.setName(l.get(i).replace("name=", ""));
            }
            if (i == 4) {
                model.setPhoneNum(Double.parseDouble(l.get(i).replace("phoneNum=", "")));    
            }
            if (i == 5) {
                model.setRole(l.get(i).replace("role=", ""));
            }
            if (i == 6) {
                String salary = l.get(i).replace("salary=", "");
                salary = salary.substring(0, salary.length() - 1);
                model.setSalary(Double.parseDouble(salary));
            }
        }
        //System.out.println(model.toString());
        return model;
    }

    public void loadData(List<employeeDto> list2) {
        try {
            FileReader reader = new FileReader(new File("employeeManagementSys/fileStore.txt"));
            BufferedReader br = new BufferedReader(reader);

            while (br.read() != -1) {
                String d = br.readLine();
                d = d.substring(12, d.length() - 1);
                employeeDto model = destructureString(Arrays.asList(d.split(", ")));

                list2.add(model);
            }
            list2.forEach(System.out::println);
            System.out.println("Successfully Loaded Data");
        } catch (IOException f) {
            System.out.println(f.getMessage());
        }
    }

    public String addEmployee(employeeDto emp){
        
        File file = new File("employeeManagementSys/fileStore.txt");
        try {
            list.add(emp);
            FileWriter writer = new FileWriter(file);
            StringBuffer sb = new StringBuffer();

            for (employeeDto e : list) {
                sb.append(e.toString() + "\n");
            }
            writer.append(sb.toString());

            writer.close();
            return "Successfully Inserted Data";
        } catch (IOException e) {
            return "Error Occured: " + e.getMessage();
        }
    }

    public String updateEmployee(String id,double salary){
        System.out.println("the list "+list);
        System.out.println();
        
        try {
            FileWriter writer = new FileWriter(new File("employeeManagementSys/fileStore.txt"));
            for (employeeDto e : list) {
               
                if (e.getId().equals(id)) {
                    System.out.println(e.getId()+" "+id);
                    e.setSalary(salary);
                    String d =e.toString();
                    writer.append(d);
                }else{
                    String d =e.toString();
                    writer.append(d);
                }
            }
            writer.close();
            return "Updated salary of Employee with Id=" + id;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return "Id is incorrect";
    }
    
    public String printEmployee(){
        return list.toString();
    }

    public String deleteEmployee(String id){
        try {
            for (employeeDto e : list) {
                if (e.getId().equals(id)) {
                    list.remove(e);
                    FileWriter writer = new FileWriter(new File("employeeManagementSys/fileStore.txt"));
                    String data = list.toString();
                    String d1 = data.substring(1, data.length()-1);
                    String[] d2 = d1.split("employeeDto ");
                    for (String string : d2) {
                       System.out.println(string);
                        writer.append(string);
                    }
                   

                    writer.close();
                    return "Deleted Employee with Id=" + id;
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return "Id is incorrect";


    }

    public static List<employeeDto> getList1(){
        return list;
    }

 
}
