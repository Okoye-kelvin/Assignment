package Test.java;

public class Fibonacci {
    public static int[] generateFibonacci(int Number) {
        int[] fibonacciSequence = new int[Number];
        fibonacciSequence[0] = 0;
        fibonacciSequence[1] = 1;

        for (int i = 2; i < Number; i++) {
            fibonacciSequence[i] = fibonacciSequence[i - 1] + fibonacciSequence[i - 2];
        }

        return fibonacciSequence;
    }
}