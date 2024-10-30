/* Write a program to find out the type of website from the URL:

   .com – commercial website
   .org – organization website
   .in – Indian website
 */

package Practice_Set_4;

import java.util.Scanner;

public class Question_6 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String website;
        System.out.println("Enter the name of your website : ");
        website = sc.next();

        if(website.endsWith(".org"))
        {
            System.out.println("The website is an organizationsal website ");
        }
        else if(website.endsWith(".com"))
        {
            System.out.println("The website is an commercial website ");
        }
        else if(website.endsWith(".in"))
        {
            System.out.println("The website is an Indian website ");
        }

        sc.close();
    }
}
