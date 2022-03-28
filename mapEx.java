import java.util.HashMap;
import java.util.Map;

public class mapEx {
    public static void main(String[] args) {
        Map<String,Integer> m1 = new HashMap<>();
        m1.put("Bangalore", 1);
        m1.put("Mysore", 2);
        m1.put("Hassan", 3);
        m1.put("Mandya", 4);
        System.out.println(m1);
        System.out.println(m1.get("Hassan"));
        System.out.println(m1.containsKey("Mangalore"));
        System.out.println(m1.remove("Mandya"));
        System.out.println(m1.isEmpty());
        System.out.println(m1.size());
        m1.put("Mumbai", 5);
        m1.put("Chennai", 6);
        System.out.println(m1.remove("Mysore", 2));
        System.out.println(m1);

    }
}
