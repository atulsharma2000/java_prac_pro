package Basics;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Prog to print Numbers in Fibonacci till n numbers");
        System.out.print("Enter number : ");
        int n = sc.nextInt();

        int f=n;
        int r,newnum=0;
        while(f>0){
            r=f%10;
            newnum = newnum*10+r;
            f=f/10;
        }

        System.out.println("Reversed num= "+newnum);

        if(newnum==n)
        System.out.println("YES Palindrome !!");
        else
            System.out.println("Not Palindrome");
    }
}
