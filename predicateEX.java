import java.util.function.DoubleFunction;
import java.util.function.IntPredicate;

public interface predicateEX {
    public default void print(){
        System.out.println("print method of predicate interface");
    }
    public static void copyAll(){
        System.out.println("copyAll method of predicate interface");
    }
}

class A1 implements predicateEX{
    IntPredicate p = (value)->{
        if(value%2==0)
        {
            return true;
        }
        return false;
    };

    

    static DoubleFunction<A1> df = new DoubleFunction<>(){
       @Override
        public A1 apply(double value) {
            if(value == 0) {
                return null;
            }
            return new A1();
        }

    };

    
    public static void main(String[] args) {
        System.out.println("hello");
        A1 c = df.apply(10);
        System.out.println(c);
       // System.out.println(c.p1);
    }
}
class B1{
    static predicateEX p1 = new A1();
}
