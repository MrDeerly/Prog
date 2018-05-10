package vorlesung9;

import util.ReadUtil;

enum WochenTag
{
   Mo, Di, Mi, Do, Fr, Sa, So
}

enum Saison
{
   Fruehling, Sommer, Herbst, Winter
}

public class SwitchCaseDemo
{

   public static void main(String[] args)
   {
      int a = ReadUtil.nextPosInt("Ein positiver Wert ");
      switch (a)
      {
      case 1:
         System.out.println("Top");
         break;
      case 2:
         System.out.println("Gut");
         break;
      case 1000:
         System.out.println("so schlecht");
         break;
      default: // a != 1 && a 1= 2 & a != 1000
         System.out.println("komisch!");

      }

      Saison s = Saison.Sommer;

      switch (s)
      {
      case Fruehling:
         System.out.println("Es kommen die Blüten");
         break;
      case Sommer:
         System.out.println("Pack die Badehosen aus");
         break;
      case Herbst:
         System.out.println("Es wird langsam ungemütlich");
         break;
      default:
         System.out.println("Auswandern!!");
      }

      int note = 5;
      String p = "eins";
      switch (p)
      {
      case "eins":
         note = 1;
         break;
      case "zwei":
         note = 2;
         break;
      default:
         note = 5;
      }

   }

}
