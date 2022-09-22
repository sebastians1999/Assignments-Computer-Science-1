
import java.util.Scanner;
//import java.math.*;
public class NeuroConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your amount?:");
        double amount = scanner.nextDouble();
        scanner.nextLine();
        converter(amount);
    }
    public static void converter(double amount) {
        int wholecoin = (int)(amount);
        double cents = amount-wholecoin;

        double calculate = Math.round(100*cents);  // necessary to switch it into an integer later

        int coins49 = (int)(calculate)/49;
        calculate = calculate - coins49*49;
        int coins9 = (int)(calculate)/9;
        calculate = calculate - coins9*9;
        int coins1 = (int)(calculate)/1;

        System.out.println(wholecoin);
        System.out.println(coins49);
        System.out.println(coins9);
        System.out.println(coins1);
    }
}

