import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] input = {1,2,5,3,4,5,6,7};
        System.out.println(duplicatesInArray(input));
    }
    //Returns true if there are duplicates!
    public static boolean duplicatesInArray(int[] input){
        HashMap<Integer,Integer> checker = new HashMap<>();

        for (int i = 0; i <input.length; i++)
            if (i == 0) {
                checker.put(input[i], 0);
            } else {
                if (checker.containsKey(input[i])) {
                    return true;
                }
                checker.put(input[i], 0);
            }
        return false;
    }

}
