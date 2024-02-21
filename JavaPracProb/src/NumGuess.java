import java.util.Scanner;

public class NumGuess {
    public static void main(String[] args) {
        int res=123;
       Scanner sc = new Scanner(System.in);
        int a;
       do{
        System.out.print("Guess the number: ");
         a = sc.nextInt();
       }
       while(a!=res);
       System.out.println("Correct guess !");

    }
}
