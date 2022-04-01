import java.util.TreeMap;

public class treeMapEx {
    public static void main(String[] args) {
        TreeMap<Integer,String> tm = new TreeMap<>();
        tm.put(1, "Rahul");
        tm.put(1, "Rachana");
        tm.put(2, "Rakesh");
        tm.put(3, "Dhanush");
        tm.put(4, "Nisha");

        tm.forEach((k,v)->{
            System.out.println("key : "+k+" value : "+v);
        });
        System.out.println(tm);
        System.out.println(tm.firstEntry());
        System.out.println(tm.containsKey(5));
        System.out.println(tm.containsValue("Rahul"));
        System.out.println(tm.get(2));
        System.out.println(tm.floorEntry(3));
        System.out.println(tm.keySet());
        System.out.println(tm.isEmpty());
        System.out.println(tm.size());


    }
}
