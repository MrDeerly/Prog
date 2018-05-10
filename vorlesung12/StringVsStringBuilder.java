package vorlesung12;

public class StringVsStringBuilder
{

   public static void main(String[] args)
   {
      String s = ""; // oder s = new String();
      long start = System.currentTimeMillis();
      for (int i = 0; i < 10000; i++)
         s += " Zahl " + i;
      long end = System.currentTimeMillis();
      System.out.println("benötigte Zeit = " + (end - start));
      start = System.currentTimeMillis();
      StringBuilder b = new StringBuilder(70000);
      for (int i = 0; i < 10000; i++)
         b.append(" Zahl ").append(i);
      s = b.toString();
      end = System.currentTimeMillis();
      System.out.println("benötigte Zeit = " + (end - start));

   }

}
