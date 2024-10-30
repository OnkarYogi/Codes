public class Program_23 
{
    public static void main(String[] args) 
    {
        for (int i = 0; i <= 5; i++) // (initializer;boolean condition;increment/decrement operation)
        {
            System.out.println(i);
        }

        // Program to print first n odd numbers 
        /* Logic :
           2n+1 (Odd numbers) = 1,3,5,7
           2n (Even numbers) = 0,2,4,6
           where 'n' is the position of odd/even number 
        */
        System.out.println("\nThe first n odd numbers are : ");
        int n = 5;
        for (int i = 0; i < n; i++) 
        {
            System.out.println(2*i+1);
        }
        
        // Program to print first n natural numbers in reverse order
        System.out.println("\nThe first n natural numbers in reverse order are : ");
        for (int natural = n; natural >= 1; natural--) 
        {
            System.out.println(natural);
        }
    }
}
