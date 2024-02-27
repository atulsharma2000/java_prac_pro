package com.example.geometery;

import java.util.Scanner;

public class Circle {
    final static double PI = 3.14159265359;

    public static double areaOfCircle(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius: ");
        float r = sc.nextFloat();

        return PI*Math.pow(r, 2);
        
    }
}
