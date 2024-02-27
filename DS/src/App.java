public class App {
    public static void main(String[] args) throws Exception {
        
        int[] arr = ArrayUtility.inputArray();
        System.out.println("\n====Before Sort====");
        ArrayUtility.printArray(arr);

        System.out.println("\n====After Sort====");

        SortingUtility.bubbleSort(arr);

        System.out.println("\n====After Sort====");
        ArrayUtility.printArray(arr);
    }
}
