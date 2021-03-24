## Introduction to Arrays in Java Programming
### Introduction to Arrays
Once we can perform looping concept in programming using Java, we can then input multivalues in a single and continuous memory block under a single control flow.
Therefore, we need array to store mulitple values in a single memory block. Like the example below:
```Java
import java.util.Scanner;

public class App{
    public static void main (String[] args){
        System.out.println("Please input the length of your array");
        Scanner scan = new Scanner(System.in);
        final int LEN = scan.nextInt();
        String[LEN] brand = new String();

        for (int i = 0; i<LEN; i++){
            brand[i] = scan.nextLine();
        }

        //Print out all of the elements one by one
        for (int i = 0; i<LEN; i++){
            System.out.println("The " +i+ "element is: " + brand[i]);
        }
    }
}
```


#### How to use an array in Java?
Here, we help you figure out how to use an array in Java programming language. Firstly, let's us talk about the procedure in using an array
1. Declare an array
```Java
int num[];
```
2. Apply an array to object
```Java
int num = new int[3]; 
```
3. Use the array!

##### Popular API for Array
The length of array:
```Java
int num = new int[3];
int len = num.length; //length (Property)
System.out.println(len);
//Len = 3
```
The clone method:
```Java
int arr_1 = new int[3] = {0,1,2};
int arr_2[];
arr_1 = arr_2; //Reference
arr_2 = arr_1.clone(); //Copy the array 1 to array 2
```

#### Two-dimensional Array
##### Questions:
- What is an two-dimensional array?
- Why we need an two-dimensional array?
- How to declare, use, and apply two-dimensional array?

##### What is an two-dimensional array?
The two-dimensional array is a basic data structure that can store and display two-dimensional data.
```Java
int num_arr[][];
int 
```
##### Why we need an two-dimensional array?
##### How to declare, use, and apply two-dimensional array?