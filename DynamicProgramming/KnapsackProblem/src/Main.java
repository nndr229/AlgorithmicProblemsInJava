
// Algorithm by Holczer Balazs
public class Main {

    public static void main(String[] args) {
        // write your code here
        int numOfItems = 3;
        int capacityOfKnapsack = 5;

        int[] weightOfItems = new int[numOfItems + 1 ];
        weightOfItems[1] = 4;
        weightOfItems[2] = 2;
        weightOfItems[3] = 3;

        int[] profitOfItems = new int[numOfItems +1];
        profitOfItems[1] = 10;
        profitOfItems[2] = 4;
        profitOfItems[3] = 7;

        Knapsack knapsack = new Knapsack(numOfItems,capacityOfKnapsack, weightOfItems, profitOfItems);
        knapsack.solve();
        knapsack.showResult();
    }
}
