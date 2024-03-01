package abstractionandpolimorphism.abstractionprac.bestAbstractionexample;

import java.util.Scanner;

public class Square extends Shape {
    private double side;

    Square (double side){
        this.side = side;
    }

    public double calculateArea(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side: ");
        side = sc.nextDouble();
        return side*side;
    }
}
