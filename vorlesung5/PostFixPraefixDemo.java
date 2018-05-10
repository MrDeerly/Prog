package vorlesung5;

public class PostFixPraefixDemo
{

   public static void main(String[] args)
   {
      int a = 5;
      // Präfix - a wird vorher erhöht und dann verwendet
      System.out.println(++a); // Ausgabe 6
      a = 100;
      // Postfix - a wird verwendet, danach wird die Variable
      // erniedrigt
      System.out.println(a--);
      // Das sollte man vermeiden!!
      a = a-- + ++a;
      System.out.println(a);
      a = 5;
      while (a-- > 0)
         System.out.println(a);

      a = 5;
      while (--a > 0)
         System.out.println(a);

      byte b = 127;
      System.out.println(++b);
   }

}
