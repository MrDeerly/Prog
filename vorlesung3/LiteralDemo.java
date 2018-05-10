package vorlesung3;

public class LiteralDemo
{

   public static void main(String[] args)
   {
      // int-Literale
      int a = 123; // Variable a wird definiert und initialisiert
                   // 123 ist int-Konstante (int-Literal)
      int b = 012; // Oktal-Form b hat den Wert 1*8 + 2 = 10
      int c = 0x0A; // c hat den Wert 10
      int d = 0b0001001; // d hat den Wert 9
      System.out.println(a + " " + b + " " + c + " " + d);
      // Gleitkomma-Literale
      double e = 1.5E-2; // 1.5*10^-2 = 0,015 - Alternativ 0.15E-2D
      System.out.println(e);
      float f = 1.1F; // F am Ende ist zwingend notwendig
      System.out.println(f);
      // char-Literal
      char c1 = 'a'; // Drei Zeichen sind notwendig um ein char-Zeichen
                     // darzustellen
      char c2 = '\t'; // Tab-Zeichen
      char c3 = '\uAFFE';
      System.out.println(c1 + " " + c2 + " " + c3);
      String s = "abc";
      System.out.println(s.length());
      System.out.println(s instanceof String);

   }

}
