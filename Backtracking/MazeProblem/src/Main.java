public class Main {

    public static void main(String[] args) {
	// write your code here
        int[][] mazeTable = {
                {1,1,1,1,1},
                {1,0,0,1,0},
                {0,0,0,1,0},
                {1,1,1,1,1},
                {1,1,1,0,1}
        };
        Implementation mazeProblem = new Implementation(mazeTable);
        mazeProblem.solve();
    }
}
