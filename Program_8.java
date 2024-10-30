
public class Program_8 
{
     public static void main(String[] args) 
     {

        // Assignment Operations (assigns value from the RHS to the LHS)
        int num1 = 10;
        int num2 = 100;
        num1 += 10;
        num2 -= 10;

        // Arithmetic Operations (performs arithmetic operations between two operands)
        System.out.println(num1 + num2);
        System.out.println(num1 - num2);
        System.out.println(num1 * num2);
        System.out.println(num1 / num2);
        System.out.println(num1 % num2);

        // Logical Operations (performs condition-based operations , returns boolean values)
        System.out.println(num1>90 && num2<190);
        System.out.println(num1>90 || num2<190);
        System.out.println(num1!=num2);

        // Comparison Operations (performs comparison operations between two operands , returns boolean values)
        System.out.println(num1 == num2);
        System.out.println(num1 >= num2);
        System.out.println(num1 <= num2);
        System.out.println(num1 > num2);
        System.out.println(num1 < num2);

        // Bitwise Operations (performs operations bit-by-bit on the numbers)
        System.out.println(2 & 3);
        System.out.println(2 | 3);

     }
    
}