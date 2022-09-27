import java.util.Scanner;

public class SumOfAllOddNumbers 
{
    /*
    public static void FnForNaturalNumbers(int num)
    {
        int sum = 0;

        for(int i=1; i<=num;i++)
        {
            sum=sum+i;
        }
      
        System.out.println("Sum is "+sum);
    }
    public static void main(String[] args) 
    {
        System.out.println("Enter a number");
        Scanner sc=new Scanner(System.in);

        int num=sc.nextInt();
        FnForNaturalNumbers(num);

        System.out.println("Let's check two numbers for greater or not, enter two numbers");

        int a=sc.nextInt();
        int b=sc.nextInt();

        if(a>b)
        {
                System.out.println("a is greater");
        }
        else if(a<b)
        {
            System.out.println("a is lesser");

        }
        else
        {
            System.out.println("Equal");
        }
    }*/

    //Circle Circumtance
    /*
    public static double circleCirumtance(int rad)
    {
        return 2*rad*3.14;
    }
    public static void main(String[] args) 
    {
        
        System.out.println("Enter a radius");
        Scanner sc=new Scanner(System.in);

        int rad=sc.nextInt();
        double circumresult = circleCirumtance(rad);

        System.out.println(circumresult);
 
    }*/

    //infinite loop using do while condition
    /* 
    public static void main(String[] args) 
    {
        do
        {
            System.out.println("Infinite loop");
        }while(true);
        
    }*/

    // take input and count +, -, 0 total 
    /*
    public static void main(String[] args) 
    {
        
        System.out.println("Enter the number till you want to check +, -, 0 count");
        Scanner sc=new Scanner(System.in);

        int num=sc.nextInt();

        int plusValue=0, minusValue=0,zeroValue=0;

        char arr[] = new char[num];

        for(int i=0;i<num;i++)
        {
            System.out.println("Enter the number at position "+i);
            arr[i] = (char)sc.next().charAt(0);//charAt(i) java.lang.StringIndexOutOfBoundsException: String index out of range: 1 bcz you enter always at 0th position for a single char

            if(arr[i]==43)
            plusValue++;

            if(arr[i]==45)
            minusValue++;

            if(arr[i]==48)
            zeroValue++;
        }

        System.out.println("Plus count is "+plusValue);

        System.out.println("Minus count is "+minusValue);

        System.out.println("Zero count is "+zeroValue);

    }*/

    //Input x,n and print x the power n


    public static void main(String[] args) 
    {
        
        System.out.println("Enter value of x and n");

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int n = sc.nextInt();

        int result=1;

        for(int i=1;i<=n;i++)
        {
            result = result*x;
        }

        System.out.println("Result is "+result);
       

    }
    
}
