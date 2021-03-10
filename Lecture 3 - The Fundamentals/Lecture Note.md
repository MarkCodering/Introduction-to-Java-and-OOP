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

or you can use a more conventional approach
```Java
import java.io.*;
public class App{
    public static void main (String args[]) throws IOException{
        int num;
        String str;
        BufferedReader buf_reader;

        buf_reader = new BufferedReader(new InputStreamReader(System.in));

        str = buf.readLine();
    }
}
```

#### The Analysis of Performance
The execution performance of bufferedreader is much higher (10x) than the Scanner class.
BufferedReader > Scanner 

### Note: Escape Character in Java
- \f
- \b
- \n
- \r
- \t