package program6;

import java.util.Scanner;

public class currencyConverter {
    double rupee, dollar, euro, yen;

    // class that contains functions to do time conversions
    void RupeesToDollars() {
        System.out.println("Enter the rupee value to get dollars: ");
        Scanner sc = new Scanner(System.in);
        rupee = sc.nextDouble();
        dollar = rupee / 82;
        System.out.println(rupee + "Rs is equal to $" + Math.round(dollar * 100.0) / 100.0);
        sc.close();
    }

    // dollar to rupees
    void DollarToRupees() {
        System.out.println("Enter the dollar value to get Rupees: ");
        Scanner sc = new Scanner(System.in);
        dollar = sc.nextDouble();
        rupee = dollar * 82;
        System.out.println("$" + dollar + " is equal to Rs " + rupee);
        sc.close();
    }

    // rupees to euro
    void RupeesToEuro() {
        System.out.println("Enter the rupee value to get Euros: ");
        Scanner sc = new Scanner(System.in);
        rupee = sc.nextDouble();
        euro = rupee / 88;
        System.out.println(rupee + "Rs is equal to " + Math.round(euro * 100.0) / 100.0 + "euros");
        sc.close();
    }

    // euro to Rupees
    void EuroToRupees() {
        System.out.println("Enter the euro value to get Rupees: ");
        Scanner sc = new Scanner(System.in);
        euro = sc.nextDouble();
        rupee = euro * 88;
        System.out.println(euro + "euros is equal to Rs " + rupee);
        sc.close();
    }

    // Rupees to Yen
    void RupeesToYen() {
        System.out.println("Enter the rupee value to get Yen: ");
        Scanner sc = new Scanner(System.in);
        rupee = sc.nextDouble();
        yen = rupee / 1.62;
        System.out.println(rupee + "Rs is equal to " + Math.round(yen * 100.0) / 100.0 + "yen");
        sc.close();

    }

    // yen to ruppes
    void YentoRupees() {
        System.out.println("Enter the yen value to get Rupees: ");
        Scanner sc = new Scanner(System.in);
        yen = sc.nextDouble();
        rupee = yen * 1.62;
        System.out.println(yen + "yen is equal to Rs " + rupee);
        sc.close();
    }

    // public static void main(String[] args) {
    // timeConverter r = new timeConverter();
    // // r.RupeesToDollars();
    // // r.DollarToRupees();
    // // r.EuroToRupees();
    // // r.RupeesToEuro();

    // }
}
