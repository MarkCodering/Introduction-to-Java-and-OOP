## Control Flow in Java Programming
### Outline
- Sequencial Structure
- Selective Structure
- Iterative Structure

### Sequencial Structure
Step by step process

### Selection Structure
Sample Code:
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