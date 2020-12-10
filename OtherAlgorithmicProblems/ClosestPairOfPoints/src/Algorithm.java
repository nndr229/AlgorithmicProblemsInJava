import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Algorithm {
    private List<Point> points;

    public Algorithm(List<Point> points) {
        this.points = points;
    }

    public double solveProblem(){
        List<Point> sortedXPoints = new ArrayList<>();
        List<Point> yPoints = new ArrayList<>();

        for (Point point : this.points){
            sortedXPoints.add(point);
            yPoints.add(point);
        }

        sortByX(sortedXPoints);

        return findClosestPoints(sortedXPoints, yPoints, sortedXPoints.size());
    }

    public double findClosestPoints(List<Point> pointsSortedX, List<Point> pointsY, int numOfPoints){

        if (numOfPoints <= 3) return bruteForceApproach(pointsSortedX);

        int middleIndex = numOfPoints/2;

        Point middlePoint = pointsSortedX.get(middleIndex);

        List<Point> leftSubPointsY = new ArrayList<>();
        List<Point> leftSubPointsSortedX= new ArrayList<>();
        List<Point> rightSubPointsY = new ArrayList<>();
        List<Point> rightSubPointsSortedX = new ArrayList<>();

        //divide into left and right sub arrays

        for (int index = 0; index <numOfPoints ; ++index) {
            if(pointsY.get(index).getX() <= middlePoint.getX()){
                leftSubPointsY.add(pointsY.get(index));
                leftSubPointsSortedX.add(pointsSortedX.get(index));
            }else{
                rightSubPointsY.add(pointsY.get(index));
                rightSubPointsSortedX.add(pointsSortedX.get(index));

            }
        }
        double sigmaLeft = findClosestPoints(leftSubPointsSortedX,leftSubPointsY, middleIndex);
        double sigmaRight = findClosestPoints(rightSubPointsSortedX,rightSubPointsY, numOfPoints-middleIndex);
        double sigma = Math.min(sigmaLeft,sigmaRight);

        List<Point> pointsInStrip = new ArrayList<>();

        for (int index = 0; index <numOfPoints ; ++index) {
            if(Math.abs(pointsY.get(index).getX() - middlePoint.getX()) < sigma){
                pointsInStrip.add(pointsY.get(index));
            }
        }    

        double minDistanceInStrip = closestStrip(pointsInStrip,sigma);

        return Math.min(sigma, minDistanceInStrip);

    }

    private double closestStrip(List<Point> pointsInStrip, double sigma) {
        double minDistance = sigma;

        for (int i = 0; i <pointsInStrip.size() ; ++i) {
            for (int j = i+1; j <pointsInStrip.size() && (pointsInStrip.get(j).getY() - pointsInStrip.get(i).getY()) < minDistance ; j++) {
                if(distance(pointsInStrip.get(i), pointsInStrip.get(j)) < minDistance){
                    minDistance = distance(pointsInStrip.get(i), pointsInStrip.get(j));
                }
            }
        }
        return minDistance;
    }


    private double bruteForceApproach(List<Point> points){
        double minDistance = Double.MAX_VALUE;
          for(int i=0; i<points.size(); ++i){
                  for( int j= i+1 ; j<points.size() ; ++j){
                      if(distance(points.get(i),points.get(j)) < minDistance){
                          minDistance = distance(points.get(i), points.get(j));
                      }
                  }
              }
          return minDistance;
    }

    private void sortByX(List<Point> points){
        Collections.sort(points, new XSorter());
    }

    private double distance(Point p1, Point p2){
        double xDistance = Math.abs(p1.getX() - p2.getX());
        double yDistance = Math.abs(p1.getY() - p2.getY());

        return Math.sqrt( xDistance*xDistance + yDistance*yDistance);

    }
}




