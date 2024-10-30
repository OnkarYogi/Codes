public class Program_25 
{
    public static void main(String[] args) 
    {
        // Methods to declare arrays in Java
        // 1. Declaration and then memory allocation and then initialization
        int[] arr1;
        arr1 = new int[5];
        arr1[0] = 1;
        arr1[1] = 4;
        arr1[2] = 89;
        arr1[3] = 1132;
        arr1[4] = 44;
        System.out.println(arr1[0]);

        // 2. Declaration and memory allocation and then initialization
        int arr2[] = new int[5];
        arr2[0] = 11;
        arr2[1] = 45;
        arr2[3] = 11321;
        arr2[2] = 892;
        arr2[4] = 443;
        System.out.println(arr2[0]);

        // 3. Declaration and initialization
        int arr3[] = {1,2,3,4,5};
        System.out.println(arr3[0]);
        
        // Program to print reverse elements of an array
        // Iterating through an array using the 'length' attribute/property of arrays as an initializer
        System.out.println("The array elements in reverse order is : ");
        for (int i = arr1.length - 1; i >= 0; i--) // 'length' attribute returns the length of an array
        {
            System.out.println("The element is : " + arr1[i]);
        }

        // Note : Arrays can be declared 'data_type[] array_name;' as well
    }
}