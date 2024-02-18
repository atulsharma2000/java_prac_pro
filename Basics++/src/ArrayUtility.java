import java.util.Scanner;

// i made this class to create arrays of n elements for any program

public class ArrayUtility {

    public static int[] inputArray(){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements in Array: ");
        int n = sc.nextInt();
        while(n<=0){
            System.out.println("Invalid size !");
            System.out.print("Enter number of elements in Array: ");
            n = sc.nextInt();
        }
        int arr[] = new int[n];

        int i=0;
        for(i=0;i<n;i++){
            System.out.print("Enter element "+(i+1)+" :- ");
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.err.print(arr[i]+"\t");
        }
    }
}
