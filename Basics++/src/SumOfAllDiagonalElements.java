public class SumOfAllDiagonalElements {
    public static void main(String[] args) {
        
        System.out.println("\nRows and colums must be same !! ");

        int arr[][] = ArrayUtility.input2DArray();
        ArrayUtility.print2DArray(arr);
        int sum = sumDiagoals(arr);
        System.err.println("Sum of all diagonal elements = "+ sum);
    }

    public static  int sumDiagoals(int[][] arr){
        if(arr.length != arr[0].length){
            System.out.println("Rows and Columns not Equal !!!");
            return 0;
        }

        int rightToLeftSum = sumCountertDiagonals(arr);
        int trace = sumPrincipalDiagonals(arr);

        int sum = rightToLeftSum + trace;
        if(arr.length%2 != 0){
            int mid = arr.length/2;
            sum -= arr[mid][mid];
        }       
        return sum;
    }

    public static  int sumCountertDiagonals(int[][] arr){
        int rightToLeftSum=0;
        for(int i=0;i<arr.length;i++){           
            rightToLeftSum += arr[i][(arr[0].length-1)-i];    
        }
        return rightToLeftSum;
    }

    public static  int sumPrincipalDiagonals(int[][] arr){
        int trace=0,j=0;
        for(int i=0;i<arr.length;i++){           
            trace += arr[i][j++];    
        }
        return trace;
    }
}
