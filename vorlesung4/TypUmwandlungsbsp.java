package vorlesung4;

public class TypUmwandlungsbsp
{

   public static void main(String[] args)
   {
      int a = 1;
      double d = a; // implizite Umwandlung 1 -> 1.0
      System.out.println(d);
      d = 3.5;
      // a = d; Fehler weil d größer ist als a
      a = (int) d; // Casten, alles was hinter dem Komma steht
                   // wird abgeschnitten
      System.out.println(a);
      d = 1.1999893;
      // Nur zwei Stellen hinter dem Komma
      double e = (int) (d * 100) / 100.0;
      System.out.println(e);
      // Zwei Stellen hinter dem Komma mit Rundung - Am besten eine Methode
      // dafür definieren
      e = (int) ((d + 0.005) * 100) / 100.0;
      System.out.println(e);
   }

}
