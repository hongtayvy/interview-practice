package problems;

public class Fibonacci {
    private static int fibonacci(int f){
        if (f <= 1) {
            return f;
        }
        return fibonacci(f - 1) + fibonacci(f - 2);
    }
    public static String runFibonacciSolution(int fib){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < fib; i++) {
            sb.append(fibonacci(i)).append(" ");
        }
        return sb.toString();
    }
}
