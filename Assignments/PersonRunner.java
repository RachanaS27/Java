package Assignments;

import java.util.TreeSet;

public class PersonRunner {
    public static void main(String[] args) {
        PersonDTO p1 = new PersonDTO("Akash", 180, 65);
        PersonDTO p2 = new PersonDTO("Abi", 185, 75);
        PersonDTO p3 = new PersonDTO("Anusha", 165, 60);
        PersonDTO p4 = new PersonDTO("Bina", 170, 66);
        PersonDTO p5 = new PersonDTO("Bharath", 170, 75);
        PersonDTO p6 = new PersonDTO("Chirag", 160, 62);
        PersonDTO p7 = new PersonDTO("Dhanush", 156, 69);

        TreeSet<PersonDTO> ts = new TreeSet<>(new PersonDAO());
        ts.add(p1);
        ts.add(p2);
        ts.add(p3);
        ts.add(p4);
        ts.add(p5);
        ts.add(p6);
        ts.add(p7);

        for (PersonDTO personDTO : ts) {
            System.out.println(personDTO);
        }
       



    }
}
