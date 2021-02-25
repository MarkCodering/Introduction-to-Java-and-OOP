//import java.io.*;
//import java.lang.*;
import java.util.Scanner;

public class login extends App {
    public static String username;
    public static String password;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to use our student application\nPlease input your username: ");

        username = scan.nextLine();

        System.out.println("Your password");
        password = scan.nextLine();

        System.out.println("Is that your password?");
        System.out.println("Username: " +  username);
        System.out.println("Password: " + password);
        String confirmation = scan.nextLine();

        do{
            if (confirmation == "Yes")
            {
                System.out.println("Welcome!");
            }else{
                System.out.println("Would you like to input again?");
                confirmation = scan.nextLine();
            }
        }while (confirmation == "No");
    }
    
}
