## Introduction to Java Programming
Here is an example of a simple Java program

```Java
public class App{ //class name callled App, first and only class in the program
    public static void main(String args[]) //Method called main
    {
        System.out.println("Hello world!");
    }
}
```

Note:
- Public class name is equal to the file name
- At the complete Java program, there should be at least one class

Keywords:
- main(): Entry point of every program
- public: Publically accessible class
- static: pre-loaded block (Pre-loaded to the memory before the program start)
- void: No return value need
- String args[]: The string array is acceptable when the main function is initiated. (JVM pre-defined)

API (Application Programming Interface)
```Java
System.out.println("Hi");
```
Concept:
- Class: System
    - out
        - Method (Function): println()

Note: 
- System.out.println is a pre-imported method and class in JVM
