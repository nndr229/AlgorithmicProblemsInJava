public class Main {

    public static void main(String[] args) {
	// write your code here
        EggDroppingProblem problem = new EggDroppingProblem();
        System.out.println("Minimum number of drops required to find the critical floor for " +
                +Constants.NUM_OF_EGGS +" eggs and " +Constants.NUM_OF_FLOORS +" floors are: " + problem.solve());
    }

}
