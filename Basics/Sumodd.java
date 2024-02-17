package Basics;

import java.util.Scanner;

/**
 * Sumodd   sum of odd numbers till n numbers
 */
public class Sumodd {

        
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int a = sc.nextInt();
        int sum=0;
        int i;
      for(i=1;i<=a;i+=2){
        sum+=i;
      }
        System.out.println(sum);
    
        }
}