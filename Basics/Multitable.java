package Basics;
import java.util.Scanner;
/**
 * Multitable
 */
public class Multitable {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int a = sc.nextInt();
        int i=1;
        while(i<=10){
            System.out.println(a*i++);

        }

    }
}