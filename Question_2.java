/*  Write a program to find out whether a student is pass or fail; if it requires a total of 40% and at 
    least 33% in each subject to pass. Assume 3 subjects and take marks as input from the user.  */

package Practice_Set_4;

import java.util.Scanner;

public class Question_2 {
    public static void main(String[] args) 
    {
        int marks1,marks2,marks3;
        float perc;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the marks of subject 1 : ");
        marks1 = sc.nextInt();

        System.out.println("Enter the marks of subject 2 : ");
        marks2 = sc.nextInt();

        System.out.println("Enter the marks of subject 3 : ");
        marks3 = sc.nextInt();

        perc = (marks1+marks2+marks3)/3;

        if(perc>=40 && marks1>33 && marks2>33 && marks3>33)
        {
            System.out.println("You have been passed!");
        }
        else
        {
            System.out.println("You failed!");
        }
        
        sc.close();
    }
}
