import java.util.Scanner;

//Insertion Sort

public class Sorting 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        int arr[] = {7,8,3,1,4};

        System.out.println("Insertion Sorting in ascending Order");


        for(int i=1; i<arr.length; i++) 
        {
            int current = arr[i];
            int j = i - 1;
                while(j >= 0 && arr[j] > current) 
                {
                    //Keep swapping
                    arr[j+1] = arr[j];
                    j--;
                }
            arr[j+1] = current;
        }
 
      

        System.out.println("Printing the Sorted Array");
        
        for(int i=0; i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        
    }
}

// Selection Sorting

// public class Sorting 
// {
//     public static void main(String[] args) 
//     {
//         Scanner sc = new Scanner(System.in);

//         int arr[] = {7,8,3,1,4};

//         System.out.println("Selection Sorting in Ascending Order");


//         for(int i=0; i<(arr.length-1); i++)
//         {
//             int smallest = i;
//             for(int j=i+1; j<arr.length;j++)
//             {
//                 if(arr[smallest] > arr[j])
//                 {
//                     smallest = j;
//                 }
//             }
//             int value = arr[smallest];
//             arr[smallest] = arr[i];
//             arr[i] = value;

//         }

//         System.out.println("Printing the Sorted Array");
        
//         for(int i=0; i<arr.length;i++)
//         {
//             System.out.print(arr[i]+" ");
//         }

        
//     }
// }


// import java.util.Scanner;

// Bubble Sorting

// public class Sorting 
// {

//     public static void printArr(int arr[])
//     {
    
//         for(int i=0; i<arr.length;i++)
//         {
//             System.out.print(arr[i]+" ");
//         }
//     }
//     public static void main(String[] args) 
//     {
//         Scanner sc = new Scanner(System.in);

//         int arr[] = {7,8,3,1,4};

//         System.out.println("Bubble Sorting in Ascending Order");

//         int value = 0;

//         for(int i=0; i<(arr.length-1); i++)
//         {
//             for(int j=i+1; j<arr.length;j++)
//             {
//                 if(arr[i]>arr[j])
//                 {
//                     value = arr[i];
//                     arr[i] = arr[j];
//                     arr[j] = value;
//                 }
//             }
         
//         }

//         System.out.println("Printing the Sorted Array");
//         printArr(arr);


//         // for(int i=0; i<arr.length;i++)
//         // {
//         //     System.out.print(arr[i]+" ");
//         // }
        
//     }
    
// }

