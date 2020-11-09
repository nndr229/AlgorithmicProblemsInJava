//Knight's tour problem
//A sequence of moves for a knight on a chessboard where a knight visits every square at least once
//Two types => "Open" tour and "closed" tour problem...
//For closed tour => start point and end point is the same
//This is the instance of the more general hamiltonian problem
//Closed tour is the hamiltonian cycle problem
//Solutions: brute-force approach + backtracking

// Schwenk theorem
// For an m*n chessboard the closed knight tour problem is always feasible,unless:
// Both m and n are odds
// m=1,2 or 4
// m=3 and n= 4,6 or 8

public class Main {
    public static void main(String[] args) {
	// write your code here
        Implementation knightsTour = new Implementation(8);
        knightsTour.solveTour();
    }
}
