import java.util.Scanner;

public class Occurenceinarray {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int arr[] = ArrayUtility.inputArray();
        
        System.out.print("Enter the number you want to find: ");
        int num = sc.nextInt();
        int occ = noOfOccurences(arr, num);
        System.out.println("Element was found => "+occ+" times");
    }

    public static int noOfOccurences(int[] arr,int num){
        int occ=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==num)
                occ++;
        }
        return occ;
    }
}
