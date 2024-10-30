public class Program_9 
{
    public static void main(String[] args) 
    {
        int exp1 = 7*5+9-2;
        System.out.println(exp1);
        // Evaluation :-
        /*
          = 35+9-2
          = 44-2
          = 42
         */

        int exp2 = 8/4-9*5+80;
        System.out.println(exp2);
        // Evaluation :-
        /*
          = 2-9*5+80
          = 2-45+80
          = -43+80
          = 37
         */

        /* Precedence : It is the priority that is given to the operators where the higher precedence indicates
        early execution */
        /* Associativity : It is the order/direction in which the expression is executed if the compiler occurs operators
        of same precedence . It may be R->L OR L->R */
    }
}
