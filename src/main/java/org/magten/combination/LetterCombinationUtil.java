package org.magten.combination;

import java.util.ArrayList;
import java.util.List;

class LetterCombinationUtil {

    private static final String[][] LETTER_MAPPING = new String[][]{
            {},
            {},
            {"a", "b", "c"},
            {"d", "e", "f"},
            {"g", "h", "i"},
            {"j", "k", "l"},
            {"m", "n", "o"},
            {"p", "q", "r", "s"},
            {"t", "u", "v"},
            {"w", "x", "y", "z"}
    };

    String combine(int[] digits) {
        if (digits.length == 0) {
            return "";
        } else {
            String[] result = new String[]{};
            for (int digit : digits) {
                result = combineArrays(result, combineByDigits(new String[]{}, String.valueOf(digit)));
            }
            StringBuilder output = new StringBuilder();
            for (String s : result) {
                output.append(s).append(" ");
            }
            return output.toString().trim();
        }
    }

    private String[] combineByDigits(String[] arr, String digits) {
        if (digits.length() > 0) {
            arr = combineArrays(arr, LETTER_MAPPING[Integer.parseInt(digits.substring(0, 1))]);
            return combineByDigits(arr, digits.substring(1));
        } else {
            return arr;
        }
    }

    private String[] combineArrays(String[] arr1, String[] arr2) {
        if (arr1.length > 0 && arr2.length > 0) {
            List<String> result = new ArrayList<>();
            for (String s1 : arr1) {
                for (String s2 : arr2) {
                    result.add(s1 + s2);
                }
            }
            return result.toArray(new String[0]);
        } else if (arr1.length > 0) {
            return arr1;
        } else {
            return arr2;
        }
    }
}
