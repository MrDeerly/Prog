package vorlesung11;

public class StringDemo2
{
   // Zählen die Häufigkeit der Buchstaben in t, die in s vorkommen
   // Bsp. count("this is a banana", "abci")
   public static int count(String s, String t)
   {
      if (s == null || t == null)
         return 0;
      // Ab hier gilt s != null && t != null
      int n = 0;
      for (int i = 0; i < s.length(); i++)
      {
         if (t.indexOf(s.charAt(i)) != -1)
            n++;
      }
      return n;
   }

   public static void main(String[] args)
   {
      String s = "abcde";
      s.toUpperCase();
      System.out.println(s); // s wird nicht verändert
      // Um Änderung zu erhalten müssen wir so schreiben
      s = s.toUpperCase(); // s zeigt auf das neue Objekt
      System.out.println(s);
      String t = " Schmidt";
      if (t.equals("Schmidt"))
         System.out.println("Gefunden");
      else
         System.out.println("Nicht gefunden");
      t = t.trim();
      if (t.equals("Schmidt"))
         System.out.println("Gefunden");

      System.out.println(t.indexOf('u')); // -1 weil u in Schmidt nicht vorkommt
      System.out.println(t.indexOf('h')); // 2 Erste Position von h in Schmidt

      int h = 1, m = 2, sec = 5;
      String txt = String.format("%02d:%02d:%02d", h, m, sec);

      System.out.println(txt);
   }

}
