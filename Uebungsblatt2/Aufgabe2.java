package Uebungsblatt2;

import java.util.Scanner;

public class Aufgabe2 {
    public static void main(String[] args) {
        System.out.println("test");
        Scanner sc = new Scanner(System.in);
        int fuenfzig = sc.nextInt();
        int zwei = sc.nextInt();
        int eins = sc.nextInt();
        sc.close();

        double betrag = ((fuenfzig * 0.5) + (zwei * 0.02) + (eins * 0.01));
        System.out.println(+betrag + "€");

    }
}
