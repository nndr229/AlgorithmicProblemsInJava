//Sudoku Implementation

//Aim: Fill a 9 x 9 grid with digits
//There are some rules
//Each column , each row and each 3 x 3 subgrid that the main grid is composed of should only contain digits from 1-9.
//Initially we have a partially completed grid. Which for a well posed puzzle has a unique solution.
//Each column , each row and each 3 x 3 subgrid that the main grid cannot contain repeating digits.

//Search meta heuristics
public class Main {

    public static void main(String[] args) {
	// write your code here
        int sudokuTable[][] = {
                {3,0,6,5,0,8,4,0,0},
                {5,2,0,0,0,0,0,0,0},
                {0,8,7,0,0,0,0,3,1},
                {0,0,3,0,1,0,0,8,0},
                {9,0,0,8,6,3,0,0,5},
                {0,5,0,0,9,0,6,0,0},
                {1,3,0,0,0,0,2,5,0},
                {0,0,0,0,0,0,0,7,4},
                {0,0,5,2,0,6,3,0,0}
        };
        Implementation sudoku = new Implementation(sudokuTable);
        sudoku.solveProblem();
    }
}
