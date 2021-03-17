## Control Flow in Java Programming
### Outline
- Sequencial Structure
- Selective Structure
- Iterative Structure

### Sequencial Structure
Step by step process

### Selection Structure
#### Sample Code: if-structure
```Java
import java.util.Scanner;
public class App{
    public static void main (String[] args){
        int selection;
        Scanner scan = new Scanner(System.in);
        selection = scan.nextInt();
        
        //Selection Struture
        if (selection == 1){
            System.out.println("The selection is: " + selection);
        }else{
            System.out.println("The selection is not equal to one. Selection: " + selection);
        }

        scan.close();
    }
}
```
#### Sample code - Switch
```Java
import java.util.Scanner;
public class App{
    public static void main (String[] args){
        int selection;
        Scanner scan = new Scanner(System.in);
        selection = scan.nextInt();
        
        //Selection Struture
        switch(selection)
        {
            case '1':
            System.out.println("1");
            break;
            case '2':
            System.out.println("1");
            break;
            default:
            System.out.println("3");
            break;
        }

        scan.close();
    }
}
```

### Interative
#### Sample Code - Loop: do-while
```Java
import java.util.Scanner;
public class App{
    public static void main (String[] args){
        int counter = 0;
        
        //Selection Struture
        do{
            counter++;
            System.out.println(counter);
        }while(counter < 3);
    }
}
```

#### Sample Code - Loop: while
```Java
import java.util.Scanner;
public class App{
    public static void main (String[] args){
        int counter = 0;
        
        //Selection Struture
        while(counter<3){
            counter++;
            System.out.println(counter);
        };
    }
}
```

#### Sample Code - Loop: for
```Java
import java.util.Scanner;
public class App{
    public static void main (String[] args){
        int counter = 0;
        
        //Selection Struture
        for(counter = 0; counter < 3; counter++){
            System.out.println(counter);
        }
    }
}
```

#### Sample Code - Loop: Enhanced For Loop (For-each loop)
```Java
public class App{
    public static void main(String[] args){
        int numbers[] = {11,22,33,44,55}; //Create an array
        int i = 0; //Indexing the array

        for (int count: numbers){
            System.out.println("Numbers: " + i + ":"+count);
            i++;
        }
    }   
}
```Java
public class App{
    public static void main(String[] args){
        int coding_language[] = {"Java", "C/C++", "Python"}; //Create an array
        int i = 0; //Indexing the array
        
        for (String skill: coding_languages){
            System.out.println("Numbers: " + i + ":"+skill);
            i++;
        }
    }   
}
```
Note: This approach enables programmer to write a clean and fast code in examing an array.

