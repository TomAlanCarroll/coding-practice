import java.math.BigInteger;

public class Fibonacci {
    /**
     * Determines if a given number is part of the Fibonacci sequence
     *
     * @param number An integer
     * @return true if number is part of the Fibonacci sequence, false otherwise
     */
    public static boolean iterativeIsFibonacci(BigInteger number) {
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

    /**
     * Determines if a given number is part of the Fibonacci sequence if either
     * of the following are perfect squares: 5(x^2) + 4 or 5(x^2) - 4
     *
     * @param number An integer
     * @return true if number is part of the Fibonacci sequence, false otherwise
     */
    public static boolean binetIsFibonacci(BigInteger number) {
        if (number.compareTo(BigInteger.ZERO) < 0) { // Negative numbers are not part of the Fibonacci sequence
            return false;
        }

        BigInteger product = number.pow(2), four = new BigInteger("4");
        product = product.multiply(new BigInteger("5"));

        if (BigIntegerMath.isSquare(product.add(four)) || BigIntegerMath.isSquare(product.subtract(four))) {
            return true;
        }
        return false; // not in the sequence
    }
}