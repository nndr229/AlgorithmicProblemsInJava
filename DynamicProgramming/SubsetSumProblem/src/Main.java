public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] numbers = {5,2,3,1};
        int sum = 9;

        SubsetSum subsetSum = new SubsetSum(numbers,sum);
        subsetSum.solve();
        subsetSum.showIntegers();
    }
}
