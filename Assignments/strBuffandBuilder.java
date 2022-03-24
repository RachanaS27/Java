package Assignments;

public class strBuffandBuilder {
    public static void main(String[] args) {
        String str = new String("ABC");
        StringBuffer sbuf = new StringBuffer("XYZ");
        StringBuilder sbul = new StringBuilder("PQR");
        str.concat("hello");
        System.out.println(str);
        sbuf.append("hi");
        System.out.println(sbuf);
        sbul.append("hello hi");
        System.out.println(sbul);
        
    }
}
