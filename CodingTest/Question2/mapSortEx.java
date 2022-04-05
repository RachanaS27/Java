package CodingTest.Question2;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeSet;

public class mapSortEx{
    public static void main(String[] args) {
        
        Map<String,Integer> map = new LinkedHashMap<>();
        map.put("dog", 8);
        map.put("cat", 4);
        map.put("ant", 6);
        map.put("ball", 2);
        map.put("bat", 10);
        map.put("kite", 16);

        
        Collection<Integer> l1 = map.values();
        System.out.println(l1);
        TreeSet<Integer> ts = new TreeSet<>(l1);
        System.out.println(ts);
        Map<String,Integer> map1 = new LinkedHashMap<>();
        for (Integer integer : ts) {
        for (Map.Entry<String,Integer> entry: map.entrySet()) {
                System.out.println("inside for "+integer+" "+entry.getValue());
                if(entry.getValue().equals(integer)){
                    System.out.println("inside if "+integer+" "+entry.getValue());
                    map1.put(entry.getKey(), integer);
                }
            }
        }

        System.out.println("sorted");
        for (Map.Entry<String,Integer> entry: map1.entrySet()) {
            System.out.println(entry.getKey()+" "+entry.getValue());
            
        }

    }

 
   
}