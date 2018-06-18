package com.fc.prime;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class PrimeTableTest {

    /**
     * Generate one prime number and test whether the correct value is returned
     */
    @Test
    public void testGenerate1Prime() {
        try {
            ArrayList<Integer> testArray = new ArrayList<>();
            testArray.add(2);
            Assert.assertEquals(testArray, PrimeTable.generatePrimeNumbers(1));
            Assert.assertArrayEquals(testArray.toArray(), PrimeTable.generatePrimeNumbers(1).toArray());
        } catch (Exception e) {
            Assert.fail(String.format("Test Case: %s%n" + " Exception: %s%n", "testGenerate1Prime", e.getMessage()));
        }
    }

    /**
     * Generate two prime numbers and test whether the correct values are returned
     */
    @Test
    public void testGenerate2Prime() {
        try {
            ArrayList<Integer> actual = PrimeTable.generatePrimeNumbers(2);
            Assert.assertEquals(Integer.valueOf(2), actual.get(0));
            Assert.assertEquals(Integer.valueOf(3), actual.get(1));
        } catch (Exception e) {
            Assert.fail(String.format("Test Case: %s%n" + " Exception: %s%n", "testGenerate0Prime", e.getMessage()));
        }
    }

    /**
     * Generate 10 prime numbers and test whether the arrayList values and size are correct
     */
    @Test
    public void testGenerate10Prime() {
        try {
            ArrayList<Integer> testArray = new ArrayList<>();
            testArray.add(2);
            testArray.add(3);
            testArray.add(5);
            testArray.add(7);
            testArray.add(11);
            testArray.add(13);
            testArray.add(17);
            testArray.add(19);
            testArray.add(23);
            testArray.add(29);
            Assert.assertEquals(testArray, PrimeTable.generatePrimeNumbers(10));
            Assert.assertArrayEquals(testArray.toArray(), PrimeTable.generatePrimeNumbers(10).toArray());
            Assert.assertEquals(10, PrimeTable.generatePrimeNumbers(10).size());
        } catch (Exception e) {
            Assert.fail(String.format("Test Case: %s%n" + " Exception: %s%n", "testGenerate10Prime", e.getMessage()));
        }
    }

    /**
     * Test NullPointerException upon passing null to generateTable method
     */
    @Test(expected = NullPointerException.class)
    public void testGenerateTableNull() {
        Assert.fail(PrimeTable.generateTable(null));
    }

    /**
     * Test the multiplication table of 10 prime numbers
     */
    @Test
    public void testGenerateTable10Prime() {
        try {
            ArrayList<Integer> testArray = new ArrayList<>();
            testArray.add(2);
            testArray.add(3);
            testArray.add(5);
            testArray.add(7);
            testArray.add(11);
            testArray.add(13);
            testArray.add(17);
            testArray.add(19);
            testArray.add(23);
            testArray.add(29);
            StringBuffer testPrime10 = new StringBuffer();
            testPrime10.append("     X     2     3     5     7    11    13    17    19    23    29\n" +
                    "     2     4     6    10    14    22    26    34    38    46    58\n" +
                    "     3     6     9    15    21    33    39    51    57    69    87\n" +
                    "     5    10    15    25    35    55    65    85    95   115   145\n" +
                    "     7    14    21    35    49    77    91   119   133   161   203\n" +
                    "    11    22    33    55    77   121   143   187   209   253   319\n" +
                    "    13    26    39    65    91   143   169   221   247   299   377\n" +
                    "    17    34    51    85   119   187   221   289   323   391   493\n" +
                    "    19    38    57    95   133   209   247   323   361   437   551\n" +
                    "    23    46    69   115   161   253   299   391   437   529   667\n" +
                    "    29    58    87   145   203   319   377   493   551   667   841\n");
            Assert.assertNotNull(PrimeTable.generateTable(testArray));
            Assert.assertEquals(testPrime10.toString(), PrimeTable.generateTable(testArray));
        } catch (Exception e) {
            Assert.fail(String.format("Test Case: %s%n" + " Exception: %s%n", "testGenerateTable10Prime", e.getMessage()));
        }
    }
}