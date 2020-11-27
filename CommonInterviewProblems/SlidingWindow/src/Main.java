import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] input = {1,23,23,1114,32,453,456};
        System.out.println(slidingWindow(input,2));
    }

    public static int slidingWindow(int[] inputArray, int window){
        if(window <= 0) return -1;

        int i = 0;
        int sum = 0;
        int reset = window - 1;
        List<Integer> sums=  new ArrayList<>();
        int count = 0;

        while( i< inputArray.length){
            sum += inputArray[i];
            i++;
            count++;
             if(count == window){
                 count=0;
                 sums.add(sum);
                 sum = 0;
                 i = i - reset; // check why? say i =1; therefore count = 2; reset count to 0; then new i should be
                                // 1 and not 2 as window size is 2;
             }
        }
        int max = Integer.MIN_VALUE;

        for (Integer integer : sums) {
            if (integer > max) max = integer;
        }

        return max;
    }

}

