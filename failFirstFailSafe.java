import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class failFirstFailSafe {
    public static void main(String[] args) {
        Map<Integer,Integer> map = new HashMap<>();
        map.put(1, 20);
        map.put(2, 40);
        map.put(3, 60);
        Iterator<Integer> it = map.keySet().iterator();
        try {
            while(it.hasNext())
            {
                System.out.println(it.next());
                map.put(4, 80);
            }
        } catch (ConcurrentModificationException e) {
            System.out.println("cannot add element while iterating");
        }
        
        Map<Integer,Integer> map1 = new ConcurrentHashMap<>();
        map1.put(1, 20);
        map1.put(2, 40);
        map1.put(3, 60);
        Iterator<Integer> it1 = map1.keySet().iterator();
        while(it1.hasNext())
        {
            System.out.println(it1.next());
            map1.put(4, 80);
        }
    }
}
