package program6;

import java.util.*;

public class converter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice, ch;
        currencyConverter c = new currencyConverter();
        distanceConverter d = new distanceConverter();
        timeConverter t = new timeConverter();

        do {
            System.out.println("1.dollar to rupee ");
            System.out.println("2.rupee to dollar ");
            System.out.println("3.Euro to rupee ");
            System.out.println("4..rupee to Euro ");
            System.out.println("5.Yen to rupee ");
            System.out.println("6.Rupee to Yen ");
            System.out.println("7.Meter to kilometer ");
            System.out.println("8.kilometer to meter ");
            System.out.println("9.Miles to kilometer ");
            System.out.println("10.kilometer to miles ");
            System.out.println("11.Hours to Minutes ");
            System.out.println("12.Hours to Seconds ");
            System.out.println("13.Seconds to Hours ");
            System.out.println("14.Minutes to Hours ");
            System.out.println("Enter your choice ");
            choice = sc.nextInt();

            switch (choice) {
                case 1: {
                    c.DollarToRupees();
                    break;
                }
                case 2: {
                    c.RupeesToDollars();
                    break;
                }
                case 3: {
                    c.EuroToRupees();
                    break;
                }
                case 4: {
                    c.RupeesToEuro();
                    break;
                }
                case 5: {
                    c.YentoRupees();
                    break;
                }
                case 6: {
                    c.RupeesToYen();
                    break;
                }
                case 7: {
                    d.MetreToKm();
                    break;
                }
                case 8: {
                    d.kmToMetre();
                    break;
                }
                case 9: {
                    d.MileToKm();
                    break;
                }
                case 10: {
                    d.KmtoMile();
                    break;
                }
                case 11: {
                    t.hourstominutes();
                    break;
                }
                case 12: {
                    t.hourstoseconds();
                    break;
                }
                case 13: {
                    t.secondstohours();
                    break;
                }
                case 14: {
                    t.minutestohours();
                    break;
                }

            }
            System.out.println("Enter 0 to quit and 1 to continue ");
            ch = sc.nextInt();

        } while (ch == 1);
        sc.close();
    }
}
