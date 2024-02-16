package Basics;
import java.util.Scanner;
class Trry{
    void ello(){
        long a =4;
        long b=4;
    System.out.println(a+b);
}}
public class Prac2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("\nWelcome "+name+" to KGcoding !");

        System.out.print("\nEnter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();
        int c=a+b;
        System.out.println("\nSum("+a+","+b+"): "+c);  
        
        Trry obj = new Trry();
        obj.ello();

    }
}