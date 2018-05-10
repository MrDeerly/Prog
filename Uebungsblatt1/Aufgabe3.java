package Uebungsblatt1;

import java.util.Scanner;

public class Aufgabe3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bitte geben Sie die erste Zahl ein: ");
        int a = sc.nextInt();
        System.out.println("Bitte geben Sie die zweite Zahl ein: ");
        int b = sc.nextInt();
        sc.close();

        if (a == Math.pow(b, 2) || b == Math.pow(a, 2)) {
            System.out.println("Quadrat!");
        }
    }
}
