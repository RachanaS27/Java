package employeeManagementSys;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class listEx {
    static List<String> number = new ArrayList<>();
    static{
        listEx.loadFromfile(number);
    }
    
    public static void addNum(String n)
    {
         File file = new File("employeeManagementSys/element.txt");
        try {
            number.add(n);
            FileWriter writer = new FileWriter(file);
            StringBuffer sb = new StringBuffer();

            for (String e : number) {
                sb.append(e + "\n");
            }
            writer.append(sb.toString());

            writer.close();
            System.out.println("Successfully Inserted Data");
        } catch (IOException e) {
            System.out.println("Error Occured: " + e.getMessage());
        }
    }

    public static void loadFromfile(List<String> list2) {
        try {
            FileReader reader = new FileReader(new File("employeeManagementSys/element.txt"));
            BufferedReader br = new BufferedReader(reader);

            while (br.read() != -1) {
                String d = br.readLine();
                System.out.println(d);
                list2.add(d);
            }
            list2.forEach(System.out::println);
            System.out.println("Successfully Loaded Data");
        } catch (IOException f) {
            System.out.println(f.getMessage());
        }
    }

    public static void printNum(){
        System.out.println(number);
    }




    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Scanner scan1 = new Scanner(System.in);

        int choice1 ;
        String newNum;
        while(true)
        {
            System.out.println("Welcome");
            System.out.println("1. Enter the numbers");
            System.out.println("2. Enter number from file");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            choice1 = scan.nextInt();
            switch(choice1)
            {
                case 1: newNum = scan1.nextLine();
                        listEx.addNum(newNum);
                        break;
                case 2: listEx.loadFromfile(number);
                        break;
                case 3: listEx.printNum();
                        break;
                case 4: System.out.println("thank you");
                        System.exit(0);
                        scan.close();
                        scan1.close();
                        break;
                default:System.out.println("enter valid choice");
                        break;
            }


        }
        
    }
}
