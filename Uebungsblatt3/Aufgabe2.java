package Uebungsblatt3;

import java.util.Scanner;

public class Aufgabe2 {
    public static void main(String[] args) {
        int ergebnis = 0;


        Scanner sc = new Scanner(System.in);
        int eingabe = sc.nextInt();
        sc.close();

        if (eingabe % 2 == 0) {
            int zwischenergebnis1 = eingabe / 2;
            System.out.println("Der erste Teiler ist 2 " + zwischenergebnis1);
            for (int i = 1; i <= zwischenergebnis1; i++) {
                if (zwischenergebnis1 % i == 0) {
                    int zwischenergebnis2 = zwischenergebnis1 / i;
                    System.out.println("Der erste Teiler ist " + i + " " + zwischenergebnis1);
                }
                System.out.println(+i + " ist ein Teiler von " + eingabe);
            }
        }

    }

}
