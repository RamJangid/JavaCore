import java.util.Scanner;

public class TwoDArrays 
{
    public static void main(String[] args) 
    {
        System.out.println("Enter Array elements");
        Scanner sc = new Scanner(System.in);

        int arr[][] = new int[3][4];

        for(int i=0;i<3;i++)
        {
            for(int j=0;j<4;j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Printing Array Elements");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<4;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("Enter any element to search and it's index");

        int searchVal = sc.nextInt();

        for(int i=0;i<3;i++)
        {
            for(int j=0;j<4;j++)
            {
                if(searchVal == arr[i][j])
                {
                    System.out.println("Element found at Row "+i+" Column "+j);
                    break;
                }
            }
        }
        
    }
    
}
