public class SumAvg2DArray {
    public static void main(String[] args) {

        int arr[][] = ArrayUtility.input2DArray();
        ArrayUtility.print2DArray(arr);

        double sum = sum2D(arr);
        double avg = avg2D(arr);

        System.out.println("Sum= "+sum+"\t\t Avg= "+avg);
    }

    public static double sum2D(int[][] arr){
        if(arr.length==0)
            return 0;
        double sum=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++)
                sum+=arr[i][j];
        }
        return sum;
    }

    public static double avg2D(int[][] arr){
        if(arr.length==0)
            return 0;
        int rows = arr.length;
        int cols = arr[0].length;

        return sum2D(arr)/(rows*cols);
    }

}
