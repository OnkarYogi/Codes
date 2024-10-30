// Write a Java program to encrypt a grade by adding 8 to it . Decrypt it to show the correct grade .

package Practice_Set_2;

public class Question_2 
{
    public static void main(String[] args) 
    {
        char grade = 'A';
        
        grade = (char)(grade + 8);
        System.out.println("The encrypted grade is : " + grade);
        
        grade = (char)(grade - 8);
        System.out.println("The decrypted grade is : " + grade);

    }
}
