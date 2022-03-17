public class loops {
    public static void main(String[] args) {
        System.out.println("print 1 to 10 numbers using for");
        for(int i =1;i<11;i++)
        {
            System.out.println(i);
        }
        System.out.println("print 1 to 10 numbers using while");
        int i =1;
        while(i<11)
        {
            System.out.println(i);
            i++;
        }
        i =1;
        System.out.println("print 1 to 10 numbers using do while");
        do{
            System.out.println(i);
            i++;
        }while(i<11);
    }
}