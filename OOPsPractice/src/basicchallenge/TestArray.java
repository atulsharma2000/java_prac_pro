package basicchallenge;

public class TestArray {
    public static void main(String[] args) {
        ArrayOperations opr = new ArrayOperations(new int[]{1,3,5,9});
        ArrayOperations.Statistics stat = opr.new Statistics();
        System.out.println(stat.mean());
    }
}
