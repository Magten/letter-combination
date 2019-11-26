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

    private List<String> result = new ArrayList<>();

    String combine(int[] inputDigits) {
        if (inputDigits == null || inputDigits.length == 0) {
            return "";
        }

        StringBuilder digits = new StringBuilder();
        for (int digit : inputDigits) {
            digits.append(digit);
        }

        combine(digits.toString(), 0, "");

        StringBuilder output = new StringBuilder();
        for (String s : result) {
            output.append(s).append(" ");
        }
        return output.toString().trim();
    }

    private void combine(String inputDigits, int currentIndex, String currentLetter) {
        if (currentIndex == inputDigits.length()) {
            result.add(currentLetter);
        } else {
            String position = inputDigits.substring(currentIndex, currentIndex + 1);
            String[] letters = LETTER_MAPPING[Integer.parseInt(position)];
            if (letters.length > 0) {
                for (String letter : letters) {
                    combine(inputDigits, currentIndex + 1, currentLetter + letter);
                }
            } else {
                combine(inputDigits, currentIndex + 1, currentLetter);
            }
        }
    }
}
