// Write a program to sum three numbers in Java

package Practice_Set_1;
import java.util.Scanner;

public class Question_1 
{
    public static void main(String[] args) 
    {
        int num1,num2,num3,sum;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number : ");
        num1 = sc.nextInt();
        
        System.out.println("Enter the second number : ");
        num2 = sc.nextInt();

        System.out.println("Enter the third number : ");
        num3 = sc.nextInt();
        
        sum = num1 + num2 + num3;
        System.out.println("The sum of the numbers is : " + sum);

        sc.close();
    }
}
