package Basics;

import java.util.Scanner;

public class Sumofdig {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int a = sc.nextInt();
        int sum=0;
        int l;
        while(a>0){
            l=a%10;
            a=a/10;
            sum+=l;
        }
    System.out.println(sum);
        }
}
