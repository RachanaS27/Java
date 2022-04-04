package Assignments;

import java.util.Comparator;


public class PersonDAO implements Comparator<PersonDTO>{

    @Override
    public int compare(PersonDTO p1, PersonDTO p2) {
        
        if(p1.getWeight()>p2.getWeight() || p1.getWeight()<p2.getWeight()){
        return (int) (p1.getWeight()-p2.getWeight());
        }
        else {
            return (int) (p1.getHeight()-p2.getHeight());
        }
        
    }
}
