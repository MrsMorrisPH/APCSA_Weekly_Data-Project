public class SalesData {
// -------------------------------------------------------------
// Instance Variables 
// -------------------------------------------------------------
// TODO: Declare the private array to store sales amounts.
private double[] sales;


// -------------------------------------------------------------
// Constructor
// -------------------------------------------------------------
/**
 * Constructs a SalesData object by taking in an array of doubles and
 * making a deep copy (element-by-element) into the internal 'sales' array.
 *
 * @param input an array of doubles representing sales values
 */
public SalesData(double[] input) {
    // TODO: Validate the input (optional: check for null; decide how to handle).
    // TODO: Allocate a new array with the same length as 'input'.
    // TODO: Copy each element from 'input' into 'sales' (deep copy).
    //       Do NOT assign 'sales = input;' (that would alias the external array).
}


// -------------------------------------------------------------
// getTotal
// -------------------------------------------------------------
/**
 * Calculates and returns the total of all sales values.
 *
 * @return the sum of the elements in 'sales'
 */
public double getTotal() {
    // TODO: Initialize a running total to 0.0.
    // TODO: Loop through 'sales' and accumulate the sum.
    // TODO: Return the final total.
    return 0.0; // replace with your computed total
}


// -------------------------------------------------------------
// getAverage
// -------------------------------------------------------------
/**
 * Calculates and returns the average of the sales values.
 *
 * @return the average (total / number of elements),
 *         or 0.0 if the array is empty (defensive programming)
 */
public double getAverage() {
    // TODO: If 'sales' length is 0, consider returning 0.0.
    // TODO: Otherwise, compute total (you can call getTotal()) and divide by sales.length.
    return 0.0; // replace with your computed average
}


// -------------------------------------------------------------
// getHighest
// -------------------------------------------------------------
/**
 * Finds and returns the highest (maximum) value in the sales array.
 *
 * @return the largest value stored in 'sales'
 */
public double getHighest() {
    // TODO: Assume the first element is the current max (sales[0]) and iterate from index 1.
    // TODO: If 'sales' might be empty, decide on a safe behavior (optional).
    // TODO: Update max whenever a larger value is found.
    return 0.0; // replace with the highest value found
}


// -------------------------------------------------------------
// getLowest
// -------------------------------------------------------------
/**
 * Finds and returns the lowest (minimum) value in the sales array.
 *
 * @return the smallest value stored in 'sales'
 */
public double getLowest() {
    // TODO: Assume the first element is the current min (sales[0]) and iterate from index 1.
    // TODO: If 'sales' might be empty, decide on a safe behavior (optional).
    // TODO: Update min whenever a smaller value is found.
    return 0.0; // replace with the lowest value found
}


// -------------------------------------------------------------
// toString
// -------------------------------------------------------------
/**
 * Returns a multi-line String representation of all sales values,
 * one per line, formatted as currency: $xx.xx (two decimal places).
 *
 * Example output:
 * $100.00
 * $250.50
 * $  12.75   <-- (spacing is up to you; just ensure two decimals and a leading $)
 *
 * @return formatted multi-line String of sales
 */
@Override
public String toString() {
    // TODO: Use a StringBuilder to assemble the lines efficiently.
    // TODO: Loop through 'sales' and append each value using String.format("$%.2f%n", value)
    // TODO: Return the built String.
    return ""; // replace with your formatted string
}


}
