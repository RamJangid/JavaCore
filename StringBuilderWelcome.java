import java.util.Scanner;

public class StringBuilderWelcome 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);

        System.out.println(sb.charAt(0));

        sb.setCharAt(0, 'J');
        System.out.println(sb);

        sb.insert(2,'n');//insert(index, 'char')
        System.out.println(sb);

        sb.delete(2, 4);
        System.out.println(sb);

        sb.deleteCharAt(1);
        System.out.println(sb);

        StringBuilder sb2 = new StringBuilder("H");
        System.out.println(sb2);

        sb.append("e");
        sb.append("l");
        sb.append("l");
        sb.append("o");

        System.out.println(sb2);
        System.out.println("Length is "+sb2.length());

        // String original = "Hello";
        // char reverse[] = new char[original.length()];

        // for(int i=0,j=(original.length()-1); i<original.length() && j>=0; i++, j--)
        // {
        //     reverse[i] = original.charAt(j);
        // }

        // for(int i=0; i<reverse.length;i++)
        // {
        //     System.out.print(reverse[i]);
        // }
        
    }
    
}
