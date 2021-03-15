## Control Flow in Java Programming
### Outline
- Sequencial Structure
- Selective Structure
- Iterative Structure

### Sequencial Structure
Step by step process

### Selection Structure
Sample Code: if-structure
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
Sample code - Switch case
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

