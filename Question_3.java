 /* Write a Java program which asks the user to enter his/her name and greets them with "Hello <name> , 
 have a good day " */
 
package Practice_Set_1;
import java.util.Scanner;
public class Question_3 
{
    public static void main(String[] args) 
    {
        String name;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name : ");
        name = sc.nextLine();

        System.out.println("Hello " + name + ", have a good day ");
        sc.close();
    }
}
