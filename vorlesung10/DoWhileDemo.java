package vorlesung10;

import util.ReadUtil;

public class DoWhileDemo
{

   /*
    * Liest eine Zeichenkette ein, bis Ja oder Nein eingegeben wurde
    */
   public static String liesJaNein()
   {
      // wir müssen mindestens einmal einlesen => do-while-Schleife
      String eingabe;
      do
      {
         eingabe = ReadUtil.next("Bitte Ja oder Nein eingeben");
      } while (!("Ja".equals(eingabe) || "Nein".equals(eingabe)));
      //
      // } while ( "Ja".equals(eingabe) == false && "Nein".equals(eingabe) ==
      // false);
      // eingabe ist entweder Ja oder Nein
      return eingabe;
   }

   /*
    * Liest eine Zeichenkette ein, bis Ja oder Nein eingegeben wurde
    */
   public static String liesJaNein2()
   {
      // wir müssen mindestens einmal einlesen => do-while-Schleife
      String eingabe;
      boolean bedingungserfuellt = false;

      do
      {
         eingabe = ReadUtil.next("Bitte Ja oder Nein eingeben");
         // Bedingung überprüfen
         bedingungserfuellt = "Ja".equals(eingabe) || "Nein".equals(eingabe);
      } while (!bedingungserfuellt);

      return eingabe;
   }

   /*
    * Liest eine Zeichenkette ein, bis Ja oder Nein eingegeben wurde
    */
   public static String liesJaNein3()
   {
      // wir müssen mindestens einmal einlesen => do-while-Schleife
      String eingabe;
      boolean bedingungserfuellt = false;

      do
      {
         eingabe = ReadUtil.next("Bitte Ja oder Nein eingeben");
         // Bedingung überprüfen
         switch (eingabe)
         {
         case "Ja":
         case "ja":
         case "JA":
         case "Nein":
         case "nein":
         case "NEIN":
            bedingungserfuellt = true;
         }
      } while (!bedingungserfuellt);

      return eingabe;
   }

   public static String liesJaNein4()
   {
      // wir müssen mindestens einmal einlesen => do-while-Schleife
      String eingabe;
      boolean bedingungserfuellt = false;

      do
      {
         // Einlesen und in kleine Schreibweise umgewandeln
         eingabe = ReadUtil.next("Bitte Ja oder Nein eingeben").toLowerCase();
         // Bedingung überprüfen
         switch (eingabe)
         {
         case "ja":
         case "nein":
            bedingungserfuellt = true;
         }
      } while (!bedingungserfuellt);

      return eingabe;
   }

   public static void main(String[] args)
   {

   }
}
