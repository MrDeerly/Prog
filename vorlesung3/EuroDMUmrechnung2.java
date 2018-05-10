package vorlesung3;

import java.util.Scanner;

public class EuroDMUmrechnung2
{

   private static final double UMRECHNUNGSKURS = 1.95583;
   private static Scanner sIn = new Scanner(System.in);

   public static void main(String[] args)
   {
      do
      {
         int auswahl = hauptMenueAnzeigen();
         if (auswahl == 1)
         {
            dmInEuroUmrechnen();
         } else if (auswahl == 2)
         {
            euroInDmUmrechnen();
         } else if (auswahl == 0)
         {
            System.out.println("Bye");
            break;
         } else
         {
            System.out.println("Ihre Auswahl ist nicht erlaubt");
         }
      } while (true);

   }

   private static int hauptMenueAnzeigen()
   {
      System.out.println("=====================");
      System.out.println("   EURO-DM-Rechner   ");
      System.out.println(" 1: DM -> Euro");
      System.out.println(" 2: Euro -> DM");
      System.out.println(" 0: Programm beenden");
      System.out.println("=====================");
      System.out.println("Ihre Auswahl: ");
      int auswahl = sIn.nextInt();
      return auswahl;
   }

   private static void dmInEuroUmrechnen()
   {
      double betrag;
      System.out.println("Geben Sie den DM-Betrag ein");
      betrag = sIn.nextDouble();
      System.out.println("Es sind in Euro " + (betrag / UMRECHNUNGSKURS));
   }

   private static void euroInDmUmrechnen()
   {
      double betrag;
      System.out.println("Geben Sie den Euro-Betrag ein");
      betrag = sIn.nextDouble();
      System.out.println("Es sind in DM " + (betrag * UMRECHNUNGSKURS));
   }

}
