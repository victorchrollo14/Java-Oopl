package program6;

import java.util.Scanner;

public class distanceConverter {
    double km, metre, miles;
    // 1km = 1000m
    // 1mile = 1.62km

    void kmToMetre() {
        System.out.println("Enter the kilometers to get meters: ");
        Scanner sc = new Scanner(System.in);
        km = sc.nextDouble();
        metre = (km * 1000);
        System.out.println(km + "is equal to " + metre + "m");
        sc.close();
    }

    void MetreToKm() {
        System.out.println("Enter the meters to get Kilometers: ");
        Scanner sc = new Scanner(System.in);
        metre = sc.nextDouble();
        km = metre / 1000;
        System.out.println(metre + "m is equal to " + km + "km");
        sc.close();
    }

    void KmtoMile() {
        System.out.println("Enter the kilometers to get miles: ");
        Scanner sc = new Scanner(System.in);
        km = sc.nextDouble();
        miles = (km * 1.62);
        System.out.println(km + "km is equal to " + miles + "miles");
        sc.close();
    }

    void MileToKm() {
        System.out.println("Enter the miles to get Kilometers: ");
        Scanner sc = new Scanner(System.in);
        miles = sc.nextDouble();
        km = metre / 1.62;
        System.out.println(miles + "miles is equal to " + km + "km");
        sc.close();
    }

    // public static void main(String[] args) {
    // distanceConverter dc = new distanceConverter();
    // // dc.kmToMetre();
    // // dc.MetreToKm();
    // dc.KmtoMile();
    // }
}
