package Basics;

import java.util.Scanner;

/**
 * Fact
 */
public class Fact {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        int f=1;
        for(int i=n;i>0;i--){
            f=f*i;
        }
        
        System.out.println(f);
        System.out.print("\n Now Enter number for recursive factorial: ");
        int g = sc.nextInt();
        long fac = facto(g);
        System.out.println(fac);
    }
    public static long facto(int n){
        
        if(n<2) 
            return 1;
        return (n*facto(n-1));
    }
}