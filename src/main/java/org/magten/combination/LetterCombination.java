package org.magten.combination;

import java.util.Arrays;

public class LetterCombination {

    public static void main(String[] args) {
        try {
            int[] digits = convert(args);
            System.out.println("Input: arr[] = " + Arrays.toString(digits));
            String result = new LetterCombinationUtil().combine(digits);
            System.out.println("Output: " + result);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input.");
        }
    }

    static int[] convert(String[] digits) throws NumberFormatException {
        int[] result = new int[]{};
        if (digits != null && digits.length > 0) {
            result = new int[digits.length];
            for (int i = 0; i < digits.length; i++) {
                result[i] = Integer.parseInt(digits[i]);
            }
        }
        return result;
    }
}
