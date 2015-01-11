import java.math.BigInteger;

public class Fibonacci {
    /**
     * Determines if a given number is part of the Fibonacci sequence
     *
     * @param number An integer
     * @return true if number is part of the Fibonacci sequence, false otherwise
     */
    public static boolean isFibonacci(BigInteger number) {
        BigInteger Fprevious = BigInteger.ZERO, Fn = BigInteger.ONE;

        if (number.compareTo(BigInteger.ZERO) < 0) { // Negative numbers are not part of the Fibonacci sequence
            return false;
        }

        if (number.equals(Fprevious) || number.equals(Fn)) {
            return true;
        }

        while (Fn.compareTo(number) < 0) {
            BigInteger temp = Fn;
            Fn = Fn.add(Fprevious);
            Fprevious = temp;

            if (Fn.compareTo(number) == 0) {
                return true; // this number is a part of the Fibonacci sequence
            }
        }

        return false; // not in the sequence
    }
}