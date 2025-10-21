# 🎓 Student Record Management System

## Overview
The Student Record Management System is a command-line interface (CLI) application built in Java. It allows users to manage student records efficiently through a menu-driven system. Users can perform CRUD (Create, Read, Update, Delete) operations on student records stored in a dynamic list (ArrayList).

## Features
- Add a new student with unique ID, name, and marks.
- View the list of all students with their ID, name, and marks.
- Update existing student records by ID.
- Delete a student record by ID.
- Exit the system gracefully.

## Tools and Technologies
- Programming Language: Java
- IDE: VS Code / IntelliJ CE
- Data Structure: ArrayList

## How to Run
1. Clone or download the project.
2. Open the project in your preferred Java IDE.
3. Compile and run the `studentRecordSystem` class.
4. Follow the on-screen menu to perform operations.

## Usage
1. **Add Student:** Enter student name and marks to add a new record.
2. **View Students:** Displays the list of all students currently in the system.
3. **Update Student:** Enter student ID and new details to update a record.
4. **Delete Student:** Enter student ID to remove the record from the system.
5. **Exit:** Terminates the application.

---

## Key Concepts

### What is encapsulation?
Encapsulation is an object-oriented concept where an object’s internal state is hidden, and access is controlled through public methods like getters and setters. It ensures data security and controlled modification.

### How are ArrayLists different from arrays?
ArrayLists have dynamic size and provide built-in methods for adding, removing, and searching elements, whereas arrays have fixed size and can store both primitives and objects.

### How to sort an ArrayList?
ArrayLists can be sorted using built-in utilities or comparator logic, either by natural ordering or by custom criteria defined by the user.

### What is constructor overloading?
Constructor overloading occurs when a class has multiple constructors with different sets of parameters, allowing objects to be created in different ways depending on the provided data.

### How does garbage collection work in Java?
Garbage collection automatically frees memory by removing objects that are no longer referenced, preventing memory leaks without manual memory management.

### Why do we use getters and setters?
Getters and setters provide controlled access to private fields, allowing safe retrieval or modification of data, often with validation or additional logic.

### What is a static variable?
A static variable belongs to the class rather than individual objects, so all instances share the same variable.

### What is the use of the final keyword?
The final keyword can make variables constant, prevent methods from being overridden, or prevent classes from being inherited, ensuring immutability or fixed behavior.

### Difference between compile-time and runtime errors?
Compile-time errors occur during compilation, such as syntax mistakes, whereas runtime errors occur during program execution, like division by zero or accessing a null reference.

### What are access modifiers?
Access modifiers control visibility of classes, methods, and fields. Public allows access everywhere, private restricts access to the class itself, protected allows access within the package and subclasses, and default (no modifier) restricts access to within the package.
