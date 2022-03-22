package Assignments;

import java.util.Arrays;
import java.util.Scanner;

public class ascendingWrapper {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 10 numbers");
        int[] number = new int[10];
        for(int i =0;i<number.length;i++)
        {
            number[i]=scan.nextInt();
        }
        Arrays.sort(number);
        System.out.println("================");
        for(int i=0;i<number.length;i++)
        {
            System.out.println(number[i]);
        }
        scan.close();
    }
}
