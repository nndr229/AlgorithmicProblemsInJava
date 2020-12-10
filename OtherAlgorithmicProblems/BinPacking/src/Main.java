public class Main {

    public static void main(String[] args) {
	// write your code here
    int binSize = 10;
    int items[] = {5,5,5};
    BinPacking binPacking = new BinPacking(binSize,items);
    binPacking.solve();
    }
}
