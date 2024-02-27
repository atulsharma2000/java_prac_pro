package com.example.utils;

import java.util.Scanner;
import com.example.geometery.Circle;
import com.example.geometery.Rectangle;;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("\n======Calculator=====\n");
        System.out.println("Enter 1 to calculate area of circle or Enter 2 to calculate Area of rectange ");
        Scanner sc = new Scanner(System.in);
       
        System.out.print("Enter: ");
        int option = sc.nextInt();

        System.out.println();

        if(option==1){
           
            System.out.print("Enter radius: ");
            float r = sc.nextFloat();

            Circle cir = new Circle(r);

            double cirArea = Math.PI*Math.pow(cir.radius, 2);
            System.out.println("Area of circle = "+ cirArea);
        }
        if(option==2){
            
            System.out.print("Enter length: ");
            float l = sc.nextFloat();
            System.out.print("Enter width: ");
            float w = sc.nextFloat();
            
            Rectangle rec = new Rectangle(l,w);

            float recArea = rec.length*rec.breadth;

            System.out.println("Area of rec = "+ recArea);

        }

    }
}
