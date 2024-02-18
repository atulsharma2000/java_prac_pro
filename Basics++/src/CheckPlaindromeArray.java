public class CheckPlaindromeArray {
    public static void main(String[] args) {
        System.out.println("Lets check Palindrome !");
        int[] arr = ArrayUtility.inputArray();
        boolean isPlaindrome = isPalindrome(arr);
        if(isPlaindrome)
            System.out.println("Yes Palindrome");
        else    
            System.out.println("Not Palindrome");
    }

    public static boolean isPalindrome(int arr[]){
        
        for(int i=0;i<arr.length/2;i++){
            if(arr[i] != arr[arr.length-i-1])    
                return false;
            }
            return true;
        }
       
        
    }

