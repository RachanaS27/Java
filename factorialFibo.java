import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class factorialFibo {
   
    public static void factorial(int n){
        int res =1;
        int m = n;
        while(n>0){
            res *=n;
            n--;
        }
        System.out.println("the factorial of "+m+" is "+res);
    }

    public static void fibonacci(int n)
    {
        List<Integer> list = new ArrayList<>();
         list.add(0);
         list.add(1);
         for(int i = 1;i<=n;i++)
         {
             int res = list.get(i)+list.get(i-1);
             list.add(res);
         }
         list.forEach(System.out::println);
    }

    public static void main(String[] args) {
        factorial(10);
        fibonacci(10);

        List<Integer> l = new ArrayList<>();
        l.add(5);
        Stream<Integer> s = l.stream();
        //s.forEach(new fiboImpl());
        s.forEach(new factImpl());         
    }
}

class fiboImpl implements Consumer<Integer>{

    @Override
    public void accept(Integer t) {
       List<Integer> l1 = new ArrayList<>();
       l1.add(0);
       l1.add(1);
       for(int i = 1;i<=t;i++)
       {
           int res = l1.get(i)+l1.get(i-1);
           l1.add(res);
       }
       System.out.println("using stream");
       l1.forEach(System.out::println);
    }
        
}

class factImpl implements Consumer<Integer>{

    @Override
    public void accept(Integer t) {
        int res = 1;
        int m =t;
        while(t>0)
        {
            res *= t;
            t--;
        }
        System.out.println("using stream");

        System.out.println("the factorial of "+m+" is "+res);
    }

}

