package vorlesung3;

import java.util.Scanner;

public class EuroDMUmrechnung
{

   private static Scanner sIn = new Scanner(System.in);

   public static void main(String[] args)
   {
      double betrag;
      System.out.println("=====================");
      System.out.println("   EURO-DM-Rechner   ");
      System.out.println(" 1: DM -> Euro");
      System.out.println(" 2: Euro -> DM");
      System.out.println(" 0: Programm beenden");
      System.out.println("=====================");
      System.out.println("Ihre Auswahl: ");
      int auswahl = sIn.nextInt();
      if (auswahl == 1)
      {
         System.out.println("Geben Sie den DM-Betrag ein");
         betrag = sIn.nextDouble();
         System.out.println("Es sind in Euro " + (betrag / 1.95583));
      } else if (auswahl == 2)
      {
         System.out.println("Geben Sie den Euro-Betrag ein");
         betrag = sIn.nextDouble();
         System.out.println("Es sind in DM " + (betrag * 1.95583));
      } else if (auswahl == 0)
      {
         System.out.println("Bye");
      } else
      {
         System.out.println("Ihre Auswahl ist nicht erlaubt");
      }

   }

}
