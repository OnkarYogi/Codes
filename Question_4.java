// Write a Java program to convert kilometres into miles

package Practice_Set_1;
import java.util.Scanner;

public class Question_4 
{
    public static void main(String[] args) 
    {
        float km,miles;
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the kilometres : ");
        km = sc.nextFloat();
        
        miles = km * 0.621371f;
        System.out.println("The distance in miles is : " + miles);
        sc.close();
    }    
}
