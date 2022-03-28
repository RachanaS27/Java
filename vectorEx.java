import java.util.Vector;

public class vectorEx {
    public static void main(String[] args) {
        Vector<Integer> v1 = new Vector<>();
        Vector<Integer> v2 = new Vector<>();

        v1.add(11);
        v1.add(41);
        v1.add(15);
        v1.add(22);
        
        v2.add(11);
        v2.add(41);
        v2.add(15);
        v2.add(22);
        System.out.println(v1);
        System.out.println(v1.contains(42));
        System.out.println(v1.capacity());
        System.out.println(v1.equals(v2));
        System.out.println(v1.hashCode());
        System.out.println(v1.isEmpty());
        System.out.println(v1.lastIndexOf(22));
        System.out.println(v1.indexOf(15));

    }
}
