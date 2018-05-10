package vorlesung7;

import util.ReadUtil;

public class Zahlenumwandlung
{

   public static void main(String[] args)
   {
      int a = ReadUtil.nextInt("Zahl = ");
      System.out.println(Integer.toBinaryString(a));
      System.out.println(Integer.toHexString(a));
      System.out.println(Integer.toOctalString(a));

   }

}
