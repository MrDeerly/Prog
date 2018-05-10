package Uebungsblatt3;

import java.util.Scanner;

public class Aufgabe1 {
    public static void main(String[] args) {
        System.out.println("Bitte geben Sie Ihre Zahl ein");
        Scanner sc = new Scanner(System.in);
        int eingabe = sc.nextInt();
        sc.close();


        for (int i = 1; i <= eingabe; i++) {
            if (eingabe % i == 0) {
                System.out.println(+i + " ist ein Teiler von " + eingabe);
            }
        }
    }
}
