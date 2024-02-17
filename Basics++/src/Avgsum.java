import java.util.Scanner;
public class Avgsum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = ArrayUtility.inputArray();
        long sum = sum(arr); 
        float avg = average(arr);
        System.out.println("Sum = "+sum+"\t\tAvg = "+avg);
    }

    public static long sum(int arr[]){
        int n=arr.length;
        int i;
        long sum=0;
        for(i=0;i<n;i++){
           sum+=arr[i];
        }
        return sum;
    }

    public static float average(int arr[]){

        float avg = ((float)sum(arr))/arr.length;
        return avg;
    }
}
