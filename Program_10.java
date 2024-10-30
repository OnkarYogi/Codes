public class Program_10 
{
   public static void main(String[] args) 
   {
      int num1 = 10;
      float num2 = 89.98f;
      double num3 = 73723.82383;
      
      // Data types of expressions
      float exp1 = num1 * num2;
      System.out.println(exp1); // resultant data type is float (widening)

      double exp2 = num1 * num3 + num2;
      System.out.println(exp2); // resultant data type is double (widening)

      // Increment and Decrement operators
      int i = 9;
      System.out.println(i++);
      System.out.println(++i);
      System.out.println(i--);
      System.out.println(--i);
   }
}