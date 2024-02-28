package basicchallenge;

public class ArrayOperations {

    private int[] arr;

    public ArrayOperations(int[] arr) {
        this.arr = arr;
    }

    protected  class Statistics  {
        
        double mean(){
            double sum=0;
            for(int i : arr){
                sum+=i;
            }
            return sum/arr.length;
        }


        double median(int arr[]){

            return 0;
        }
        
    }

  

  public static void main(String[] args) {
        
    }
}
