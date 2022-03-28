import java.util.ArrayList;
import java.util.List;

public class stackOwn {
    List<Integer> l1 = new ArrayList<>();
        
    public int push(int num)
    {
        this.l1.add(num);
        return num;
    }

    public int pop()
    {
        return this.l1.remove(l1.size()-1);
    }

    @Override
    public String toString() {
        return "stackOwn [l1=" + l1 + "]";
    }

    public static void main(String[] args) {
        stackOwn s1 = new stackOwn();
        s1.push(10);
        s1.push(20);
        s1.push(30);
        s1.push(50);
        System.out.println(s1);
        s1.pop();
        System.out.println(s1);


    }
}
