public class ReverseArray {
    public static void main(String[] args) {
        System.out.println("Reverse Array program");

        int[] arr = ArrayUtility.inputArray();
        reverse(arr);
        System.out.println("Your reversed array is: ");
        ArrayUtility.printArray(arr);
    }

    public static void reverse(int[] arr) {
        
        for(int i=0;i<arr.length/2;i++){
            int swap = arr[i];
            arr[i] = arr[arr.length-i-1];
            arr[arr.length-i-1] = swap;
        }
    }
}
