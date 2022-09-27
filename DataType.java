import java.util.Scanner;

public class DataType 
{
    public static void main(String[] args)
    {
        /*Notes Program 1
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter all data types values");

        byte byteVar = sc.nextByte();
        short shortVar = sc.nextShort();
        int intVar = sc.nextInt();
        long longVar = sc.nextLong();

        float floatVar = sc.nextFloat();
        double doubleVar = sc.nextDouble();

        char charVar = sc.next().charAt(0);
        boolean booleanVar = sc.nextBoolean();

        //comma does not work one after one variable output screen
        //System.out.println(byteVar, shortVar, intVar, longVar, floatVar, doubleVar, charVar, booleanVar);
        System.out.println(byteVar+" "+shortVar+" "+intVar+" "+longVar+" "+floatVar+" "+doubleVar+" "+charVar+" "+booleanVar);
        here Done*/

        /*Notes Program 2
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius values");

        int radius = sc.nextInt();

        double circleArea = 3.14*radius*radius;
        System.out.println(circleArea);
        here Done*/

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");

        int num = sc.nextInt();

        for(int i=1;i<=10;i++)
        {
            System.out.println(num*i);
           
        }
    }
    
}
