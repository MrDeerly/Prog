package vorlesung5;

import util.MathUtil;
import util.ReadUtil;

public class QuadratischeGleichung
{

   public static void main(String[] args)
   {
      System.out.println("Programm zur Lösung von quadratischen Gleichungen"
            + "der Form a*x^2 + b*x + c = 0");
      double a, b, c;
      a = ReadUtil.nextDouble("a = ");
      b = ReadUtil.nextDouble("b = ");
      c = ReadUtil.nextDouble("c = ");
      if (MathUtil.fastgleich(a, 0.0))
      {
         System.out.println("a ist fast Null -> Programmabbruch");
         System.exit(1); // Notbremse!!!
      }
      double delta = b * b - 4 * a * c;
      delta = Math.sqrt(delta);
      if (Double.isNaN(delta)) // negativer Wurzel!!
      {
         System.out.println("Keine Lösung");
      } else
      {
         double x1 = (-b + delta) / (2.0 * a);
         double x2 = (-b - delta) / (2.0 * a);
         System.out.println("x1 = " + x1 + ", x2 = " + x2);
      }

   }

}
