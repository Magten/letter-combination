package org.magten.combination;

import org.junit.Assert;
import org.junit.Test;

public class LetterCombinationTest {

    @Test
    public void testValidInput() {
        String[] input = new String[]{"1", "2", "3"};
        int[] expected = new int[]{1, 2, 3};
        Assert.assertArrayEquals(expected, LetterCombination.convert(input));
    }

    @Test
    public void testEmpty() {
        String[] input = new String[]{};
        int[] expected = new int[]{};
        Assert.assertArrayEquals(expected, LetterCombination.convert(input));
    }

    @Test
    public void testNull() {
        int[] expected = new int[]{};
        Assert.assertArrayEquals(expected, LetterCombination.convert(null));
    }

    @Test
    public void testInvalidInput() {
        String[] input = new String[]{"1", "a"};
        try {
            LetterCombination.convert(input);
            Assert.fail("No exception thrown.");
        } catch (Exception actual) {
            Assert.assertTrue(actual instanceof NumberFormatException);
        }
    }
}
