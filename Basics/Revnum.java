package Basics;

import java.util.Scanner;

public class Revnum {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        int r=0;
        int i=0;
        int newnum=0;
        while(n>0){
            r=n%10;
            newnum = newnum*10+r;
            n=n/10;
        }
        System.out.println(newnum);
    }
}
