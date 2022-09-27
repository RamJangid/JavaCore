import java.util.Scanner;

public class ArraysApna 
{
    public static void main(String[] args) 
    {
        System.out.println("Enter Array Elements");
        Scanner sc = new Scanner(System.in);

       /*  int arr[] = new int[3]; // First Way to declare and define the Array

       /* arr[0] = 77;
        arr[1] = 83;
        arr[2] = 95;

        System.out.println(arr);

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

        for(int i=0;i<arr.length;i++)
        {
            System.out.println("Enter array element at "+i);
            arr[i] = sc.nextInt();
        }*/

        //YA TO SIZE YA SPACE DENA DECLARE KRTE SAMAY
        /*
        int arr[] = {77,83,95}; //Second way to declare and define the array

        for(int i=0;i<arr.length;i++)
        {
            System.out.println("Printing array element at "+i+" is "+arr[i]);
        }

        int numbers[] = new int[5];

        for(int i=0;i<numbers.length;i++)
        {
            System.out.println("Printing array element at "+i+" is "+numbers[i]);
        }*/


        int arr[] = new int[5];

        for(int i=0;i<arr.length;i++)
        {
            System.out.println("Enter array element at "+i);
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the Array element yo want to search for its index");

        int x = sc.nextInt();

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==x)
            {
                System.out.println("Found the element at index "+i);
            }
        }

        
    }

    
}
