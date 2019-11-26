package org.magten.combination;

import org.junit.Assert;
import org.junit.Test;

public class LetterCombinationUtilTest {

    private LetterCombinationUtil combinator = new LetterCombinationUtil();

    @Test
    public void testEmptyArray() {
        int[] input = {};
        Assert.assertEquals("", combinator.combine(input));
    }

    @Test
    public void testNull() {
        Assert.assertEquals("", combinator.combine(null));
    }

    @Test
    public void testSpecialNumberZero() {
        int[] input = {0};
        Assert.assertEquals("", combinator.combine(input));
    }

    @Test
    public void testSpecialNumberOne() {
        int[] input = {1};
        Assert.assertEquals("", combinator.combine(input));
    }

    @Test
    public void testTwoSingleDigit() {
        int[] digits = {2, 3};
        String expectedResult = "ad ae af bd be bf cd ce cf";
        Assert.assertEquals(expectedResult, combinator.combine(digits));
    }

    @Test
    public void testSingleDigit() {
        int[] input = {9};
        String expectedResult = "w x y z";
        Assert.assertEquals(expectedResult, combinator.combine(input));
    }

    @Test
    public void testSingleTwoDigit() {
        int[] input = {23};
        String expectedResult = "ad ae af bd be bf cd ce cf";
        Assert.assertEquals(expectedResult, combinator.combine(input));
    }

    @Test
    public void testSpecialNumberWithSingleDigit() {
        int[] input = {0, 9};
        String expectedResult = "w x y z";
        Assert.assertEquals(expectedResult, combinator.combine(input));
    }

    @Test
    public void testSpecialNumberWithSingleTwoDigit() {
        int[] input = {1, 23};
        String expectedResult = "ad ae af bd be bf cd ce cf";
        Assert.assertEquals(expectedResult, combinator.combine(input));
    }

    @Test
    public void testSingleDigitWithSingleTwoDigit() {
        int[] input = {9, 23};
        String expectedResult = "wad wae waf wbd wbe wbf wcd wce wcf xad xae xaf xbd xbe xbf xcd xce xcf yad yae yaf ybd ybe ybf ycd yce ycf zad zae zaf zbd zbe zbf zcd zce zcf";
        Assert.assertEquals(expectedResult, combinator.combine(input));
    }
}
