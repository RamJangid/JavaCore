import java.util.*;

public class PrintAVG 
{
    static double printAvfFn(int a,int b,int c)
    {
        double avg = (a+b+c)/3;
        return avg;
    }
    public static void main(String[] args) 
    {
        System.out.println("Enter three numbers");
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        double avg = printAvfFn(a,b,c);
        System.out.println(avg);
    }
    
}
