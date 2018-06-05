package mathUtil;

public class MathUtil {

    /**
     * Returns the value of the first argument raised to the power of the second
     * argument, such that a > 0 and n > 0.
     *
     * @param a the base
     * @param n the exponent
     * @return the value <code>a<sup>b</sup></code>.
     */
    public static int pow(int a, int n) {
        if (a == 0) {
            return 0;
        }
        if (n == 0) {
            return 1;
        }
        return pow(a, n - 1) * a;

    }

    /**
     * Calculates and returns Greatest common divisor
     *
     * @param x
     * @param y
     * @return gcd of specified x and y numbers
     */
    public static int gcd(int x, int y) {
        if (y == 0) {
            return 0;
        }
        return gcd(y, x % y);
    }

    /**
     * Calculates and returns the factorial of specified n number
     *
     * @param n the number factorial of which must be calculated
     * @return calculated number
     */
    public static int factorial(int n) {
        if (n <= 0) {
            return 0;
        } else {
            return n * factorial(n - 1);
        }
    }

    /**
     * Calculates and returns the absolute value of specified n number
     *
     * @param n specified number to find the absolute number
     * @return absolute number of specified n
     */
    public static int abs(int n) {
        return n < 0 ? -n : n;
    }

    /**
     * Reverses the specified "number" parameter by digits.
     *
     * @param n the parameter to be revered
     * @return reversed number
     */
    public static int reverse(int n) {
        int temp = 0;
        while (n > 0) {
            temp = temp * 10 + n % 10;
            n /= 10;
        }
        return temp;
    }


}

