package Assignments;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class hashLinkSet {
    public static void main(String[] args) {
        HashSet<Integer> number = new HashSet<>();
        number.add(12);
        number.add(2);
        number.add(32);
        number.add(54);
        number.add(11);
        number.add(10);

        System.out.println("Hash set output");
        System.out.println(number);

        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        lhs.add(12);
        lhs.add(2);
        lhs.add(32);
        lhs.add(54);
        lhs.add(11);
        lhs.add(10);
        System.out.println("LinkedHash set output");
        System.out.println(lhs);

    }
}
