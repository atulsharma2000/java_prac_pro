import java.util.Scanner;

public class DeleteElementArray {
    public static void main(String[] args) {
        int[] arr = ArrayUtility.inputArray();
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Element you want to delete: ");
        int e = sc.nextInt();
        
        arr=deleteElement(arr,e);
        
        ArrayUtility.printArray(arr);

    }
    public static int[] deleteElement(int[] arr,int e){

        int occ = Occurenceinarray.noOfOccurences(arr, e);
        if(occ==0) {
            System.err.println("Element not found.");
            return arr;
        }

        int newSize = arr.length - occ;
        int[] newArr = new int[newSize];

        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==e){
                continue;
            }
            newArr[j++]=arr[i];
        }
        return newArr;
    }
}
