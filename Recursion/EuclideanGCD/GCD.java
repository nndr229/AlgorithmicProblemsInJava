package EuclideanGCD;

import java.util.ArrayList;

public class GCD {
    public static void main(String[] args) {
        System.out.println(GCDIterative(48, 60));
        System.out.println(AnotherGCDIterative(60, 48));
        System.out.println("Euclidean GCD");
        System.out.println(EuclideanGCDRecursive(60, 48));
    }

    // num2 has to be lesser than num1
    public static int AnotherGCDIterative(int x, int y) { 
        while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }
        return x;
    }

    public static int EuclideanGCDRecursive(int x, int y) {
        if (y == 0)
            return x;
        return EuclideanGCDRecursive(y, x % y);
    }

    public static int GCDIterative(int x, int y) {
        ArrayList<Integer> xFacts = new ArrayList<>();
        ArrayList<Integer> yFacts = new ArrayList<>();
        for (int i = 1; i <= x; i++) {
            if (x % i == 0) {
                xFacts.add(i);
            }
        }
        for (int i = 1; i <= y; i++) {
            if (y % i == 0) {
                yFacts.add(i);
            }
        }
        int common;
        int max = -1;
        for (int i = 0; i < xFacts.size(); i++) {
            common = xFacts.get(i);
            for (int j = 0; j < yFacts.size(); j++) {
                if (common == yFacts.get(j)) {
                    max = common;
                }
            }
        }
        return max;
    }

}
