import java.util.Scanner;

public class FirstNSum 
{
    public static void main(String[] args) 
    {
        /*System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int sum=0;

        int i=1;

        while(i<=num)
        {
            sum = sum+i;
            i++;
        }

        System.out.println(sum);*/

        /*System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        
        int i=1;

        while(i<=10)
        {
            System.out.println(num*i);
            i++;
        }*/

        //Print all even numbers till a given number

       /*System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int sum=0;

        int i=2;

        while(i<num)
        {
            if(i%2==0)
            {
                System.out.println(i);
                sum=sum+i;
            }
            i++;
        }

        System.out.println("Sum of even numbers till "+num+"is "+sum);*/

        //Infinite Loop
       /*for(;;)
        {
            System.out.println("Apna College");
        }*/

        System.out.println("Enter any number, 0 or 1");
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        if(num==1)
        {
            System.out.println("Enter the marks");
            int marks = sc.nextInt();

            if(marks>=90)
            {
                System.out.println("This is good");
            }
            else if(marks>=60 && marks<=89)
            {
                System.out.println("This is also good");
            }
            else
            {
                System.out.println("This is good as well");
            }
        }
        
    }
    
}
