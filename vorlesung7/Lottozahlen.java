package vorlesung7;

import java.util.ArrayList;

public class Lottozahlen
{
   public static int generiertLottoZahl()
   {
      return (int) (Math.random() * 49) + 1;
   }

   public static void main(String[] args)
   {
      // Zahlen können mehrfach vorkommen
      for (int i = 0; i < 6; i++)
         System.out.println(generiertLottoZahl());

      ArrayList<Integer> liste = new ArrayList<>();
      // solange wir keine 6 Zahlen haben
      while (liste.size() != 6)
      {
         int z = generiertLottoZahl();
         if (liste.contains(z) == false)
         {
            liste.add(z);
         }
      }

      System.out.println(liste);

   }

}
