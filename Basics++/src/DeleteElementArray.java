import java.util.Scanner;

public class DeleteElementArray {
    public static void main(String[] args) {
        int[] arr = ArrayUtility.inputArray();
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Element you want to delete: ");
        int e = sc.nextInt();
        
        arr=deleteElement(arr,e);
        
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"\t");
        }
    }
    public static int[] deleteElement(int[] arr,int e){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==e){
                for(int j=i;j<(arr.length)-1;j++){
                    arr[j]=arr[j+1];
                }
                arr[(arr.length)-1]=Integer.MAX_VALUE;
                return arr;
            }
        }
        return arr;
    }
}
