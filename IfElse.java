import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

public class IfElse 
{
    public static void main(String[] args) 
    {
        /*Code Program if else
        System.out.println("Enter age");
        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();

        if(age>=18)
        System.out.println("Adult");
        else
        System.out.println("Not Adult");
        here Done*/

        //Program for even odd number
        /* 
        System.out.println("Enter any number");
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        //if((num/2)==0) *Not a correct Algo
        if(num%2==0)
        System.out.println("Even");
        else
        System.out.println("odd");
        here Done*/

        //Code Program for a,b comparison
        /* 
        System.out.println("Enter any two numbers");
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a==b)
        System.out.println("Both are equal");
        else if(a>b)
        System.out.println("b is greater");
        else
        System.out.println("b is greater");

        //second way to do it without else if


        if(a>b)
        {
            System.out.println("a is greater");
        }
        else
        {
            if(a==b)
            System.out.println("Equal");
            else
            System.out.println("a is lesser");
        }
       here done*/

       System.out.println("Enter any choice");
       Scanner sc = new Scanner(System.in);

       int num = sc.nextInt();

       switch(num)
       {
            case 1:
                System.out.println("Hello");
                break;

            case 2:
                System.out.println("Namaste");
                break;
            
            case 3:
                System.out.println("Bonjour");
                break;

            default:
            System.out.println("Please Enter the right number");
           //break never use break after default, 

       }



    }
    
}
