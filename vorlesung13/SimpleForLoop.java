package vorlesung13;

public class SimpleForLoop
{

  public static void main(String[] args)
  {
    // 100 mal Hallo ausgeben
    // Initialisierung: i Zählvariable, wird am Anfang definiert
    // Bedingung i < 100 (solange i < 100 wird die Anweisung durchgef�hrt)
    // Update: i++ (i wird nach jedem Durchlauf erhöht)
    for (int i = 0; i < 100; i++)
    {
      // Anweisung immer gleich, unabhängig von i
      System.out.println("Hallo");
    }
    // 0 bis 9 ausgeben
    for (int i = 0; i < 10; i++)
    {
      // Anweisung hängt von i ab. Beim jeden Durchlauf erhalten wir eine
      // andere Ausgabe
      System.out.println(i);
    }

    // Hallo 100, Hallo 98 , .... , Hallo 2 werden ausgegeben
    for (int i = 100; i >= 2; i = i - 2)
    {
      System.out.println("Hallo " + i);
    }

  }

}
