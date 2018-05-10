package vorlesung12;

public class Reaktionstest
{
   public static void main(String[] args) throws Exception
   {
      System.out.println("Los");
      long start = System.nanoTime();
      System.in.read();
      long end = System.nanoTime();
      System.out.println("Reaktionszeit ungefähr " + (end - start));
   }
}
