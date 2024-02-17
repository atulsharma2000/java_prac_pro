package Basics;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        boolean b = true;
        int i=2;
        if(n<2) 
            System.out.println(n+" is not Prime");
        else{
            while(i<n){
                if(n%i==0)
                    b=false;
                i++;
            }
            System.out.println("\n"+n +" is Prime?  :- "+b);
        }
        
    }
}
