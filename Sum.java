import java.util.Scanner;

public class Sum 
{
    public static void main(String[] args) 
    {
        System.out.println("Enter the name");
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        System.out.println(name);

        System.out.println("Enter the value of a and b");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = a+b;
        System.out.println("Sum is "+sum);
    }
    
}
