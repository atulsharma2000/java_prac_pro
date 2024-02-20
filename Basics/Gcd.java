package Basics;
import java.util.Scanner;
public class Gcd {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int a = sc.nextInt();
        System.out.print("Enter number 2: ");
        int b = sc.nextInt();
        int gcd = gcd(a,b);
        System.out.println("GCD = "+gcd);

        int res = recgcd(a,b);
        System.out.println("\nGCD using recursion= "+res);
        
    }

    public static int gcd(int a,int b) {
        int gcd=1;
        int i=2;
        int least = least(a,b);
        while(i<=least){
            if(a%i==0 && b%i==0){
                gcd=i;
            }
            i++;        
        }
        return gcd;
    }
    
    public static int least(int a,int b) {
        if(a>b) return b;
        else return a;  
    }

    public static int recgcd(int a,int b){
        if(a==0)
            return b;
        else
            return recgcd(b%a,a);
    }

}
