## Lecture 3 - The Fundamentals

### Introduction to Variables
There are six main variables types we often used in Java programming
- int (integer)
- float (Floating points)
- double (Double Floating Points)
- char (Chacater)
- String (String)
- boolean (Boolean Expression)

#### Example (3.1): Declare Varibles:
```Java
int num;
float num_float;
double num_double_float;
char character = 'A';
String setenance;
boolean condition;
```

#### Input/Output of the varibles
```Java
import java.util.Scanner;

public class App{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in)
        //Scanner class, new objectm, new (keyword), Scanner(Input Stream)

        int num = scan.nextInt();
    }
}
```

### Note: Escape Character in Java
- \f
- \b
- \n
- \r
- \t

### Introduction to Expression and Arguments
