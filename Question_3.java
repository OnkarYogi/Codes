/* Calculate income tax paid by an employee to the government as per the slabs mentioned below:
   
   Income Slab	   Tax
   2.5L – 5.0L     5%
   5.0L – 10.0L    20%
   Above 10.0L	   30%

   Note that there is not tax below 2.5L. Take the input amount as input from the user.
*/

package Practice_Set_4;

import java.util.Scanner;

public class Question_3 
{
    public static void main(String[] args) 
    {
        float income,tax;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your income (LPA) : ");
        income = sc.nextFloat();
        tax = 0;

        if(income<2.5f)
        {
            tax = tax + 0f;
        }
        else if(income>=2.5f && income<5.0f)
        {
            tax = tax + (0.05f * (income-2.5f));
        }
        else if(income>=5.0f && income<10.0f)
        {
            tax = tax + (0.05f * 2.5f);
            tax = tax + (0.2f * (income-5.0f));
        }
        else
        {
            tax = tax + (0.05f * 2.5f);
            tax = tax + (0.2f * 5.0f);
            tax = tax + (0.3f * (income-10.0f));
        }
        
        System.out.println("The taxes that have to be paid is : " + tax);
        sc.close();

    }
}
