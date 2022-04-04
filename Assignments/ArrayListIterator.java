package Assignments;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayListIterator {
    public static void main(String[] args) {
        ArrayList<Integer> numArrayList = new ArrayList<>();
        numArrayList.add(10);
        numArrayList.add(76);
        numArrayList.add(11);
        numArrayList.add(12);
        numArrayList.add(23);
        numArrayList.add(56);
        numArrayList.add(37);

        ListIterator<Integer> li = numArrayList.listIterator(numArrayList.size());

        while(li.hasPrevious()){
            System.out.println(li.previous());
        }

    }
}
