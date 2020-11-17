import java.sql.Array;
import java.util.Arrays;

public class CoinChange {

    //recursive coin change
    // O(2^N)
    public int naiveCoinChange(int M, int[] v, int index){
        if(M < 0)   return 0;
        if(M == 0) return  1;

        if(v.length == index) return 0;

        return naiveCoinChange(M-v[index],v,index)  + naiveCoinChange(M,v,index+1);
    }

    //Dynamic Programing
    public void dpCoinChange(int M, int[] v){
        int [][] dpTable = new int[v.length+1][M+1];

        for(int i=0; i<=v.length; i++)
            dpTable[i][0] = 1;

        for(int i=1; i<=M; i++)
            dpTable[0][i] = 0;

        // O(v*M)
        for(int i=1; i<=v.length; i++){
            for(int j=1; j<=M; j++){
                if(v[i-1] <= j){
                    dpTable[i][j] = dpTable[i-1][j] + dpTable[i][j-v[i-1]]; // Include the coin
                }else{
                    dpTable[i][j] = dpTable[i-1][j];
                }
            }
        }
        System.out.println("DP SOL. : There are "+ dpTable[v.length][M]+ " ways to solve the problem " +
                "with the coins "+ Arrays.toString(v) + ".");
    }

}
