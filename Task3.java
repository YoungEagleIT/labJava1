package Laba_1;

public class Task3 {
    public static void main(final String[] args) {
        final int numberLength = 5;
        System.out.print("Cycle Factorial : " + cycleFactorial(numberLength, 1));
        System.out.print("Recursion Factorial : " + recFactorial(numberLength, 1, 1));
    }

    public static int cycleFactorial(final int length, int factorial) {
        for (int i = 1; i <= length; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static int recFactorial(final int length, int factorial, final int i) {
        if (i <= length) {
            factorial *= i;
            return recFactorial(length, factorial, i + 1);
        }
        return factorial;
    }
}