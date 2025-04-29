
public class Main {
    public static void main(String[] args) {
        LogicTest logic = new LogicTest();

        System.out.println("Addition (6 + 4): " + logic.add(6, 4));
        System.out.println("Subtraction (6 - 4): " + logic.subtract(6, 4));
        System.out.println("Multiplication (6 * 4): " + logic.multiply(6, 4));
        System.out.println("Division (8 / 4): " + logic.divide(8, 4));
        System.out.println("Is 6 Even?: " + logic.isEven(6));
        System.out.println("Is 'madam' a Palindrome?: " + logic.isPalindrome("madam"));
        System.out.println("Factorial of 5: " + logic.factorial(5));
        System.out.println("Is 7 Prime?: " + logic.isPrime(7));
        System.out.println("Reverse of 'cat': " + logic.reverseString("cat"));
        System.out.println("Sum of [1,2,3,4,5]: " + logic.arraySum(new int[]{1,2,3,4,5}));
    }
}
