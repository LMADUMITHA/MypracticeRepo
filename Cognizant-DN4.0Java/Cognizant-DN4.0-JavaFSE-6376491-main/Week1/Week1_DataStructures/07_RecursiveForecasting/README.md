## Exercise 7: Financial Forecasting

### Scenario

This program calculates the future financial value based on an initial amount, growth rate, and number of years using a recursive approach.

---

### 1. What is Recursion?

Recursion means a function calls itself. It's useful when solving problems that repeat the same logic for smaller parts — like calculating growth year by year.

---

### 2. Program Details

- Uses a recursive method to calculate future value.
- Inputs:
  - `currentValue`: Initial amount
  - `growthRate`: Annual growth (e.g., 0.08 for 8%)
  - `years`: Number of years to calculate for

📁 Code file: [`FinancialForecast.java`](Code/FinancialForecast.java)

---

### 3. Time Complexity

- Recursive Time Complexity: **O(n)**  
- Each recursive call processes one year until it reaches zero.

---

### 4. How to Run

```bash
javac FinancialForecast.java
java FinancialForecast
````

---

📸 Output screenshot:
See [`Output/FinancialForecast.png`](Output/FinancialForecast.png)
