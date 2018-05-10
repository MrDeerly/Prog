package vorlesung10;

public class CountDown
{

   public static void main(String[] args) throws Exception
   {
      // Runterzählen 10, 9, ... bis 0
      // Durchlaufen der Menge {0, 1, .., 10} rückwärts
      // Man benutzt dafür häufig eine for-Schleife
      // i ist die Laufvariable - i existiert nur während
      // der Ausführung der for-Schleife
      // Abbruchsbedingung: i >= 0
      // i wird nach jedem Durchlauf erniedrigt
      for (int i = 10; i >= 0; i = i - 1)
      {
         System.out.println(i);
         if (i != 0)
            Thread.sleep(1000);
      }
      System.out.println("Looooooos");

   }

}
