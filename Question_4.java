// Write a Java program to detect double and triple spaces in a string

package Practice_Set_3;

public class Question_4 
{
    public static void main(String[] args) 
    {
        String str = "Hi, I am  Onkar   Yogi";
        System.out.println("The double space is located at index : " + str.indexOf("  "));
        System.out.println("The triple space is located at index : " + str.indexOf("   "));
    }
}
