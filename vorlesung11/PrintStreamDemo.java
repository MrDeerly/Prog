package vorlesung11;

import java.io.PrintStream;
import java.net.URL;
import java.util.Scanner;

public class PrintStreamDemo
{

   public static void main(String[] args) throws Exception
   {
      PrintStream out = new PrintStream("ausgabe.txt");
      for (int i = 0; i < 100; i++)
      {
         out.println(i * i);
      }
      out.flush();
      Scanner in = new Scanner(new URL("http://ard.de").openStream());
      while (in.hasNext())
      {
         out.println(in.nextLine());
      }
      out.close();
      in.close();
   }

}
