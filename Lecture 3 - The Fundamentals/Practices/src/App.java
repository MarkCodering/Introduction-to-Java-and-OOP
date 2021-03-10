import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("This is the practice program for variables declaration");

        int num = 0;
        float num_float = 0;
        double num_double = 0;
        char character;
        String setenance;
        boolean condition;

        Scanner scan = new Scanner(System.in);
        Scanner reader = new Scanner(System.in);
        num = scan.nextInt();
        num_float = scan.nextFloat();
        num_double = scan.nextDouble();
        character = reader.next().charAt(0);
        setenance = reader.nextLine();
        condition = scan.nextBoolean();

        scan.close();
        reader.close();
    }
}
