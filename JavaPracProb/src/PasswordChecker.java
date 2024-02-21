import java.util.Scanner;

public class PasswordChecker {
    
    public static void main(String[] args) {
        ArrayUtility.inputArray(); //just for checking 
        String pass = "java2000";
        Scanner sc = new Scanner(System.in);
        String  check;
        do{
            System.out.print("Enter Password: ");
            check = sc.nextLine();

            if(check.equals(pass)){
                System.out.println("You are Allowed");
                break;
            }
            else{
                System.out.println("Wrong Password, try again.\n");
            }
        }
        while(check.equals(pass)==false);
        
    }
}
