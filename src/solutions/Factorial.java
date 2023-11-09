package solutions;

public class Factorial {
    public static void runFactorialSolution(int factorial){
        System.out.println("Factorial of " + factorial + " is: " + calculateFactorial(factorial));
    }

    //This method recursively solves the problem
    private static int calculateFactorial(int factorial){
        //if the factorial is 0 we will return one
        if(factorial == 0){
            return 1;
        } else {
            //otherwise we recursively call this, so we mathematically find that it's n * calculateFactorial(n-1)
            return factorial * calculateFactorial(factorial - 1);
        }
    }
}
