/* Write a program to calculate the percentage of a given student in the CBSE board exam. His marks from 5 subjects must be taken as input from the keyboard.
 (Marks are out of 100) */

import java.util.Scanner;

public class Exercise_1_CBSE_Board_Percentage 
{
    public static void main(String[] args)
    {
        int total_marks,sub1,sub2,sub3,sub4,sub5,sub_marks;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks each subject has : ");
        sub_marks = sc.nextInt();
        
        // taking the marks of each subject from the student
        System.out.println("Enter the marks of subject 1 : ");
        sub1 = sc.nextInt();
        System.out.println("Enter the marks of subject 2 : ");
        sub2 = sc.nextInt();
        System.out.println("Enter the marks of subject 3 : ");
        sub3 = sc.nextInt();
        System.out.println("Enter the marks of subject 4 : ");
        sub4 = sc.nextInt();
        System.out.println("Enter the marks of subject 5 : ");
        sub5 = sc.nextInt();

        total_marks = sub1 + sub2 + sub3 + sub4 + sub5;
        float perc = 0.0f;

        // using the percentage formula
        perc = (((float)total_marks)/((float)sub_marks*5.0f))*100.0f;

        System.out.println("The percentage of the student is : " + perc + " % ");
        sc.close();

    }
    
}