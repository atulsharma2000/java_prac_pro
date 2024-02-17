package Basics;

public class ZArray {
    public static void main(String[] args) {
        
        int[] arr=new int[10];

        for(int i=0;i<10;i++)
            arr[i]=2*i;
        for(int j=0;j<10;j++)    
            System.out.println(arr[j]);
    }
}
