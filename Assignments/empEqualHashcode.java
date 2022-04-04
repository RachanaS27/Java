package Assignments;

import java.util.HashMap;

public class empEqualHashcode {
    private String name;
    private double salary;
    private int experience;
    public empEqualHashcode() {
    }
    public empEqualHashcode(String name, double salary, int experience) {
        this.name = name;
        this.salary = salary;
        this.experience = experience;
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
    public int getExperience() {
        return experience;
    }
    public void setExperience(int experience) {
        this.experience = experience;
    }
    @Override
    public String toString() {
        return "empEqualHashcode [experience=" + experience + ", name=" + name + ", salary=" + salary + "]";
    }
   

    @Override
    public int hashCode() {
        int n = (int) Math.random();
        return n;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        empEqualHashcode other = (empEqualHashcode) obj;
        if (experience != other.experience)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (Double.doubleToLongBits(salary) != Double.doubleToLongBits(other.salary))
            return false;
        return true;
    }
    public static void main(String[] args) {
        HashMap<empEqualHashcode,Integer> emp = new HashMap<>();
        
        empEqualHashcode e1 = new empEqualHashcode("Amit", 77777, 9);
        empEqualHashcode e2 = new empEqualHashcode("Bharath", 87689, 5);
        empEqualHashcode e3 = new empEqualHashcode("Chandan", 65000, 3);
        empEqualHashcode e4 = new empEqualHashcode("Harsha", 50500, 3);

        emp.put(e1, 1);
        emp.put(e2, 2);
        System.out.println(emp);
        emp.put(e3, 3);
        emp.put(e4, 5);

        System.out.println(emp);

        for(HashMap.Entry<empEqualHashcode , Integer> i:emp.entrySet()){
        System.out.println("Key : "+i.getKey()+" value : "+i.getValue());
        }
        System.out.println(emp.hashCode());
        System.out.println(emp.get(e1));
        System.out.println(emp.get(e4));
        System.out.println(emp.get(e3));
        System.out.println(emp.get(e2));

    }
    

}
