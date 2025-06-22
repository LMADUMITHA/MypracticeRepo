# Cognizant-DN4.0-JavaFSE-6376491

This repository contains Java-based solutions for hands-on exercises as part of **Cognizant Digital Nurture 4.0 – Java Full Stack Engineering (FSE)** program. Exercises are organized by week and skill.

---

## 📁 Repository Structure

```

├── Week1
│   ├── Week1_DesignPatterns/
│   │   ├── 01_SingletonPattern/
│   │   ├── 02_FactoryMethodPattern/
│   ├── Week1_DataStructures/
|   │   ├── 02_SearchAlgorithms/
|   │   ├── 07_RecursiveForecasting/
├── Week2
├── Week3
├── Week4
├── Week5
├── Week6
├── Week7
├── Week8

````

Each topic folder contains:
- `Code/`: Source files
- `Output/`: Screenshots or terminal results
- `README.md`: Short explanation 

---

## 🧠 Contents

### 🔷 Week 1: Design Patterns

#### [01. Singleton Pattern](Week1/Week1_DesignPatterns/01_SingletonPattern/Code/SingletonPatternExample/src)
Implements a thread-unsafe Singleton Logger.
- [`Logger.java`](Week1/Week1_DesignPatterns/01_SingletonPattern/Code/SingletonPatternExample/src/Logger.java)
- [`LoggerTest.java`](Week1/Week1_DesignPatterns/01_SingletonPattern/Code/SingletonPatternExample/src/LoggerTest.java)

#### [02. Factory Method Pattern](Week1/Week1_DesignPatterns/02_FactoryMethodPattern/Code)
Uses the Factory Method design pattern to create documents like Word, PDF, and Excel.
- Factory: [`DocumentFactory.java`](Week1/Week1_DesignPatterns/02_FactoryMethodPattern/Code/factory/DocumentFactory.java)
- Implementations: [`WordDocumentFactory.java`](Week1/Week1_DesignPatterns/02_FactoryMethodPattern/Code/factory/WordDocumentFactory.java), etc.
- Test: [`FactoryTest.java`](Week1/Week1_DesignPatterns/02_FactoryMethodPattern/Code/FactoryTest.java)

---

### 🔶 Week 1: Data Structures & Algorithms

#### [02. Search Algorithms](Week1/Week1_DataStructures/02_SearchAlgorithms/Code)
Implements linear and binary search for a `Product` class.
- [`Product.java`](Week1/Week1_DataStructures/02_SearchAlgorithms/Code/Product.java)
- [`ProductSearch.java`](Week1/Week1_DataStructures/02_SearchAlgorithms/Code/ProductSearch.java)

#### [07. Recursive Financial Forecasting](Week1/Week1_DataStructures/07_RecursiveForecasting/Code)
Recursively predicts future financial value using growth rate.
- [`FinancialForecast.java`](Week1/Week1_DataStructures/07_RecursiveForecasting/Code/FinancialForecast.java)

---

## 🚀 How to Run Code

1. Navigate to the relevant `Code/` folder:
   ```bash
   cd Week1_DataStructures/02_SearchAlgorithms/Code/
   ```

2. Compile:

   ```bash
   javac *.java
   ```
3. Run:

   ```bash
   java ProductSearch
   ```

---

## 📜 License

This repository is for educational and evaluation purposes under the DN 4.0 program.
