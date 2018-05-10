package vorlesung7;

public class SemikolonProblem
{

   public static void main(String[] args)
   {
      int a = -4;
      if (a < 0)
         ;
      System.out.println(a + " ist negativ ");
      a = 5;
      if (a < 0)
         ;
      System.out.println(a + " ist negativ ");
   }

}
