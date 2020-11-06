package Addition;

// There are 2 types of recursion...
// Head Recursion 
// Tail Recursion
// Recursive implementation is atleast twice as slower be cause first we push the recursive calls ov to 
// the stack and then we traverse the stack and retreive all recursive calls!

public class Addition {
    public static void main(String[] args) {
        System.out.println(additionIterarive(10));
        System.out.println(additionRecursive(10));
        System.out.println(additionFormula(10));
    }

    public static int additionIterarive(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static int additionRecursive(int n) {
        if (n == 0)
            return 0;
        return n + additionRecursive(n - 1);
    }

    public static int additionFormula(int n) {
        return (n * (n + 1)) / 2;
    }
}
