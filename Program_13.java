public class Program_13 
{
    public static void main(String[] args)
    {
        int a = 10;
        
        // Different ways to create strings in Java
        String str1 = new String("Onkar Yogi"); // memory is allocated from heap
        String str2 = "Onkar Yogi"; 
        String str3 = "Onkar Yogi"; // refers to the same content of "Onkar Yogi" present in str2

        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2)); // use this function because it is more accurate

        // Different ways to print contents in Java
        System.out.println("The value of a is : " + a);
        System.out.print("The value of a is : ");
        System.out.print(a);
        // uses format specifier
        System.out.printf("\nThe value of a is : %d and the string is : %s\n",a,str3); 
        System.out.format("The value of a is : %d\n",a);
    }
}