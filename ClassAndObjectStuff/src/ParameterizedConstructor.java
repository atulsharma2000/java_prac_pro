import java.util.Scanner;

public class ParameterizedConstructor {
    float val;
    String color;

    ParameterizedConstructor(String color){    
        val = 10;
        this.color = color;
    }


    public static void main(String[] args) {
        System.out.println("learning constructor");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter by default color you want for all objects:-  ");
        String str  = sc.nextLine();

        ParameterizedConstructor obj = new ParameterizedConstructor(str);   // parameterized constructor 


        System.out.println(obj.val);
        System.out.println(obj.color);
        
        
        
    }
}
