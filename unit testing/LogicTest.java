
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LogicTest {

    @Test
    void testAddition() {
        assertEquals(10, add(6, 4));
    }

    int add(int a, int b) {
        return a + b;
    }

    @Test
    void testSubtraction() {
        assertEquals(2, subtract(6, 4));
    }

    int subtract(int a, int b) {
        return a - b;
    }

    @Test
    void testMultiplication() {
        assertEquals(24, multiply(6, 4));
    }

    int multiply(int a, int b) {
        return a * b;
    }

    @Test
    void testDivision() {
        assertEquals(2, divide(8, 4));
    }

    int divide(int a, int b) {
        return a / b;
    }

    @Test
    void testIsEven() {
        assertTrue(isEven(6));
        assertFalse(isEven(7));
    }

    boolean isEven(int num) {
        return num % 2 == 0;
    }

    @Test
    void testIsPalindrome() {
        assertTrue(isPalindrome("madam"));
        assertFalse(isPalindrome("hello"));
    }

    boolean isPalindrome(String str) {
        return str.equals(new StringBuilder(str).reverse().toString());
    }

    @Test
    void testFactorial() {
        assertEquals(120, factorial(5));
    }

    int factorial(int n) {
        if (n == 0) return 1;
        return n * factorial(n - 1);
    }

    @Test
    void testIsPrime() {
        assertTrue(isPrime(7));
        assertFalse(isPrime(9));
    }

    boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    @Test
    void testReverseString() {
        assertEquals("tac", reverseString("cat"));
    }

    String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    @Test
    void testArraySum() {
        assertEquals(15, arraySum(new int[]{1, 2, 3, 4, 5}));
    }

    int arraySum(int[] arr) {
        int sum = 0;
        for (int j : arr) {
            sum += j;
        }
        return sum;
    }
}
