public class Program_17 
{
    public static void main(String[] args) 
    {
        boolean a = true;
        boolean b = false;
        
        // For Logical AND operator (executes if all the conditions are true)
        if(a && b)
        {
            System.out.println("Yes!");
        }
        else
        {
            System.out.println("No!");
        }

        // For Logical OR operator (executes if one of all the condition is true)
        if(a || b)
        {
            System.out.println("Yes!");
        }
        else
        {
            System.out.println("No!");
        }

        // For Logical NOT operator (negates the result)
        System.out.println(!a);
        System.out.println(!b);
    }
}