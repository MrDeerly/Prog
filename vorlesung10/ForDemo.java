package vorlesung10;

import util.ReadUtil;

public class ForDemo
{
   public static boolean istPrim(int n)
   {
      // n >= 2
      if (n < 2)
         throw new IllegalArgumentException("Zahl muss >= 2 sein");
      // Spezialfall
      if (n == 2)
      {
         return true;
      }
      // ab hier ist n > 2
      if (n % 2 == 0) // Ist n gerade?
      {
         return false;
      }
      // ab hier ist n >2 und n ist ungerade
      // Überprüfe, ob n durch eine Zahl der Menge
      // {3, 5, ..., (int) Math.sqrt(n)} Teiler von n ist
      // Falls ja, dann ist n keine Primzahl
      int ende = (int) Math.sqrt(n);
      for (int i = 3; i <= ende; i += 2)
      {
         if (n % i == 0)
            return false;
      }
      // Ab hier hat n keinen Teiler => n muss prim sein
      return true;
   }

   public static void main(String[] args)
   {
      boolean weiter = true;
      do
      {
         int n = ReadUtil.nextInt("eine Zahl >= 2, 1 heißt Abbruch", 1,
               Integer.MAX_VALUE);
         if (n == 1)
         {
            weiter = false;
         } else
         {
            if (istPrim(n))
            {
               System.out.println(n + " ist eine Primzahl");
            } else
            {
               System.out.println(n + " ist keine Primzahl");
            }
         }
      } while (weiter);

   }

}
