package Basics;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Prog to print Numbers in Fibonacci till n numbers");
        System.out.print("Enter number : ");
        int n = sc.nextInt();

        int dig=0;
        int f=n;
        while(f>0){
            f=f/10;
            dig++;
        }
        f=n;
        System.out.println("total digits= "+dig);

        int newnum=0,rem=0;
        while(f>0){
            rem=f%10;
            newnum+=(int)Math.pow(rem,dig);
            f=f/10;
        }
        System.err.println("newnum= "+newnum);
        if(newnum==n)
            System.out.println("Yes Armstrong !");
        else
            System.out.println("Not Armstrong !");
    }
}
