import java.util.HashMap;
import java.util.Map;
// Algorithm by Holczer Balazs
public class Fibonacci {

    private Map<Integer,Integer> memoizeTable;

    public Fibonacci(){
        this.memoizeTable = new HashMap<>();
        this.memoizeTable.put(0,0);
        this.memoizeTable.put(1,1);
    }

    public int fibonacciDP(int n){
        // O(1) return of stored values...
        if(memoizeTable.containsKey(n)) return memoizeTable.get(n);

        memoizeTable.put(n-1, fibonacciDP(n-1));
        memoizeTable.put(n-2, fibonacciDP(n-2));

        int calculatedNumber = memoizeTable.get(n-1) + memoizeTable.get(n-2);

        memoizeTable.put(n, calculatedNumber);

        return calculatedNumber;
    }


    // It has exponential running time
    public int naiveFibonacci(int n){
        if (n ==1) return 1;
        if (n==0) return 0;
        return naiveFibonacci(n-1) + naiveFibonacci(n-2);
    }


}
