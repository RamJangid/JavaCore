public class MinMaxArray 
{
    //Min and Max of an Array
    /* 
    public static void main(String[] args) 
    {
        int arr[] = {2,1,3,7,5};

        int value;
        for(int i=0,j=1; i<(arr.length-1) && j<arr.length; i++,j++)
        {
            if(arr[i]>arr[j])
            {
                value = arr[i];
                arr[i] = arr[j];
                arr[j] = value;

            }
        }

        System.out.println("Print Array Elements");

        
        for(int i=0;i<arr.length;i++)
        {
            System.out.println("Printing array element at "+i+" is "+arr[i]);
        }

        System.out.println("Min of Array is "+arr[0]);
        System.out.println("Maximum of Array is "+(arr[arr.length-1]));
        
    }*/

    // checking if Array is in ascending order

    public static void main(String[] args) 
    {
        int arr[] = {1,2,3,4,5};

        for(int i=0;i<arr.length;i++)
        {
            System.out.println("Printing array element at "+i+" is "+arr[i]);
        }

    
        boolean  booleanValue = false;
        for(int i=0,j=1; i<(arr.length-1) && j<arr.length; i++,j++)
        {
            if(arr[i]>arr[j])
            {
                System.out.println("Array is not in ascending order");
                break;
            }
            else
            {
                booleanValue = true;

            }
        }

        if(booleanValue == true)
        {
            System.out.println("Array is in ascending order");
        }

        System.out.println("Print Array Elements");

        
        for(int i=0;i<arr.length;i++)
        {
            System.out.println("Printing array element at "+i+" is "+arr[i]);
        }
    
    }
    
}
