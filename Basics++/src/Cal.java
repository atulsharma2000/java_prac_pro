import java.util.Scanner;

public class Cal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;
        
        char c;
        System.out.print("Input operand A: ");
        a = sc.nextInt();
        System.out.print("Input operand B: ");
        b = sc.nextInt();
        System.out.print("Input operator: ");  
        c = sc.next().charAt(0);
        switch(c){
            case '+' -> System.out.print(a+b); 
            case '-' -> System.out.print(a-b); 
            case '*' -> System.out.print(a*b); 
            case '/' -> System.out.print(a/b); 
            default -> System.out.print("Input operator"); 
        };
    }
}
