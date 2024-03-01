package abstractionandpolimorphism.abstractionprac.bestAbstractionexample;

import java.util.Scanner;

public class Circle extends Shape {
    private double radius;

    
     public double calculateArea(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
        radius = sc.nextDouble();
        return Math.PI * Math.pow(radius,2);
    }
}