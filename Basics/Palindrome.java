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

        System.out.println("\n\nusing rec: ");
        int zz=recPlaindrome(n,0);
        
        if(zz==n) System.out.println("yes");
        else System.out.println("no");
    }


    public static int recPlaindrome(int n,int temp){
        if(n==0)
            return temp;
        temp = (temp*10)+(n%10);
        return recPlaindrome(n/10, temp);
    }
}
