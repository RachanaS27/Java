public class switchCase {
    public static void main(String[] args) {
        int a = 10;
        switch(a)
        {
            case 10:
            if(a>0)
            {
                System.out.println("a is positive");
            }
            break;
            case -10:
            System.out.println("a is neagtive");
            break;
            default:
            System.out.println("wrong choice");
            break;
        }
    }
}