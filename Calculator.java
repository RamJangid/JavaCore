import java.util.Scanner;

public class Calculator 
{
    public static void main(String[] args) 
    {
        System.out.println("Enter two numbers");
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Enter your choice");
        int user_input = sc.nextInt();

        int sum=0;

        switch(user_input)
        {
            case 1:
                    sum=a+b;
                    System.out.println(sum);
                    break;

            case 2:
                    sum=a-b;
                    System.out.println(sum);
                    break;

            case 3:
                    sum=a*b;
                    System.out.println(sum);
                    break;

            case 4:
                    if(b==0)
                    {
                        System.out.println("Invalid input");
                        break;
                    }
                    else
                    {
                        sum=a/b;
                        System.out.println(sum);
                        break;
                    }
                   

            case 5:
                if(b==0)
                {
                    System.out.println("Invalid input");
                    break;
                }
                else
                {
                    sum=a%b;
                    System.out.println(sum);
                    break;
                }

            default :
                System.out.println("Please enter a valid input");
        }
        
    }
}
