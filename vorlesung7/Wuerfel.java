package vorlesung7;

import util.ReadUtil;

public class Wuerfel
{
   private static int wuerfeln()
   {
      return (int) (Math.random() * 6) + 1;
   }

   public static void main(String[] args)
   {
      // zum Testen des Zufallsgeneratoren
      // for (int i = 0; i < 10; i++)
      // System.out.println(wuerfeln());
      int kapital = 10;
      // Wir spielen nur 10 mal
      for (int i = 0; i < 10; i++)
      {
         System.out.println("Ihr Kapital = " + kapital);
         kapital--; // Einsatz 1 Euro
         int geheim = wuerfeln();
         int raten = ReadUtil.nextInt("Sie raten ?");
         if (raten == geheim)
         {
            System.out.println("Gratulieren");
            kapital += 3;
         } else
         {
            System.out.println("Pech im Spiel , Glück ...");
         }
      }
      System.out.println("Sie haben am Ende noch " + kapital);
   }

}
