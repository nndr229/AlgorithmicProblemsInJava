// The problem itself is NP complete.
// Running time complexity: O(m^n).
// m is the number of possibilities for a single cell(9).
// n is the number of blank fields at the beginning.
// Solved using backtracking.
// Iterates all possible solutions for a given sudoku.
// If the solutions assigned do not lead to the solution of sudoku, the algorithm discards the solution and rollbacks.

import java.awt.*;

public class Implementation {
    private final int[][] sudokuTable;

    public Implementation(int[][] sudokuTable){
        this.sudokuTable = sudokuTable;
    }

    public void solveProblem(){
        if(solve(0,0)){
            showResults();
        }else{
            System.out.println("There is no solution...");
        }
    }

    private boolean solve(int rowIndex, int columnIndex) {
        if(rowIndex == Constants.BOARD_SIZE && ++columnIndex == Constants.BOARD_SIZE){
            return true;
        }

        if(rowIndex == Constants.BOARD_SIZE){
            rowIndex =0;
        }

        if(sudokuTable[rowIndex][columnIndex] != 0){
            return solve(rowIndex+1,columnIndex);
        }

        for(int number=Constants.MIN_NUMBER;number<=Constants.MAX_NUMBER;number++ ){
            if(valid(rowIndex,columnIndex,number)){
                sudokuTable[rowIndex][columnIndex] = number;

                if(solve(rowIndex+1,columnIndex)) return true;

                //BACKTRACK
                sudokuTable[rowIndex][columnIndex] = 0;
            }
        }

        return false;
    }

    private boolean valid(int rowIndex, int columnIndex, int actualNumber) {
        //check row
        for (int i = 0; i <Constants.BOARD_SIZE ; ++i) {
            if (sudokuTable[i][columnIndex] == actualNumber) return false;
        }
        //check column
        for (int j = 0; j <Constants.BOARD_SIZE ; ++j) {
            if (sudokuTable[rowIndex][j] == actualNumber) return false;
        }
        //check box
        int boxRowOffset = (rowIndex/3) * Constants.BOX_SIZE;
        int boxColumnOffset = (columnIndex/3) * Constants.BOX_SIZE;

        for(int i=0; i< Constants.BOX_SIZE; ++i) {
            for (int j = 0; j < Constants.BOX_SIZE; ++j) {
                if(actualNumber == sudokuTable[boxRowOffset + i][boxColumnOffset +j])
                    return false;
            }
        }
        return true;
    }

    private void showResults() {
        for(int i=0; i<Constants.BOARD_SIZE;i++){
            if(i%3 == 0){
                System.out.println(" ");
            }
            for (int j=0; j<Constants.BOARD_SIZE; j++){
                if(j%3 == 0 ) System.out.print(" ");

                System.out.print(sudokuTable[i][j]+ " ");
            }
            System.out.println(" ");
        }
    }


}
