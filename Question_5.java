// Write a Java program to detect whether a number entered by the user is an integer or not

package Practice_Set_1;
import java.util.Scanner;

public class Question_5 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number : ");
        System.out.println("The number entered is an integer : " + sc.hasNextInt());
        sc.close();
    }
}
