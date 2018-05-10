package vorlesung12;

import java.util.Scanner;

import util.ReadUtil;

public class FigurMalen
{

   public static void main(String[] args)
   {
      String s = ReadUtil.nextLine("Figur = ");
      Scanner in = new Scanner(s);
      while (in.hasNext())
      {
         if (in.hasNextInt())
         {
            int anz = in.nextInt();
            String t = in.next();
            // Umwandlung b in Blank (" ")
            if (t.equals("b"))
               t = " ";
            for (int i = 0; i < anz; i++)
               System.out.print(t);
         } else // Kann nur n sein
         {
            in.next(); // n überlesen
            System.out.println();
         }

      }

   }

}
