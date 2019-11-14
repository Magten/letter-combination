package org.magten.combination;

public class LetterCombination {

    public static void main(String[] args) {
        int[] digits = new int[args.length];
        StringBuilder input_digits = new StringBuilder();
        try {
            for (int i = 0; i < args.length; i++) {
                digits[i] = Integer.parseInt(args[i]);
                input_digits.append(digits[i]);
                if (i + 1 < args.length) {
                    input_digits.append(", ");
                }
            }
        } catch (Exception e) {
            System.out.println("Invalid input.");
            return;
        }

        System.out.println("Input: arr[] = {" + input_digits + "}");
        String result = new LetterCombinationUtil().combine(digits);
        System.out.println("Output: " + result);
    }
}
