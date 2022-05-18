package org.gregsewell;


import java.util.Arrays;

/**
 * Calculates the Fibonacci sequence up to input num,
 * example 1, 1, 2, 3, 5, 8, 13, 20 etc.
 */
public class Fibonacci {


    public static long[] fibonacciSequence(int n) {
        long[] result = new long[n];

        for (int i=0; i < n; i++) {
            result[i] = fibonacci(i+1);
        }
        return result;
    }

    public static long fibonacci(int n) {
        return fibonacciLoop(n);
    }

    private static long fibonacciRecurse(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        else {
            return fibonacciRecurse(n-1) + fibonacciRecurse(n-2);
        }
    }

    private static long fibonacciLoop(int n) {

        long fib1 = 1L;
        long fib2 = 1;
        long fibonacci = fib1 + fib2;

        if (n == 1 || n == 2) {
            return 1L;
        }

        for (int i=3; i < n; i++) {
            fib1 = fib2;
            fib2 = fibonacci;
            fibonacci = Math.addExact(fib1, fib2);
        }

        return fibonacci;
    }


    private static long fibonacciLoopArray(int n) {

        int[] array = new int[n];
        for (int i=0; i < n; i++) {
            if (i==0 || i==1) {
                array[i] = 1;
            }
            else if (i==2) {
                array[i] = 2;
            }
            else {
                array[i] = array[i-1] + array[i-2];
            }
        }
        return array[n-1];
    }

}
