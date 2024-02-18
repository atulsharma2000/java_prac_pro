public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        System.out.println("!! Enter two Sorted arrays to Merge !!");

        int arr1[] = ArrayUtility.inputArray();
        int arr2[] = ArrayUtility.inputArray();

        // int arrNew[] = new int[arr1.length+arr2.length];

        int[] arrNew = mergeArray(arr1,arr2);
        ArrayUtility.printArray(arrNew);
    }

    public static int[] mergeArray(int[] arr1,int[] arr2) {

        int arrNew[] = new int[arr1.length+arr2.length];

        int j=0,k=0;
        for(int i=0;i<arrNew.length;i++){
            if(arr1[j]<arr2[k]){
                arrNew[i]=arr1[j++];
            }
            else if(arr2[k]< arr1[j]){
                arrNew[i]=arr2[k++];
            }
            else if(arr1[j]==arr2[k]){
                arrNew[i++]=arr1[j++];
                arrNew[i]=arr2[k++];
            }
            else if(j >= arr1.length )
                arrNew[i]=arr2[k++];
            else if(k >= arr2.length)
                arrNew[i] = arr1[j++];
        }


        return arrNew;
    }
}
