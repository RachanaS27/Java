package Assignments;

public class exception1 {
    public static void main(String[] args) {
        System.out.println("===========================");
        System.out.println(" try with multiple catch");
        System.out.println("===========================");
        int[] num = {1,4,5,3,0};
        try {
            System.out.println(num[3]);
            int a = num[3]/num[4];
            System.out.println(a);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("length of array is 5");
        } catch (ArithmeticException e){
            System.out.println("cannot divide by zero");
        }
        System.out.println("===========================");
        System.out.println("nested try and catch blocks");
        System.out.println("===========================");
        try {
            try{
            System.out.println(num[3]);
            
            }  catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("length of array is 5");
        } 
            int a = num[3]/num[4];
            System.out.println(a);
        }catch (ArithmeticException e){
            System.out.println("cannot divide by zero");
        }
        System.out.println("===========================");
        System.out.println("try, catch and finally blocks");
        System.out.println("===========================");
        try {
            System.out.println(num[7]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("length of array is 5");
        }finally{
            System.out.println("Code executed for try, catch and finally");
        }
        System.out.println("===========================");
        System.out.println("try and finally blocks");
        System.out.println("===========================");
        try {
            System.out.println(num[3]);
        }finally{
            System.out.println("Code executed for try with finally");
        }
    }
}
