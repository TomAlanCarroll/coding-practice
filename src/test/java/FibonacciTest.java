import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class FibonacciTest {
    @Test
    public void testIterativeIsFibonacciWithBigIntegers() {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < TestData.fibonacciNumbers.length; i++) {
            assertTrue(Fibonacci.iterativeIsFibonacci(TestData.fibonacciNumbers[i]));
        }

        for (int i = 0; i < TestData.nonFibonacciLargeNumbers.length; i++) {
            assertFalse(Fibonacci.iterativeIsFibonacci(TestData.nonFibonacciLargeNumbers[i]));
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Completed iterative Fibonacci test in " + (endTime - startTime) + "ms");
    }

    @Test
    public void testBinetIsFibonacciWithBigIntegers() {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < TestData.fibonacciNumbers.length; i++) {
            assertTrue(Fibonacci.binetIsFibonacci(TestData.fibonacciNumbers[i]));
        }

        for (int i = 0; i < TestData.nonFibonacciLargeNumbers.length; i++) {
            assertFalse(Fibonacci.binetIsFibonacci(TestData.nonFibonacciLargeNumbers[i]));
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Completed Binet Fibonacci test in     " + (endTime - startTime) + "ms");
    }
}
