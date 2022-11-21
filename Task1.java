package Laba_1;

import java.util.Arrays;

public class Task1 {
    public static void main(final String[] args) {
        final String str = "aabc aaabf abc ";
        final char symbol = 'a';
        System.out.println("Before replacing = \n" + str);
        final String result = sort(str, symbol);
        System.out.println("After replacing = \n" + result);
    }

    public static String sort(final String str, final char symbol) {
        final String[] result = str.split(" ");
        int prev = 0;
        for (int i = 0; i < result.length; i++) {
            int count = 0;
            for (int j = 0; j < result[i].length(); j++) {
                if (result[i].charAt(j) == symbol) {
                    count++;
                }
            }
            if (prev != 0 && prev < count) {
                final String tmp = result[i];
                result[i] = result[i - 1];
                result[i - 1] = tmp;
            }
            prev = count;

        }
        return Arrays.toString(result);
    }
}
