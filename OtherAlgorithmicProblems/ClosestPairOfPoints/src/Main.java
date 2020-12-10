
import java.util.Arrays;
import java.util.List;

//Algorithm By Holczer Balazs

public class Main {

    public static void main(String[] args) {
	// write your code here
        List<Point> points = Arrays.asList(new Point(1,1.1),new Point(1,2),new Point(2,1),new Point(2,2),new Point(2,3),new Point(3,3));
        Algorithm algorithm = new Algorithm(points);
        System.out.println(algorithm.solveProblem());

    }
}
