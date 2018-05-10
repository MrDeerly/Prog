package vorlesung11;

public class PrintfDemo
{

   public static void main(String[] args)
   {
      double d = 1.0 / 3.0;
      System.out.println(d);
      System.out.printf("%8f\n", d);
      System.out.printf("%8.2f\n", d);
      int h = 0, m = 5, s = 2;
      System.out.println(h + ":" + m + ":" + s);
      System.out.printf("%02d:%02d:%02d\n", h, m, s);
      int x = 123456;
      System.out.printf("Dezimal = %d, Hex = 0x%x Oktal = 0%o\n", x, x, x);

   }

}
