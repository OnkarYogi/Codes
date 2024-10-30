// Write a Java program to find whether a year entered by the user is a leap year or not.

package Practice_Set_4;

import java.util.Scanner;

public class Question_5 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int year;
        System.out.println("Enter the year : ");
        year = sc.nextInt();

        if((year %4 == 0 && year % 100!=0) || year %400 == 0)
        { 
            System.out.println("The year " + year + " is a leap year ");
        }
        else
        {
            System.out.println("The year " + year + " is not a leap year ");
        }

        sc.close();
    }
}
