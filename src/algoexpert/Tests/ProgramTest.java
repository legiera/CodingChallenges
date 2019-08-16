package algoexpert.Tests;

// Add, edit, or remove tests in this file.
// Treat it as your playground!

import algoexpert.TwoSum;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

class ProgramTest {

    @Test
    public void TestCase1() {
        int[] expected = {4, 6};
        Assert.assertTrue(Arrays.equals(TwoSum.twoNumberSum(new int[] {4, 6}, 10), expected));
    }

    @Test
    public void TestCase2() {
        int[] expected = {1, 4};
        Assert.assertTrue(Arrays.equals(TwoSum.twoNumberSum(new int[] {4, 6, 1}, 5), expected));
    }

    @Test
    public void TestCase3() {
        int[] expected = {-3, 6};
        Assert.assertTrue(Arrays.equals(TwoSum.twoNumberSum(new int[] {4, 6, 1, -3}, 3), expected));
    }

    @Test
    public void TestCase4() {
        int[] expected = {-1, 11};
        Assert.assertTrue(Arrays.equals(TwoSum.twoNumberSum(new int[] {3, 5, -4, 8, 11, 1, -1, 6}, 10), expected));
    }

    @Test
    public void TestCase5() {
        int[] expected = {8, 9};
        Assert.assertTrue(Arrays.equals(TwoSum.twoNumberSum(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9}, 17), expected));
    }

    @Test
    public void TestCase6() {
        int[] expected = {3, 15};
        Assert.assertTrue(Arrays.equals(TwoSum.twoNumberSum(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 15}, 18), expected));
    }

    @Test
    public void TestCase7() {
        int[] expected = {-5, 0};
        Assert.assertTrue(Arrays.equals(TwoSum.twoNumberSum(new int[] {-7, -5, -3, -1, 0, 1, 3, 5, 7}, -5), expected));
    }

    @Test
    public void TestCase8() {
        int[] expected = {-47, 210};
        Assert.assertTrue(Arrays.equals(TwoSum.twoNumberSum(new int[] {-21, 301, 12, 4, 65, 56, 210, 356, 9, -47}, 163), expected));
    }

    @Test
    public void TestCase9() {
        int[] expected = {};
        Assert.assertTrue(Arrays.equals(TwoSum.twoNumberSum(new int[] {-21, 301, 12, 4, 65, 56, 210, 356, 9, -47}, 164), expected));
    }

    @Test
    public void TestCase10() {
        int[] expected = {};
        Assert.assertTrue(Arrays.equals(TwoSum.twoNumberSum(new int[] {3, 5, -4, 8, 11, 1, -1, 6}, 15), expected));
    }
}
