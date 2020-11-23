public class Main {

    public static void main(String[] args) {
	// write your code here
        String word = "nitin";
        //returns true
        System.out.println(isPalindrome(word));


    }
    //Efficient approach breaks loop as soon as a mismatch is found!!!
    public static boolean isPalindrome(String word){
        word = word.toLowerCase();
        int checkIfPalindrome = 0;

        for (int i = word.length() - 1; i >= 0 ; i--) {
            char c = word.charAt(i);
            if( c == word.charAt((word.length()-1) - i)) checkIfPalindrome++;
            else{
                return false;
            }
        }

        return true;

    }
}
