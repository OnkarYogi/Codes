/* Write a Java program to fill in a letter template which looks like below:
   // letter = “Dear <|name|>, Thanks a lot”
   // Replace <|name|> with a string (some name) */

package Practice_Set_3;

public class Question_3 
{
    public static void main(String[] args) 
    {
        String letter = "Dear <|name|>, Thanks a lot";
        letter = letter.replace("<|name|>", "Onkar");
        System.out.println("The filled template is : " + letter);
    }
}
