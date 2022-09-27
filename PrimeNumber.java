import java.util.Scanner;

public class PrimeNumber 
{
    public static void main(String[] args) 
    {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        boolean  verify = true;

        for(int i=2; i<=num/2;i++)
        {
            if(num%i==0)
            {
                System.out.println("Not Prime number "+num);
                verify=false;
                break;
            }
        }

        if(verify)
        {
            System.out.println("Prime Number "+num);
        }
        
    }    
    
}
