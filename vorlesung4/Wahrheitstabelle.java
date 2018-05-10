package vorlesung4;

public class Wahrheitstabelle
{

   private static boolean ausdruck(boolean a, boolean b, boolean c)
   {
      return (a && b) || !c;
   }

   private static boolean intToBool(int a)
   {
      return a != 0;
   }

   private static int boolToInt(boolean a)
   {
      return a ? 1 : 0;
   }

   public static void main(String[] args)
   {
      int[] werte =
      { 0, 1 };
      for (int i : werte)
      {
         for (int j : werte)
         {
            for (int k : werte)
            {
               boolean ergebnis = ausdruck(intToBool(i), intToBool(j),
                     intToBool(k));
               System.out.println(
                     i + "\t" + j + "\t" + k + "\t" + boolToInt(ergebnis));
            }
         }
      }

   }

}
