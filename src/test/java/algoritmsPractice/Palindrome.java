package algoritmsPractice;

public class Palindrome {
    public static void main(String[] args) {

        // == Task-1 Check if string is Palindrome use StringBuilder
        // == Task-2 Check if int is Palindrome use StringBuilder
        // == Task-3 Check if int is Palindrome use forLoop and math

        int target = 123456789;

//        System.out.println(isPalindromeBoolean(12321));
        System.out.println(isPalindromeStringB("Aba"));
    }



    // == Task-1 Check if string is Palindrome use StringBuilder
    public static boolean isPalindromeStringB(String word){
        String reversed = new StringBuilder(word).reverse().toString();
        return reversed.equals(word);
    }












    // == Task-2 Check if int is Palindrome use StringBuilder
    public static Boolean isPalindromeBoolean (Integer target2){

        int original = target2; // save the original number
        int rev =0;   // This will hold the reversed num

        while (target2!=0){
            int last = target2 % 10; // Get the last digit
            rev = rev * 10 + last;  // Shift rev to the left and add the digit
            target2 = target2/10;  // Remove the last digit from target
        }
        return rev == original; // return boolean
    }


//    public static boolean isStringPalindrome(String word){
//        //String str = String.valueOf(word); // in we take number
//        String reversed = new StringBuilder(word).reverse().toString();
//        return reversed.equals(word);
//    }
}
