package Assignments;

public class stringEx {
    public static void main(String[] args) {
        String s1 = "ABC";
        String s2 = "ABC";
        String s3 = new String("ABC");
        String s4 = new String("ABC");
        System.out.println(s1==s2);
        System.out.println(s3==s4);
        System.out.println(s3==s1);
        System.out.println(s3.equals(s4));
        System.out.println(s1.equals(s2));
        System.out.println(s3.equals(s2));


    }
}
