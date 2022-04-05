package CodingTest.Question4;

import java.util.Scanner;

public class factorialEx {
    public static void main(String[] args) {
        System.out.println("enter the number");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int res = 1;
        while(num>0){
            res  *= num;
            num--; 
        }
        System.out.println(res);
        scan.close();
    }
}
