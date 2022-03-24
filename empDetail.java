import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.InvalidPathException;

public class empDetail {

    String name;
    String role;
    int salary;
    String state;

    
    public empDetail(String name, String role, int salary, String state) {
        this.name = name;
        this.role = role;
        this.salary = salary;
        this.state = state;
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


    public int getSalary() {
        return salary;
    }


    public void setSalary(int salary) {
        this.salary = salary;
    }


    public String getState() {
        return state;
    }


    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "empDetail [name=" + name + ", role=" + role + ", salary=" + salary + ", state=" + state + "]";
    }


    public static void main(String[] args) throws IOException {
        try {
            empDetail em1 = new empDetail("Rahul", "testing", 67000, "karnataka");
            File file = new File("empDetail.txt");
            FileReader reader = new FileReader(file);
            String data = "";
            FileWriter writer = new FileWriter(file);
            String detail = em1.toString();
            writer.append(data+ detail);
            int letter = reader.read();
            while(letter!=-1)
            {
                char l = (char)letter;
                //data += l ;
                System.out.print(l);
                letter = reader.read();
            }
            reader.close();
            writer.close();
            
        } catch (FileNotFoundException e) {
            System.out.println("No such file exists");
        }
        catch(InvalidPathException e){
            System.out.println("Cannot read the file");
        }

    }
    }
