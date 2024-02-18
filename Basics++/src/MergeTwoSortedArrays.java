public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        System.out.println("!! Enter two Sorted arrays to Merge !!");

        int arr1[] = ArrayUtility.inputArray();
        int arr2[] = ArrayUtility.inputArray();

        // int arrNew[] = new int[arr1.length+arr2.length];

        int[] arrNew = mergeArray(arr1,arr2);
        System.out.println("Your merge array is: ");
        ArrayUtility.printArray(arrNew);
        

    }

    public static int[] mergeArray(int[] arr1,int[] arr2) {

        int arrNew[] = new int[arr1.length+arr2.length];

        int i=0,j=0,k=0;

        while(j<arr1.length || k<arr2.length){
            if(k==arr2.length || (j<arr1.length && arr1[j]<=arr2[k])){
                arrNew[i++]=arr1[j++];
            }
            else{
                arrNew[i++]=arr2[k++];
            }
            
        }

        return arrNew;
    }
}
