import java.util.Scanner;

public class FuelCalc {
    public static void Calc(String[] args) {
        //Variable Delcaration
        int fuel_selection;   
        float fuel_consumption;
        float cost;

        final float fuel_price_92 = 10;
        final float fuel_price_95 = 15;
        final float fuel_price_98 = 20;

        Scanner scan = new Scanner(System.in);
        
        System.out.println("Here is the fuel price for each fuels");
        System.out.println("92: 10NTD");
        System.out.println("95: 15NTD");
        System.out.println("98: 20NTD");

        System.out.println("Please select your fuel type: ");
        fuel_selection = scan.nextInt();
        if (fuel_selection == 92)
        {
            //Calc: 92
            System.out.println("Please input your fuel comsumption: ");
            fuel_consumption = scan.nextFloat();
            cost = fuel_consumption * fuel_price_92;

            System.out.println("Here is your overall cost: " + cost + " NTD");
        }else if (fuel_selection == 95)
        {
            //Calc: 95
            System.out.println("Please input your fuel comsumption: ");
            fuel_consumption = scan.nextFloat();
            cost = fuel_consumption * fuel_price_95;

            System.out.println("Here is your overall cost: " + cost + " NTD");
        }else if (fuel_selection == 98)
        {
            //Calc: 98
            System.out.println("Please input your fuel comsumption: ");
            fuel_consumption = scan.nextFloat();
            cost = fuel_consumption * fuel_price_98;

            System.out.println("Here is your overall cost: " + cost + " NTD");
        }else{
            System.out.println("Input Error, please try again!");
        }

        scan.close();
    }
}
