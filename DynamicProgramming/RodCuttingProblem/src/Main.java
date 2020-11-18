//Algorithm by Holczer Balazs

public class Main {

    public static void main(String[] args) {
	// write your code here
        int lengthOfRod = 5;
        int[] prices = {0,2,5,7,3};

        RodCutting cutting = new RodCutting(lengthOfRod, prices);
        cutting.solve();
        cutting.showResult();

    }
}
