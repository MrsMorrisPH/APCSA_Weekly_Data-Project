
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * AP CSA - Sales Data (Arrays Assessment)
 * Advanced JUnit tests for SalesData.java
 *
 * This test class validates:
 *  - Constructor deep copy (internal array must NOT alias the input).
 *  - getTotal(): sum of values.
 *  - getAverage(): total / length (double math).
 *  - getHighest(): max value.
 *  - getLowest(): min value.
 *  - toString(): one value per line, formatted as $xx.xx (two decimals).
 *
 * IMPORTANT:
 *  - These tests assume SalesData operates on non-empty arrays (as per project guide).
 *  - Optional @Disabled tests are included for empty-array behavior (enable if you choose a policy).
 */
class SalesDataTest {

    // -----------------------------
    // Constructor Deep Copy Tests
    // -----------------------------
    @Test
    void constructor_makesDeepCopy_notAliasingInput() {
        double[] input = {10.0, 20.0, 30.0};
        SalesData sd = new SalesData(input);

        double originalTotal = sd.getTotal();
        // Mutate caller's array after construction; internal data should NOT change.
        input[0] = 9999.0;
        assertEquals(
                originalTotal,
                sd.getTotal(),
                1e-9,
                "SalesData must deep-copy the input array. Mutating the original should not affect internal state."
        );
    }

    @Test
    void constructor_copiesAllElements_sameLength() {
        double[] input = {12.34, 0.0, 100.01, 7.7};
        SalesData sd = new SalesData(input);
        // Compare totals to infer both length and correct copying.
        double expectedTotal = 12.34 + 0.0 + 100.01 + 7.7;
        assertEquals(expectedTotal, sd.getTotal(), 1e-9);
    }

    // -----------------------------
    // getTotal Tests
    // -----------------------------
    @Test
    void getTotal_typicalMixedValues() {
        double[] input = {100.0, 200.5, 0.0, 50.0};
        SalesData sd = new SalesData(input);
        assertEquals(350.5, sd.getTotal(), 1e-9);
    }

    @Test
    void getTotal_allZeros() {
        double[] input = {0.0, 0.0, 0.0, 0.0};
        SalesData sd = new SalesData(input);
        assertEquals(0.0, sd.getTotal(), 1e-9);
    }

    @Test
    void getTotal_singleValue() {
        double[] input = {123.45};
        SalesData sd = new SalesData(input);
        assertEquals(123.45, sd.getTotal(), 1e-9);
    }

    // -----------------------------
    // getAverage Tests
    // -----------------------------
    @Test
    void getAverage_typicalMixedValues() {
        double[] input = {100.0, 200.0, 300.0};
        SalesData sd = new SalesData(input);
        // total = 600; average = 200
        assertEquals(200.0, sd.getAverage(), 1e-9);
    }

    @Test
    void getAverage_decimalPrecision() {
        double[] input = {1.0, 2.0, 3.0};
        SalesData sd = new SalesData(input);
        // total = 6; average = 2.0
        assertEquals(2.0, sd.getAverage(), 1e-9);
    }

    @Test
    void getAverage_singleValue() {
        double[] input = {250.75};
        SalesData sd = new SalesData(input);
        assertEquals(250.75, sd.getAverage(), 1e-9);
    }

    // -----------------------------
    // getHighest Tests
    // -----------------------------
    @Test
    void getHighest_typicalMixedValues() {
        double[] input = {10.0, 99.99, 50.5, 100.0, 88.88};
        SalesData sd = new SalesData(input);
        assertEquals(100.0, sd.getHighest(), 1e-9);
    }

    @Test
    void getHighest_allSameValues() {
        double[] input = {42.0, 42.0, 42.0};
        SalesData sd = new SalesData(input);
        assertEquals(42.0, sd.getHighest(), 1e-9);
    }

    @Test
    void getHighest_singleValue() {
        double[] input = {7.0};
        SalesData sd = new SalesData(input);
        assertEquals(7.0, sd.getHighest(), 1e-9);
    }

    // -----------------------------
    // getLowest Tests
    // -----------------------------
    @Test
    void getLowest_typicalMixedValues() {
        double[] input = {10.0, 99.99, 50.5, 100.0, 2.0};
        SalesData sd = new SalesData(input);
        assertEquals(2.0, sd.getLowest(), 1e-9);
    }

    @Test
    void getLowest_allSameValues() {
        double[] input = {42.0, 42.0, 42.0};
        SalesData sd = new SalesData(input);
        assertEquals(42.0, sd.getLowest(), 1e-9);
    }

    @Test
    void getLowest_singleValue() {
        double[] input = {7.0};
        SalesData sd = new SalesData(input);
        assertEquals(7.0, sd.getLowest(), 1e-9);
    }

    // -----------------------------
    // toString Formatting Tests
    // -----------------------------
    @Test
    void toString_formatsCurrency_twoDecimals_onePerLine() {
        double[] input = {100.0, 200.5, 0.0, 50.0};
        SalesData sd = new SalesData(input);

        String actual = sd.toString().replace("\r\n", "\n").trim();
        String expected = (
                "$100.00\n" +
                "$200.50\n" +
                "$0.00\n" +
                "$50.00"
        ).trim();

        assertEquals(expected, actual, "Each line must be formatted as $xx.xx with two decimals.");
    }

    @Test
    void toString_roundsCorrectly_halfUpBehavior() {
        double[] input = {12.345, 12.344, 12.346};
        SalesData sd = new SalesData(input);

        String actual = sd.toString().replace("\r\n", "\n").trim();
        // Using default String.format rounding: 12.345 -> 12.35, 12.344 -> 12.34, 12.346 -> 12.35
        String expected = (
                "$12.35\n" +
                "$12.34\n" +
                "$12.35"
        ).trim();

        assertEquals(expected, actual);
    }

    @Test
    void toString_handlesZeroValues() {
        double[] input = {0.0, 0.0};
        SalesData sd = new SalesData(input);

        String actual = sd.toString().replace("\r\n", "\n").trim();
        String expected = (
                "$0.00\n" +
                "$0.00"
        ).trim();

        assertEquals(expected, actual);
    }

    // -----------------------------
    // Optional / Stretch: Empty Array Policy
    // Enable these if you define specific behavior for empty inputs.
    // -----------------------------
    @Disabled("Enable if you decide that empty array should return total=0, average=0, and throw on highest/lowest OR handle gracefully.")
    @Test
    void emptyArray_averageReturnsZero_totalReturnsZero() {
        double[] input = {};
        SalesData sd = new SalesData(input);
        assertEquals(0.0, sd.getTotal(), 1e-9);
        assertEquals(0.0, sd.getAverage(), 1e-9);
    }

    @Disabled("Enable if you decide highest/lowest should throw an exception for empty arrays.")
    @Test
    void emptyArray_highestLowest_throwException() {
        double[] input = {};
        SalesData sd = new SalesData(input);
        assertThrows(IllegalStateException.class, sd::getHighest);
        assertThrows(IllegalStateException.class, sd::getLowest);
    }
}
