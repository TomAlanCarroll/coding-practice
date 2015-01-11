import org.junit.*;
import java.math.BigInteger;
import static org.junit.Assert.*;

public class FibonacciTest {
    @Test
    public void testIsFibonacci() {
        assertTrue(Fibonacci.isFibonacci(BigInteger.ZERO));
        assertTrue(Fibonacci.isFibonacci(BigInteger.ONE));
        assertTrue(Fibonacci.isFibonacci(new BigInteger(Integer.toString(2))));
        assertTrue(Fibonacci.isFibonacci(new BigInteger(Integer.toString(3))));
        assertTrue(Fibonacci.isFibonacci(new BigInteger(Integer.toString(5))));
        assertTrue(Fibonacci.isFibonacci(new BigInteger(Integer.toString(8))));
        assertTrue(Fibonacci.isFibonacci(new BigInteger(Integer.toString(13))));
        assertTrue(Fibonacci.isFibonacci(new BigInteger(Integer.toString(21))));
        assertTrue(Fibonacci.isFibonacci(new BigInteger(Integer.toString(34))));
        assertTrue(Fibonacci.isFibonacci(new BigInteger(Integer.toString(55))));
        assertTrue(Fibonacci.isFibonacci(new BigInteger(Integer.toString(89))));
        assertTrue(Fibonacci.isFibonacci(new BigInteger(Integer.toString(144))));

        assertFalse(Fibonacci.isFibonacci(new BigInteger(Integer.toString(-1))));
        assertFalse(Fibonacci.isFibonacci(new BigInteger(Integer.toString(4))));
        assertFalse(Fibonacci.isFibonacci(new BigInteger(Integer.toString(6))));
        assertFalse(Fibonacci.isFibonacci(new BigInteger(Integer.toString(7))));
        assertFalse(Fibonacci.isFibonacci(new BigInteger(Integer.toString(42))));
        assertFalse(Fibonacci.isFibonacci(new BigInteger(Integer.toString(88))));
        assertFalse(Fibonacci.isFibonacci(new BigInteger(Integer.toString(145))));
        assertFalse(Fibonacci.isFibonacci(new BigInteger(Integer.toString(200))));
        assertFalse(Fibonacci.isFibonacci(new BigInteger("18446744073709551616")));
    }
}
