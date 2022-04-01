import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class comparatorEx implements Comparator<ball>{

    public void sortball()
    {
        ball b1 = new ball("yellow", 280, "rubber", "tennis");
        ball b2 = new ball("white", 200, "rubber", "football");
        List<ball> list = new ArrayList<>();
        list.add(b1);
        list.add(b2);
        list.sort(this);

        list.forEach(System.out::println);    }
    public static void main(String[] args) {
        new comparatorEx().sortball();
    }

    @Override
    public int compare(ball b1, ball b2) {
        if(b1.size < b2.size)
        {
            return -1;
        }
        return 0;
    }
}
