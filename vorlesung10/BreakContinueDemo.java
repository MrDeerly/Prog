package vorlesung10;

public class BreakContinueDemo
{
   public static int wuerfeln()
   {
      return (int) (Math.random() * 6) + 1;
   }

   public static void main(String[] args)
   {
      int schritte = 0;
      for (;;) // endloese Schleife
      {
         int n = wuerfeln();
         schritte++;
         System.out.println(schritte + " : " + n);
         if (n == 6)
            break;
      }

   }

}
