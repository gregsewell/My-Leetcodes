package org.gregsewell;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class FibonacciTest {

    // Individual tests of Fibonacci values

    @Test
    public void testOne() {
        assertEquals(1, Fibonacci.fibonacci(1));
    }

    @Test
    public void testTwo() {
        assertEquals(1, Fibonacci.fibonacci(2));
    }

    @Test
    public void testThree() {
        assertEquals(2, Fibonacci.fibonacci(3));
    }

    @Test
    public void testFour() {
        assertEquals(3, Fibonacci.fibonacci(4));
    }

    @Test
    public void testFive() {
        assertEquals(5, Fibonacci.fibonacci(5));
    }

    @Test
    public void testSix() {
        assertEquals(8, Fibonacci.fibonacci(6));
    }

    // Tests of Fibonacci Sequence
    @Test
    public void testSequenceOne() {
        assertArrayEquals(new long[]{1}, Fibonacci.fibonacciSequence(1));
    }

    @Test
    public void testSequenceTwo() {
        assertArrayEquals(new long[]{1, 1}, Fibonacci.fibonacciSequence(2));
    }

    @Test
    public void testSequenceThree() {
        assertArrayEquals(new long[]{1, 1, 2}, Fibonacci.fibonacciSequence(3));
    }

    @Test
    public void testSequenceFour() {
        assertArrayEquals(new long[]{1, 1, 2, 3}, Fibonacci.fibonacciSequence(4));
    }

    @Test
    public void testSequenceFive() {
        assertArrayEquals(new long[]{1, 1, 2, 3, 5}, Fibonacci.fibonacciSequence(5));
    }

    @Test
    public void testSequenceSix() {
        assertArrayEquals(new long[]{1, 1, 2, 3, 5, 8}, Fibonacci.fibonacciSequence(6));
    }


    @Test
    public void testSequence10000() {
        System.out.println("Calculating Fibonacci for 1000 numbers");
        long start = System.currentTimeMillis();
        long[] result = Fibonacci.fibonacciSequence(92);
        long finish = System.currentTimeMillis();
        System.out.printf("Time taken = %d ms%n", finish - start);
    }

}
