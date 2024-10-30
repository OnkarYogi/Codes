public class Program_24 
{
    public static void main(String[] args) 
    {
        for (int i = 0; i < 5; i++) 
        {
            if(i == 2)
            {
                continue; // skips the current iteration and goes over to the next iteration
            }
            System.out.println("The number is : " + i);
        }

        System.out.print("\n");

        for (int j = 0; j < 5; j++) 
        {
            if(j == 3)
            {
                break; // exits out of the loop
            }
            System.out.println("The number is : " + j);
        }
    }
}