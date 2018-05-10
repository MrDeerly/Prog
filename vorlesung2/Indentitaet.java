package vorlesung2;

import java.util.Scanner;

public class Indentitaet
{
   private static final String IDIOT_PASSWORD = "123456";
   static Scanner sIn = new Scanner(System.in);

   public static void main(String[] args)
   {
      System.out.println("Ihr password");
      String password = sIn.next();
      // if (passwort == "123456") Schlecht

      if (IDIOT_PASSWORD.equals(password))
      {
         System.out.println("Idiot");
      } else
      {
         System.out.println("Kann gut sein");
      }

   }

}
