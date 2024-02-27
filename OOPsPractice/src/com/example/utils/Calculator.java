package com.example.utils;

import java.util.Scanner;
import com.example.geometery.*;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("\n======Calculator=====\n");
        System.out.println("Enter 1 to calculate area of circle or Enter 2 to calculate Area of rectange ");
        Scanner sc = new Scanner(System.in);
       
        System.out.print("Enter: ");
        int option = sc.nextInt();

        System.out.println();

        if(option==1){
            System.out.println(Circle.areaOfCircle());
        }
        if(option==2){
            System.out.println(Rectangle.areaOfRectangle());
        }

    }
}
