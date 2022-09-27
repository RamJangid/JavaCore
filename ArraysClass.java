import java.util.Arrays;

public class ArraysClass 
{
    public static void main(String[] args) 
    {
        int arr[] = {1,2,3,4,5,6,7,8,9,10};

        int index = Arrays.binarySearch(arr, 5);
        System.out.println(index);

        int arr1[] = {11,7,4,10,21};
        Arrays.sort(arr1);

        for(int element : arr1)
        {
            System.out.print(element+" ");
        }

        System.out.println();

        Arrays.fill(arr1, 11);

        for(int element : arr1)
        {
            System.out.print(element+" ");
        }
        
    }
    
}
