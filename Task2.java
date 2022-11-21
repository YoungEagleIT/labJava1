package Laba_1;

public class Task2 {
    public static void main(final String[] args) {
        final String symbol = "g";
        final String str = "abcdeggg";
        System.out.println("Before deleting:");
        System.out.println(str);
        final String modifiedStr = deleteChar(str, symbol);
        System.out.println("After deleting:");
        System.out.println(modifiedStr);
    }
    public static String deleteChar(String str, final String symbol) {
        str = str.replace(symbol, "");
        return str;
    }
}

