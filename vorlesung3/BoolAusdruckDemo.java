package vorlesung3;

public class BoolAusdruckDemo
{
   public static boolean auswerten(boolean a, boolean b)
   {
      return a || !b;
   }

   public static void main(String[] args)
   {
      System.out.println("====== ERSTE PRIMITIVE MÖGLICHKEIT =====");
      System.out.println(false + "\t" + false + "\t" + auswerten(false, false));
      System.out.println(false + "\t" + true + "\t" + auswerten(false, true));
      System.out.println(true + "\t" + false + "\t" + auswerten(true, false));
      System.out.println(true + "\t" + true + "\t" + auswerten(true, true));
      System.out.println("====== ZWEITE MÖGLICHKEIT =====");
      for (int i = 0; i < 2; i++)
      {
         for (int j = 0; j < 2; j++)
         {
            boolean a = i == 1;
            boolean b = j == 1;
            System.out.println(a + "\t" + b + "\t" + auswerten(a, b));
         }
      }
      System.out.println("====== DRITTE MÖGLICHKEIT =====");
      boolean[] Werte =
      { false, true };
      for (boolean a : Werte)
      {
         for (boolean b : Werte)
         {
            System.out.println(a + "\t" + b + "\t" + auswerten(a, b));
         }
      }
      {

      }
   }
}
