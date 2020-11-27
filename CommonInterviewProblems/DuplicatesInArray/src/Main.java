import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] input = {1,2,5,3,4,5,6,7};
        System.out.println(duplicatesInArray(input));
        duplicatesInArrayBest(input);
    }
    //Returns true if there are duplicates!
    //Problem with this approach...
    //Not an in-place algorithm we can do better than this...
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

    public static void duplicatesInArrayBest(int[] input){
        for (int i = 0; i <input.length ; i++) {
            //If value is positive then flip
            if(input[(Math.abs(input[i]))] > 0){
                input[Math.abs(input[i])] =  -input[Math.abs(input[i])];
            }else{
                //If it is negative then it means repetition
                System.out.println(Math.abs(input[i]) + " is a repetition");
            }
        }
    }


}
