public class Program_19 
{
      public static void main(String[] args) 
      {
        int age = 18;

        switch(age) // variable used for the switch cases
        {
            case 18: // multiple cases are used for multiple conditions
               System.out.println("You are now an adult!");
               break; // used to stop the flow of execution of statements once triggered

            case 37:
               System.out.println("You are now an middle-aged person");
               break;

            case 78:
               System.out.println("You are now an old-aged person!");
               break;
 
            default: // executes if above case conditions don't get satisfied
               System.out.println("You are a human!");
        }
      } 
      
    // Enhanced switch case
    /*  switch(age) 
        {
            case 18 -> { // syntax for multiple lines of code statement
                System.out.println("You are now an adult!");
                System.out.println("You are going to get multiple documents!");
            }
            case 37 -> System.out.println("You are now an middle-aged person");
            case 78 -> System.out.println("You are now an old-aged person!");
            default -> System.out.println("You are a human!");
        }
      } No need to put 'break' statements here */
}