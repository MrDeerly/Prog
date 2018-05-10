package vorlesung7;

import util.MathUtil;

public class TestMath
{

   public static void main(String[] args)
   {
      double d = 5.3;
      long l = Math.round(d);
      System.out.println(l);
      System.out.println(Math.sin(d));
      System.out.println(MathUtil.log(1024, 2));
      int a = Integer.MAX_VALUE;
      int b = 2;
      System.out.println(a + b);
      // System.out.println(Math.addExact(a, b));
      a = 123456;
      b = 7777999;
      System.out.println(a * b);
      System.out.println(Math.multiplyExact(a, b));

   }

}
