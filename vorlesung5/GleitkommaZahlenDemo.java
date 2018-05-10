package vorlesung5;

import util.MathUtil;

public class GleitkommaZahlenDemo
{

   public static void main(String[] args)
   {
      double a = +0.0;
      System.out.println(1 / a); // Infinity
      a = -0.0;
      double b = 1;
      System.out.println(b / a); // -Infinity
      a = -0; // -0 ist ein int
      System.out.println(1 / a); // Infinity
      a = 1.1;
      if (3 * a == 3.3) // schlecht!!
         System.out.println("Gleich");
      else
         System.out.println("?????");
      System.out.println(3 * a);

      if (MathUtil.fastgleich(3 * a, 3.3)) // besser!!
         System.out.println("Gleich");
      else
         System.out.println("?????");
      // Auslöschungsdemo - Addition einer sehr großen mit einer sehr kleinen
      a = 1.3E20;
      b = 2.3E-40;
      a = a + b;
      System.out.println(a);

      a = -1;
      System.out.println(Math.sqrt(a));

   }

}
