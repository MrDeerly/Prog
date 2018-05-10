package vorlesung1;

import java.util.Scanner;

/**
 * Ein einfaches Programm, das zwei ganze Zahlen einliest und deren Summe und
 * Produkt ausgeben
 *
 */
public class SummeUndProdukt
{

   static Scanner sIn = new Scanner(System.in);

   public static void main(String[] args)
   {
      // Definition zweier Variablen vom Typ int
      int a;
      int b;
      System.out.println("Geben Sie bitte zwei ganze Zahlen ein");
      a = sIn.nextInt();
      b = sIn.nextInt();
      int summe = a + b;
      int produkt = a * b;
      System.out.println("Summe = " + summe);
      System.out.println("Produkt = " + produkt);
   }

}
