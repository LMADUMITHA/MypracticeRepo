## Exercise 2: E-commerce Platform Search Function

### 📘 Scenario

You are developing the search functionality for an e-commerce platform. The goal is to optimize search operations for fast performance.

---

### 📊 1. Understanding Asymptotic Notation

**Big O Notation** describes the growth of an algorithm’s runtime relative to input size. It helps assess and compare algorithm efficiency across best, average, and worst-case scenarios.

- **Best Case:** Minimal time (e.g., finding the target in the first position).
- **Average Case:** Expected time over typical inputs.
- **Worst Case:** Maximum time (e.g., when the item is not found).

---

### 🛠 2. Setup

A `Product` class is defined with the following attributes:
- `productId` (int)
- `productName` (String)
- `category` (String)

📁 See [`Product.java`](Code/Product.java)

---

### ⚙️ 3. Implementation

Two search algorithms are implemented in [`ProductSearch.java`](Code/ProductSearch.java):

- **Linear Search:** Iterates through each element to find a match.
- **Binary Search:** Requires a sorted array and applies divide-and-conquer for faster lookup.

---

### 📈 4. Time Complexity Analysis

| Algorithm      | Time Complexity | Best Case | Average Case | Worst Case |
|----------------|----------------|-----------|--------------|------------|
| Linear Search  | O(n)           | O(1)      | O(n)         | O(n)       |
| Binary Search  | O(log n)       | O(1)      | O(log n)     | O(log n)   |

- **Linear Search** works on unsorted data but is inefficient for large datasets.
- **Binary Search** is optimal for sorted data and performs significantly better in larger datasets.

---

### ✅ Recommendation

For an e-commerce platform with a large product catalog, **binary search** is recommended due to its logarithmic time performance. For real-world scenarios, leveraging **indexed databases** or **search engines (e.g., Elasticsearch)** would be even more scalable.

---

### ▶️ How to Run

```bash
javac Product.java ProductSearch.java
java ProductSearch
````

---

📸 Screenshots of the output are available in the [`Output/`](Output/ProductSearch.png) folder.

