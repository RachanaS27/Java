import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class genericEx {
    public static void main(String[] args) {
        Map<Double,String> map = new HashMap<>();
        Number d = 1.8;
        double d1 = d.doubleValue();
        map.put(d1, "Annad");
        System.out.println(map);
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        List<Double> list1 = new ArrayList<>();
        list1.add(10.4);
        list1.add(17.5);
        list1.add(24.3);
        list1.add(50.4);
        System.out.println(list);
        genericEx gen = new genericEx();
        gen.printNum(list);
        gen.printNum(list1);
    }
    public void printNum(List<? extends Number> list){
        for(Number i : list){
        System.out.println(i.doubleValue());
        }
    }
}
