//Algorithm By Holczer Balazs

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
	// write your code here
        int[] coins = {1,2,3};
        int M = 5;
        CoinChange change = new CoinChange();
        System.out.println("RECURSIVE SOL. : There are " + change.naiveCoinChange(M,coins,0) + " ways to solve the coin change problem" + "" +
                " with the coins "+ Arrays.toString(coins) + ".");
        change.dpCoinChange(M,coins);

    }
}
