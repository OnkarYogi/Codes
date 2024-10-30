/* Write a program to format the following letter using escape sequence characters.
   Letter = “Dear Harry, This Java Course is nice. Thanks” */

package Practice_Set_3;

public class Question_5 
{
    public static void main(String[] args) 
    {
        String Letter = "Dear Harry, This Java Course is nice. Thanks";
        Letter = "Dear Harry,\n\tThis Java Course is nice.\nThanks";
        System.out.println("The formatted letter is : \n\n" + Letter);
    }
}
