public class myException {
    
    public static void main(String[] args) {
        try {
          int  res = 2/0;
          System.out.println(res);
        } catch (Exception e) {
            System.out.println("cannot divide by zero ");
        }
        //int res = 2/0;
        System.out.println("rest of the code");
    }
}
