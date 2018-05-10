package Uebungsblatt2;

import java.util.Scanner;

public class Aufgabe3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bitte geben Sie die Anzahl der Sekunden ein: ");
        int sec = sc.nextInt();
        sc.close();
        int AnzahlStunden = sec / 3600;
        int StundenRest = sec % 3600;
        int AnzahlMinuten = StundenRest / 60;
        int MinutenRest = StundenRest % 60;

        System.out.println(+sec + " Sekunden entsprechen: " + AnzahlStunden + " Stunden, " + AnzahlMinuten + " Minuten, " + MinutenRest + " Sekunden");
    }
}
