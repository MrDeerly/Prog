package vorlesung11;

import java.util.ArrayList;

public class StringDemo
{
   // Zählen, wie oft a in s vorkommt
   public static int count(String s, char a)
   {
      if (s == null)
         return 0;
      int n = 0; // Zum Merken der Häufigkeit
      // Durch die Zeichenkette gehen
      for (int i = 0; i < s.length(); i++)
      {
         // Das Zeichen an der i-ten Stelle abfragen
         char c = s.charAt(i);
         if (c == a)
            n++; // Häufigkeit hochzählen
      }
      return n;
   }

   // Zählen, wie oft der Wert x in a vorkommt
   public static int count(int[] a, int x)
   {
      if (a == null)
         return 0;
      int n = 0;
      for (int i = 0; i < a.length; i++)
      {
         if (a[i] == x)
            n++;
      }
      return n;
   }

   // Zählen wie oft der Wert x in ArrayList<Integer> vorkommt
   public static int count(ArrayList<Integer> a, int x)
   {
      if (a == null)
         return 0;
      int n = 0;
      for (int i = 0; i < a.size(); i++)
      {
         if (a.get(i) == x)
            n++;
      }
      return n;
   }

   public static void main(String[] args)
   {
      String s = "abc";
      String t = "abc";
      String u = new String("abc");
      if (s == t)
         System.out.println("s und t zeigen auf dasselbe Objekt");
      if (s != u)
         System.out.println("s und u sind verschiende Objekte");
      System.out.println(s.getClass());
      if (s instanceof Object)
         System.out.println("s ist auch ein Object");
      System.out.println(count("afjhsdvajhgjdv", 'a'));
      int[] a =
      { 1, 2, 1, 3, 4, 5, 1 };
      System.out.println(count(a, 1));
      String[] sArray =
      { "Merkel", "Kohl", "Schröder", "Adenauer", "Schmidt" };
      java.util.Arrays.sort(sArray);
      System.out.println(java.util.Arrays.toString(sArray));
      java.util.Arrays.sort(sArray, (x, y) -> -x.compareTo(y));
      System.out.println(java.util.Arrays.toString(sArray));
   }

}
