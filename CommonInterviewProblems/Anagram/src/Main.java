
public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(isAnagram("silent","listen"));
    }

    public static boolean isAnagram(String word1, String word2){

        if(word1.length() != word2.length()) return false;

        int number_similar = 0;

        for (int i = 0; i <word1.length() ; i++) {

            if(word1.charAt(i) == word2.charAt(number_similar)){

                number_similar++;
                String secondHalf = word1.substring(i+1);
                String firstHalf = word1.substring(0,i);
                if(i==0) firstHalf = "";
                word1 = firstHalf + secondHalf;

                i=-1;
            }

            if(i == word1.length()-1 && number_similar == word2.length()) return true;
        }

        return false;
    }
}
