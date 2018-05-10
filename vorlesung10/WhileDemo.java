package vorlesung10;

import java.util.Scanner;

public class WhileDemo
{

   public static void main(String[] args)
   {
      Scanner in = new Scanner(
            WhileDemo.class.getResourceAsStream("temperatur.txt"));
      double summe = 0;
      int anzahl = 0;
      double min = Double.MAX_VALUE;
      double max = Double.MIN_VALUE;

      // Solange noch Daten vorhanden ist
      while (in.hasNext())
      {
         double wert = in.nextDouble();
         anzahl++;
         summe += wert;
         if (wert < min)
            min = wert;
         if (wert > max)
            max = wert;
      }
      in.close();
      if (anzahl == 0)
      {
         System.out.println("Datei hat keine Daten!");
      } else
      {
         System.out.println("Durchschnittstemperatur = " + summe / anzahl
               + ", Min = " + min + ", Max = " + max);
      }
   }

}
