# Educational-Initiative-Assignment

This repository contains Java implementations of exercises based on Object-Oriented Programming (OOP) and Software Design Patterns.  
The focus is on showcasing **clean code, SOLID principles, and design pattern usage** for placement evaluation.  

---

## 📌 Exercise 1: Design Patterns Demonstration

### ✅ Problem Statement
Demonstrate understanding of **behavioral, creational, and structural design patterns** by coding **six different use cases** in Java.  

### 🔑 Implemented Patterns
- **Behavioral Patterns**
  - **Observer Pattern** → Stock Market Price Updates  
  - **Strategy Pattern** → Payment Gateway System  
- **Creational Patterns**
  - **Singleton Pattern** → Logger Utility  
  - **Factory Pattern** → Shape Creator  
- **Structural Patterns**
  - **Adapter Pattern** → Media Player (MP3 + MP4 support)  
  - **Decorator Pattern** → Coffee Shop (add milk, sugar, etc.)  

### 📂 Code Organization
Each design pattern is implemented in a **self-contained class** with its own `main()` method for testing.  


---

## 📌 Exercise 3: Mars Rover Simulation

### ✅ Problem Statement
Create a **Mars Rover simulation** on a grid-based terrain using **pure OOP and design patterns**, avoiding `if-else` chains.  

The Rover must:
- Move forward (`M`)  
- Turn left (`L`)  
- Turn right (`R`)  
- Detect obstacles  
- Stay within boundaries  
- Provide a **status report** of current position and direction  

### 🔑 Design Patterns Used
- **Command Pattern (Behavioral):**  
  Encapsulates commands `M`, `L`, `R` as objects for flexibility.  
- **Composite Pattern (Structural):**  
  Represents the grid and obstacles as a tree structure.  
- **Polymorphism:**  
  Used for directions and movement (instead of long if-else chains).  

### 📂 Code Features
- User input for grid size, obstacles, start position, and commands  
- Obstacle detection with warnings  
- Boundary validation  
- Final rover status report  
- Exception handling for invalid inputs  

