import java.util.Scanner;

public class Main 
{
    public static void main(String[] args)
    {
        System.out.println("Star Pattern, you can select");

        Scanner sc = new Scanner(System.in);
        String ask= sc.nextLine();

        for(int i=0;i<4;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

    }
    
}
