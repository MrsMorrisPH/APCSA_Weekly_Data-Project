
# AP CSA Project: Sales Data (Arrays Assessment)

## 📌 Overview
This project will help you practice **arrays**, **loops**, and **object-oriented programming** in Java. You will create a class called **`SalesData`** that stores and analyzes a week’s worth of sales data, and then complete the **`Main`** class to test your work.

---

## 🎯 Learning Goals
By completing this project, you will:
- Declare and use **arrays** to store data.
- Write methods that calculate **total**, **average**, **highest**, and **lowest** values.
- Use **loops** for input, validation, and calculations.
- Apply **encapsulation** (private instance variables, public methods).
- Format output for readability (currency style).

---

## 🧩 Project Requirements

### **SalesData Class**
- **Instance variable:**  
  `sales` — an array of `double` (private)
- **Constructor:**  
  Accepts a `double[]` parameter, creates an internal array of the same size, and copies all elements.
- **Methods:**  
  - `getTotal()` → returns sum of all sales  
  - `getAverage()` → returns average of all sales  
  - `getHighest()` → returns highest sale  
  - `getLowest()` → returns lowest sale  
  - `toString()` → returns a multi-line string of all sales formatted as `$xx.xx`

### **Main Class**
- Create a `double[] weekSales` for **7 days**.
- Use a **for loop** to collect input from the user.
  - Validate input with a **while loop** (must be ≥ 0).
- Create a `SalesData` object using `weekSales`.
- Display (two decimal places):
Total Sales:   $____
Average Sales: $____
Highest Sale:  $____
Lowest Sale:   $____

- Print all sales using `toString()`.

---

## ✅ Checklist
- [ ] `SalesData` compiles and includes all required methods.
- [ ] Constructor **copies** array values (no reference aliasing).
- [ ] Methods return correct values for typical and edge cases.
- [ ] Output uses `$` and two decimal places.
- [ ] Input validation prevents negative numbers.

---

## 🛠 How to Run
1. Clone this repository to your computer.
2. Open the project in IntelliJ (or your preferred IDE).
3. Implement the `SalesData` class first.
4. Complete the `Main` class to test your code.
5. Run `Main` and verify the output matches the required format.

---

## 🧪 Example Output
Enter sales for day 1: 100
Enter sales for day 2: 200
Enter sales for day 3: 150
Enter sales for day 4: 300
Enter sales for day 5: 250
Enter sales for day 6: 400
Enter sales for day 7: 350
Total Sales:   $1750.00
Average Sales: $250.00
Highest Sale:  $400.00
Lowest Sale:   $100.00
All Sales (by day):
$100.00
$200.00
$150.00
$300.00
$250.00
$400.00
$350.00

---

## 🌟 Extension Ideas (Optional)
- Add a method `getMedian()` or `getDayOfHighest()` (return index + 1).
- Allow a variable number of days (prompt for length, then create array).
- Show day names (Mon–Sun) in prompts and output.

---

## 🧭 Grading Focus (Arrays)
- Correct **array handling** and **loop logic**
- Proper **encapsulation** (private array, public methods)
- Accurate **calculations** and **formatted output**
- Clean, readable code and good method design

---

## 📄 Submission
- Push your completed code to this repository.
- Update this README with:
  - Your name
  - A short example output (copied from your run)