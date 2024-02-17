package Basics;
import java.util.Scanner;


public class Lcm {
    public static int j=1;
   
    public static void main(String[] args) {
            
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter number 1: ");
            int a = sc.nextInt();
            System.out.print("Enter number 2: ");
            int b = sc.nextInt();

            int i=1;    
            int fact;
            while (i<=b) {
                fact = a*i;
                if(fact%b==0){
                    System.out.println(fact);
                    break;
                }
                i++;
            }
            
            System.out.print("\n Output using recursion: ");
            System.out.println(reclcm(a,b));
        }


    public static int reclcm(int a,int b) {
            
                if(a%b==0)
                    return a;
                else 
                    return reclcm(a+a/j++, b);
    }

}
