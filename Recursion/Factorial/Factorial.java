package Factorial;

class Factorial {
    public static void main(String[] args) {
        int fact = factorial(4);
        System.out.println(fact);
        System.out.println("Factorial with accumulator");
        System.out.println(calculateFactorial(5));
    }

    public static int factorial(int n) {
        if (n == 1 || n == 0)
            return 1;
        return n * factorial(n - 1);
    }

    // No need to store variables in the stack
    public static int factorialWithAccumulator(int accumulator, int n) {
        if (n == 1)
            return accumulator;
        return factorialWithAccumulator(accumulator * n, n - 1);
    }

    public static int calculateFactorial(int n) {
        return factorialWithAccumulator(1, n);
    }
}