public class SumCounterDiagonal {

    // Trace = sum of principle diagonal matrix
    public static void main(String[] args) {
        
        System.out.println("\nRows and colums must be same !! ");

        int arr[][] = ArrayUtility.input2DArray();
        ArrayUtility.print2DArray(arr);
        int trace = traceDia(arr);
        System.err.println("Sum of CounterDiagonal of Matrix (Sum)= "+ trace);
    }

    public static  int traceDia(int[][] arr){
        if(arr.length != arr[0].length){
            System.out.println("Rows and Columns not Equal !!!");
            return 0;
        }
        int traceOfMatrix=0;
        for(int i=0;i<arr.length;i++){           
                traceOfMatrix += arr[i][(arr[0].length-1)-i];
            
        }
        return traceOfMatrix;
    }
}
