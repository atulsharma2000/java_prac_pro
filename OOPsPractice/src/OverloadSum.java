public class OverloadSum {
    public static void main(String[] args) {
        System.out.println(sum(2,3));
        System.out.println(sum(2,3,6));
        System.out.println(sum(2.55,2.55));
    }
    
    static int sum(int a,int b){
        return a+b;
    }
    
    static int sum(int a,int b,int c){
        return a+b+c;
    }
    
    static double sum(double a,double b){
        return a+b;
    }
}
