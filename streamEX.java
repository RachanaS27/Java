import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class streamEX {
    public static void main(String[] args) {
        List<Integer> number = new ArrayList<>();
        number.add(101);
        number.add(20);
        number.add(601);
        number.add(40);
        number.add(130);
        number.add(801);
        number.add(20);
        number.add(200);


        System.out.println(number);
        System.out.println("print even numbers from list using lambda");
        number.forEach(e->{
            if(e%2==0)
            {
                System.out.println(e);
            }
        });
        System.out.println("print even numbers from list using stream");
        number.stream().filter(e->(e%2==0)).forEach(System.out::println);
        
        System.out.println(number.stream().allMatch(e->(e==20)));
        System.out.println(number.stream().count());
        number.stream().distinct().forEach(System.out::println);
        System.out.println(number.stream().findFirst());
        number.stream().sorted().forEach(System.out::println);

        
       
        Stream<Integer>  st = number.stream();
        System.out.println("max");
        int maximum =st.max((a,b)->
        {
            if(a<b)
            {
                return -1;
            }
            return 0;

        }).get();
        System.out.println(maximum);
       
      /*System.out.println("min");
        int minimum =st.min((a,b)->
        {
            if(a>b)
            {
                return -1;
            }
            return 1;

        }).get();
        System.out.println(minimum);*/
    }
}
