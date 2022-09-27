import java.util.Scanner;

public class Factorial 
{
    public static void printFactorial(int n)
    {
        if(n<0)
        {
            System.out.println("Invalid number, please enter a valid number");
            return;
        }
        int fact=1;

        for(int i=n;i>=1;i--)
        {
            fact = fact*i;
        }
        System.out.println("Factorial is "+fact);
    }

    public static void main(String[] args) 
    {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        printFactorial(num);
    }   





    /* 
    public static void main(String[] args) 
    {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int fact=1;

        int i=0;
        while(i<num)
        {
            fact = fact*(num-i);
            i++;
        }
        System.out.println(fact);
        
    }*/
    
}
