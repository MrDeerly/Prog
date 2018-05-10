package vorlesung9;

import util.ReadUtil;

public class IfDemo
{

   public static void main(String[] args)
   {
      double note;
      int punktzahl = ReadUtil.nextInt("Punkte (0-30)", 0, 30);
      if (punktzahl > 27)
         note = 1;
      else if (punktzahl > 24)
         note = 1.3;
      else if (punktzahl > 21)
         note = 1.7;
      else
         note = 2.0;
      System.out.println(note);

      // Dagegen sind die folgenden Formulierungen falsch
      if (punktzahl > 27)
         note = 1;
      if (punktzahl > 24)
         note = 1.3;
      if (punktzahl > 21)
         note = 1.7;
      else
         note = 2.0;

   }

}
