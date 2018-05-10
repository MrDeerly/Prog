package vorlesung4;

import java.util.Scanner;

public class ProblemMitScanner
{
   // Warum müssen wir jedesmals das Objekt erzeugen,
   // kann jemand für uns das nicht erledigen?
   private static Scanner sIn = new Scanner(System.in);

   public static void main(String[] args)
   {
      System.out.println("Geben Sie bitte eine Zahl ein");
      // Was passiert, wenn der Benutzer falsch eingibt?
      // Fehlerbehandlung??
      int a = sIn.nextInt();

   }

}
