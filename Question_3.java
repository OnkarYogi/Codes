// Use comparison operators to find out if a given number is greater than the user entered number or not 

package Practice_Set_2;
import java.util.Scanner;

public class Question_3 
{
    public static void main(String[] args) 
    {
        int num1;
        int num2 = 80;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number : ");
        num1 = sc.nextInt();

        System.out.println("The given number is greater than the user-defined number : " + (num2>num1));
        sc.close();
    }
}
