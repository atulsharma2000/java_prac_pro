public class MaxMinArray {
    public static void main(String[] args) {

        int arr[] = ArrayUtility.inputArray();
        int max = max(arr);
        int min = min(arr);
        System.out.println("Max= "+max+"\t\t Min= "+min);
    }

    public static int max(int[] arr){
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max)
                max=arr[i];
        }
        return max;
    }
    public static int min(int[] arr){
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min)
                min=arr[i];
        }
        return min;
    }
}
