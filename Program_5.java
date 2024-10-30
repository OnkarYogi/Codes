import java.util.Scanner; // importing the 'Scanner' class

public class Program_5
{
    public static void main(String[] args)
    {
         int num1,num2,sum;
         // boolean b;
         Scanner sc = new Scanner(System.in); // Creating an object of the Scanner class
         System.out.println("Enter the first number : ");
         num1 = sc.nextInt(); // storing the first number from the keyboard using 'System.in'
         System.out.println("Enter the second number : ");
         num2 = sc.nextInt(); // storing the second number from the keyboard using 'System.in'
         // b = sc.hasNextInt(); // returns a boolean value if the entered entity is a integer or not (has other varieties as well)
         // System.out.println(b);
         sum = num1 + num2;
         System.out.println("The sum is : " + sum);
         sc.close();
    }
}