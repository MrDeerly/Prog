package vorlesung8;

import java.math.BigInteger;

import util.ReadUtil;

public class MiniTaschenRechner
{
   public static BigInteger auswertung1(char c, BigInteger x, BigInteger y)
   {
      BigInteger ergebnis;
      if (c == '+')
         ergebnis = x.add(y);
      else if (c == '-')
         ergebnis = x.subtract(y);
      else if (c == '*')
         ergebnis = x.multiply(y);
      else if (c == '/')
         ergebnis = x.divide(y);
      else // c == '%'
         ergebnis = x.mod(y);
      return ergebnis;
   }

   public static BigInteger auswertung2(char c, BigInteger x, BigInteger y)
   {
      BigInteger ergebnis;
      switch (c)
      {
      case '+':
         ergebnis = x.add(y);
         break;
      case '-':
         ergebnis = x.subtract(y);
         break;
      case '*':
         ergebnis = x.multiply(y);
         break;
      case '/':
         ergebnis = x.divide(y);
         break;
      default:
         ergebnis = x.mod(y);
      }
      return ergebnis;
   }

   public static void main(String[] args)
   {
      // Ausdrucksanweisung - Methodenaufruf
      System.out.println("Mini-Taschenrechner");
      // Variablendeklarationen
      BigInteger a, b;
      char op;
      // String txt = ReadUtil.sIn.next();
      // a = new BigInteger(text);
      // a = new BigInteger(ReadUtil.sIn.next());
      a = ReadUtil.nextBigInteger("Erster Operand");
      op = ReadUtil.nextAllowedChar("Operator", "+-*/%");
      b = ReadUtil.nextBigInteger("Zweiter Operand");
      // op = ReadUtil.sIn.next().charAt(0);
      // b = new BigInteger(ReadUtil.sIn.next());
      System.out.println(MiniTaschenRechner.auswertung1(op, a, b));

   }

}
