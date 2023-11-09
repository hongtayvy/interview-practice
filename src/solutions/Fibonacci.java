package solutions;

public class Fibonacci {
    private static int fibonacci(int f){
        if (f <= 1) {
            return f;
        }
        return fibonacci(f - 1) + fibonacci(f - 2);
    }
    public static void runFibonacciSolution(int fib){
        for (int i = 0; i < fib; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        System.out.println("\n");
    }
}
