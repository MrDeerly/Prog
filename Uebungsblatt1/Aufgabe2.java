package Uebungsblatt1;

import java.util.Scanner;

public class Aufgabe2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();

        System.out.println("Summe: " + (a + b));
        System.out.println("Differenz: " + (a - b));
        System.out.println("Produkt: " + (a * b));
        System.out.println("Quotient: " + (a - b));
        System.out.println("Diffisionsrest: " + (a % b));
    }
}
