public class Program_14 
{
    public static void main(String[] args) 
    {
        String str = "Onkaarr";
        String str_non_trimmed = "   Onkar ";

        // String methods 
        System.out.println(str.length()); // returns the length of the string
        System.out.println(str.toLowerCase()); // returns the lower case version of the string
        System.out.println(str.toUpperCase()); // returns the upper case version of the string
        System.out.println(str.substring(3)); // returns the substring starting from the specifed index
        // returns the substring including and the excluding the beginning and ending index respectively
        System.out.println(str.substring(1, 4)); 
        System.out.println(str_non_trimmed.trim()); // returns the trimmed version of string (removes trailing and starting blank spaces)
        System.out.println(str.replace("On", "Lo")); // replaces each occurences of the target substring with the specifed string
        System.out.println(str.charAt(3)); // returns the character present at particular index in the string
        System.out.println(str.indexOf('a')); // returns the index of the first occurrence of the specified character in the given string
        // returns the index of the first occurrence of the specified character in the given string after certain index of the string
        System.out.println(str.indexOf('r',3)); 
        System.out.println(str.lastIndexOf('a')); // returns the last index of the specified character from the given string
        // returns the last index of the specified character from the given string before a particluar index
        System.out.println(str.lastIndexOf('k', 4)); 
        System.out.println(str.equals("Onkaarr")); // checks if the strings are equal
        System.out.println(str.equalsIgnoreCase("ONkaarr")); // checks if the strings are equal irrespective of the case
        System.out.println(str.startsWith("O")); // checks if the string starts with a particular string
        System.out.println(str.endsWith("ar")); // checks if the string starts with a particular string

        // Note : Here , some functions can take character input instead of string input as well

        // Escape sequences
        System.out.println("Hi, I am Onkar Yogi! \" "); // adds ' " ' to the statement
        System.out.println("Hi , I am Onkar Yogi! \\");  // // adds ' \ ' to the statement
        // The above technique can be used for adding other characters as well which cannot be added normally
    }
}