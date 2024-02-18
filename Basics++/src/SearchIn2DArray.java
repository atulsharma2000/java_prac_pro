import java.util.Scanner;

public class SearchIn2DArray {
    public static void main(String[] args) {

        int arr[][] = ArrayUtility.input2DArray();

        ArrayUtility.print2DArray(arr);

        Scanner sc = new Scanner(System.in);
        System.out.print("Eneter element you want to search: ");
        int e = sc.nextInt();

        String result = searchElement(arr,e);
        System.out.println(result);

         
    }

    public static String searchElement(int[][] arr, int e) {
        
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]==e){
                    return "--- Item found at arr["+i+"]["+j+"]  ----";
                }
            }
        }
        return "Item not Found";
    }
}
