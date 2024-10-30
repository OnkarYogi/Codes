import java.util.Scanner;

public class Program_22 
{
    public static void main(String[] args) 
    {
         Scanner sc = new Scanner(System.in);

         int num;
         System.out.println("Enter a number : ");
         num = sc.nextInt();
         
         System.out.println("The natural numbers till 'n' are : ");
         int i = 1;
         do
         {
             System.out.println(i); // code is executed at least once irrespective of the condition
             i++;
         }while(i<=num); // checks the condition

         sc.close();
    }
}
