package Uebungsblatt1;

import java.util.Scanner;

public class Aufgabe4 {
    public static void main(String[] args) {
        double GradInCelsius;
        double GradInFahrenheit;
        Scanner sc = new Scanner(System.in);
        System.out.println("Bitte geben Sie den gewünschte Einheit an. (1 für Fahrenheit | 2 für Celsius)");
        int einheit = sc.nextInt();
        System.out.println("Bitte geben Sie die gewünschte Temperatur ein: ");
        double temp = sc.nextDouble();
        sc.close();

        if (einheit == 1) {
            GradInCelsius = ((temp - 32) / 1.8);
            System.out.println(+temp + " Grad Fahrenheit entsprechen " + GradInCelsius + " Grad Celsius");
        } else if (einheit == 2) {
            GradInFahrenheit = (temp * 1.8) + 32;
            System.out.println(+temp + " Grad Celsius entsprechen " + GradInFahrenheit + " Grad Fahrenheit");
        } else {
            System.out.println("Ungültige Eingabe!");
        }
    }
}
