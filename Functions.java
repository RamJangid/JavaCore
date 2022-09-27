import java.util.Scanner;

public class Functions 
{
        public static int multiplyFunction(int a, int b)
        {
            return a*b;
        }

        public static void main(String[] args) 
        {
            System.out.println("Enter two numbers");
            Scanner sc = new Scanner(System.in);

            int a = sc.nextInt();
            int b = sc.nextInt();

            System.out.println("multiply is "+ multiplyFunction(a, b));
            
        }

}
