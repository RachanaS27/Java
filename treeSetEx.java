import java.util.TreeSet;

public class treeSetEx {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(10);
        ts.add(20);
        ts.add(30);
        ts.add(40);
        ts.add(50);
        System.out.println(ts);
        System.out.println(ts.tailSet(20));
        System.out.println(ts.isEmpty());
        System.out.println(ts.first());
        System.out.println(ts.floor(40));
        System.out.println(ts.last());
        System.out.println(ts.higher(30));

    }
}
