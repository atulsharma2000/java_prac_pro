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
            System.out.print(arr[i]+"  ");
        }
        System.out.println();
    }

    public static int[][] input2DArray(){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int row = sc.nextInt();
        System.out.print("Enter number of Columns: ");
        int column = sc.nextInt();
        while(row<=0 || column<=0){
            System.out.println("------Invalid size !--------");
            System.out.print("Enter number of rows: ");
            row = sc.nextInt();
            System.out.print("Enter number of Columns: ");
            column = sc.nextInt();
        }

        int arr[][] = new int[row][column];

        int i=0,j=0;
        for(i=0;i<row;i++){
            for(j=0;j<column;j++){
            System.out.print("Enter element ["+(i+1)+"]["+(j+1)+"] :- ");
            arr[i][j] = sc.nextInt();
            }
        }
        return arr;
    }

    public static void print2DArray(int[][] arr){
        
        for(int i=0;i<arr.length;i++){
            System.out.print("Row["+i+"]:- ");
            for(int j=0;j<arr[i].length;j++)
                System.out.print(arr[i][j]+"   ");
            System.out.println();
        }
        
    }

}
