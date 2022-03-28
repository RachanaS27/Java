import java.util.ArrayList;
import java.util.List;

public class queueOwn {
    List<Integer> l1 = new ArrayList<>();
        
    public int offer(int num)
    {
        this.l1.add(num);
        return num;
    }

    public int poll()
    {
        return this.l1.remove(0);
    }

    @Override
    public String toString() {
        return "stackOwn [l1=" + l1 + "]";
    }

    public static void main(String[] args) {
        queueOwn q1 = new queueOwn();
        q1.offer(100);
        q1.offer(200);
        q1.offer(300);
        q1.offer(500);
        System.out.println(q1);
        q1.poll();
        System.out.println(q1);


    }
    
}
