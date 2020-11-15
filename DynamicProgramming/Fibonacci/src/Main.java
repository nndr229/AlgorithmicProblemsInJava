//Fibonacci sequence : 0 1 1 2 3 5 8 13 21 34 55 89 ...
// F(n) = F(n-1) + F(n-2)
// F(0) = 0
// F(1) = 1

// With generator functions we can solve it through recursion and like this we get a closed form (Binnet Formula).
// Problems with recursive definition is that we calculate the same fib(n) again and again.
// There are OVERLAPPING SUB-PROBLEMS...
// So if we can save f(n)s somewhere like in an array or Hashmap we can cut down calculation time.

// Example: To calculate fib(4)
// fib(4) = fib(3) + fib(2)
// fib(3) = fib(2) + fib(1)  here fib(2) is the overlapping sub-problem ... calculated twice
// fib(2) = fib(1) + fib(0)
// fib(1) = 1
// fin(0) = 0

// Solution => use Dynamic Programming and memoization in order to avoid re calculating the sub-problem
// We should use an associative array // Because it has O(1) time complexity
// So at every function call, we insert the calculated value if necessary
// This is good because we will have O(n) i.e linear time complexity instead of  EXPONENTIAL time complexity.
// It will also have O(n) space complexity
// If we want to make an algorithm fast we have to use some memory basically


public class Main {

    public static void main(String[] args) {
	// write your code here
        Fibonacci fib = new Fibonacci();

        int number = 40;
        System.out.println("Calculating fib(" +number+ ") using naive approach...");
        System.out.println(fib.naiveFibonacci(number));

        number = 1000;
        System.out.println("Calculating fib(" +number+ ") using DP approach...");
        System.out.println(fib.fibonacciDP(number));
    }
}
