// Write a program to calculate CGPA using marks of three subjects (out of 100)

package Practice_Set_1;
import java.util.Scanner;
public class Question_2 
{
    public static void main(String[] args) 
    {
        int sub1,sub2,sub3;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter marks of first subject : ");
        sub1 = sc.nextInt();
        
        System.out.println("Enter marks of the second subject : ");
        sub2 = sc.nextInt();

        System.out.println("Enter the marks of the third subject : ");
        sub3 = sc.nextInt();

        float CGPA = (((sub1 + sub2 + sub3)/300.0f)*100.0f)/10.0f;
        
        System.out.println("The CGPA of the student is : " + CGPA);

        sc.close();
    }
}
