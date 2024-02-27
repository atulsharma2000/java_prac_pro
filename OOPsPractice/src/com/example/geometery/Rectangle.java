package com.example.geometery;

import java.util.Scanner;

public class Rectangle {
    
    public static float areaOfRectangle(){

     Scanner sc = new Scanner(System.in);

        System.out.print("Enter length: ");
        float l = sc.nextFloat();
        System.out.print("Enter width: ");
        float w = sc.nextFloat();

        return l*w;
    }
}
