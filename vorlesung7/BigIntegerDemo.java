package vorlesung7;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Random;

public class BigIntegerDemo
{

   public static void main(String[] args)
   {
      BigInteger a = new BigInteger("1111111111119999999998800");
      BigInteger b = new BigInteger("2546735753786829892");
      BigInteger c = a.multiply(b);
      System.out.println(c);
      BigInteger p = BigInteger.probablePrime(1024, new Random());
      System.out.println(p);
      BigDecimal d = new BigDecimal("1.456777777777777777777777777983");
      BigDecimal e = new BigDecimal("1786.66666666666666437847865486589");
      System.out.println(d.multiply(e));

   }

}
