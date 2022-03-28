import java.util.HashSet;
import java.util.Set;

public class setEx {
    public static void main(String[] args) {
        Set<Integer> s1 =  new HashSet<>();
        s1.add(467);
        s1.add(6667);
        s1.add(897);
        s1.add(97);
        System.out.println(s1);
        s1.remove(97);
        System.out.println(s1);
        System.out.println(s1.size());
        System.out.println(s1.contains(899));
        System.out.println(s1.hashCode());
        System.out.println(s1.isEmpty());

    }
}
