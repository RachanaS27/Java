public class myException2Test {
    public static void main(String[] args) {
    
    int num = 12;

    try {
        if(num<18)
        {
            throw new myException2("Number should be greater than 18");
        }
        else{
            System.out.println("welcome");
        }
    } catch (myException2 e) {
        System.out.println("Exception occured "+e);
    }

    System.out.println("rest of the code");
}
}
