public class IsArraySorted {
    public static void main(String[] args) {
        System.out.println("Array sort check !!!\n");
        int[] arr = ArrayUtility.inputArray();
        boolean isInc = isIncreasing(arr);
        boolean isDec = isDecreasing(arr);
        if(isInc){
            System.out.println("Its sorted in Increasing order");
        }
        else if(isDec){
            System.out.println("Its sorted in Decreasing order");
        }
        else{
            System.out.println("Not sorted");
        }
    }
    public static boolean isIncreasing(int[] arr){

        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1])
                return false;
        }
        return true;
    }
    public static boolean isDecreasing(int[] arr){

        for(int i=0;i<arr.length-1;i++){
            if(arr[i]<arr[i+1])
                return false;
        }
        return true;
    }
}
