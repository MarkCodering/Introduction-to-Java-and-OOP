import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to the banking system of TKUBANK"); 

        //Declare the variables
        int limit;
        int credit_status;
        float years_of_holding;

        Scanner scan = new Scanner(System.in);

        //Input the initial values
        System.out.print("Please input your credit card limit: ");
        limit = scan.nextInt();
        System.out.println();
        System.out.print("Is your credit status functional? (Yes, 1; No, 0)");
        credit_status = scan.nextInt();
        System.out.println();
        
        //Condition Determination
        if(credit_status == 1)
        {
            System.out.print("Please input your years of holding: ");
            years_of_holding = scan.nextFloat();
            if (years_of_holding < 0.5)
            {
                System.out.println("You are not possible to apply for cash advance");
            }else if(years_of_holding > 0.5 && years_of_holding < 1){
                System.out.println("Your cash advance limit: " + (limit/2));
            }else if(years_of_holding > 2){
                System.out.println("Your cash advance limit: " + limit);
            }else{
                System.out.println("System Error\nPlease redo the request");
            }
        }else{
            System.out.println("Your credit status is not functional. Reguest failed");
        }

        scan.close();
    }
}
