//Algorithm
//Solved using backtracking
//Start with an empty solution matrix that is a 2D array
// When adding a new item => we check whether adding the current item "violates" the problem constraints or not...
// If (Violation) then "BACKTRACK"
// else => Add item to the solution set and then move on to the next item
// When all items are considered, we are ready

public class Implementation {
final private int[][] solutionMatrix;
final  private int boardSize;
final private int[] xMoves = {2,1,-1,-2,-2,-1,1,2};
final private int[] yMoves = {1,2,2,1,-1,-2,-2,-1};
final private  int numOfMoves = xMoves.length;

    public Implementation(int boardSize) {
        this.boardSize = boardSize;
        this.solutionMatrix = new int[boardSize][boardSize];
        initializeBoard();

    }

    private void initializeBoard() {
        for(int i=0; i<boardSize;i++)
            for(int j=0; j<boardSize;j++)
                solutionMatrix[i][j] = Integer.MIN_VALUE; //Checks is given cell is empty
    }

    public void solveTour(){
        solutionMatrix[0][0] = 1; //Start at boardPosition (0,0)

        if(solve(1,0,0))
            printSolution();
        else
            System.out.println("No feasible solution...");

    }

    private boolean solve(int stepCount, int x, int y) {
        if(stepCount == boardSize * boardSize) //Once we visit every board square
            return true;

        for(int i =0; i<numOfMoves;i++){
            int nextX = x + xMoves[i];
            int nextY = y + yMoves[i];

            if(isStepValid(nextX,nextY)){
                solutionMatrix[nextX][nextY] = stepCount+1;
                if(solve(stepCount+1,nextX,nextY)){
                    return true;
                }
                //Backtrack ...
                solutionMatrix[nextX][nextY] = Integer.MIN_VALUE;
            }
        }
        return false;
    }

    private boolean isStepValid(int x, int y) {
        if( x<0 || x >= boardSize) return false;
        if( y<0 || y >= boardSize) return false;
        if(solutionMatrix[x][y] != Integer.MIN_VALUE) return false;
        return true;
    }

    private void printSolution() {
        for(int i=0; i<boardSize;i++) {
            for (int j = 0; j < boardSize; j++)
                System.out.print(solutionMatrix[i][j] + " ");
            System.out.println();
        }
    }
}
