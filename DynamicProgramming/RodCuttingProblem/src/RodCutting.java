public class RodCutting {
    private int[][] dpTable;
    private final int lengthOfRod;
    private final int[] prices;

    public RodCutting(int lengthOfRod, int[] prices) {
        this.lengthOfRod = lengthOfRod;
        this.prices = prices;
        this.dpTable = new int[prices.length+1][lengthOfRod+1];
    }

    public void solve(){
        //init Table with zeros
        for(int i=1; i< prices.length; i++){
            for(int j=1; j<= lengthOfRod; j++) {
                if( i <= j ){
                    dpTable[i][j] = Math.max(dpTable[i-1][j], prices[i] + dpTable[i][j-i]);
                }else{
                    dpTable[i][j] = dpTable[i-1][j];
                }
            }
        }
    }

    public void showResult(){
        System.out.println("Optimal Profit : $"+dpTable[prices.length-1][lengthOfRod]);
        for(int n= prices.length-1, w=lengthOfRod; n>0;){
            if(dpTable[n][w] != 0 && dpTable[n][w] != dpTable[n-1][w]){
                System.out.println("We make the cut: " + n+ "m.");
                w = w - n;
            }else{
                n--;
            }
        }
    }

}
