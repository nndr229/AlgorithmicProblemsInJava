public class EggDroppingProblem {

    private  int[][] dpTable = new int[Constants.NUM_OF_EGGS + 1][Constants.NUM_OF_FLOORS+1];

    public int solve(){

        for (int i = 0; i <= Constants.NUM_OF_EGGS ; i++) {
            dpTable[i][0] = 1;
        }

        for (int i = 0; i <= Constants.NUM_OF_FLOORS ; i++) {
            dpTable[1][i] = i;
        }

        for (int n = 2; n <= Constants.NUM_OF_EGGS ; n++) {
            for (int m = 1; m <= Constants.NUM_OF_FLOORS ; m++) {
                dpTable[n][m] = Integer.MAX_VALUE;

                for (int x = 1; x <= m ; x++) {
                    int maxDrops = 1 + Math.max(dpTable[n-1][x-1],dpTable[n][m-x]);

                    if(maxDrops < dpTable[n][m]) dpTable[n][m] = maxDrops;
                }
            }

        }
        return dpTable[Constants.NUM_OF_EGGS][Constants.NUM_OF_FLOORS];
    }


}
