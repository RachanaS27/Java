import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class arrayListEx {
public static void main(String[] args) {
    List<Integer> li = new ArrayList<Integer>();
    
    //Iterator<Integer> it1 = li.iterator();
    li.add(10);
    li.add(20);
    li.add(30);
    li.add(40);
    li.add(50);
    System.out.println("Iterator output ");
    Iterator<Integer> it = li.iterator();
    while(it.hasNext())
    {
        System.out.println(it.next());
    }
    System.out.println("the list "+li);
    System.out.println("the list size "+li.size());
    li.set(2, 70);
    li.remove(4);
    System.out.println("the element at index 3 "+li.get(3));
    System.out.println("Iterator output ");
    Iterator<Integer> it1 = li.iterator();
    while(it1.hasNext())
    {
        System.out.println(it1.next());
    }
  
    System.out.println("the list contains "+li.contains(10));
    System.out.println("the index of 40 "+li.indexOf(40));
    li.set(1, 90);
    System.out.println("the sublist "+li.subList(1, 4));
    li.add(3, 100);
    System.out.println(li);

}
    
}