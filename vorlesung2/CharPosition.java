package vorlesung2;

public class CharPosition
{

   public static void main(String[] args)
   {
      char a = 'a';
      System.out.println(a);
      System.out.println((int) a);
      // Fehler: char b = "b";
      System.out.println('\uAFFE');
   }

}
