import java.util.Scanner;

// import java.io.FileNotFoundException;
// import java.io.PrintWriter;


public class JavaExceptionHandling 
{
    
public static void validate(int age) throws ArithmeticException
{
    if(age < 18)
    {
        throw new ArithmeticException("Age is less than 18");
    }
    else
    {
        System.out.println("You are eligible for vote");
    }
    
}

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the age");

        int age = sc.nextInt();

        try
        {
            JavaExceptionHandling.validate(age);// Direct validate also correct

        }
        catch(ArithmeticException e)
        {
            System.out.println("Handled in Main");
        }

    //    try
    //    {
    //          int num = 100/0;
    //          System.out.println("Trying to execute the statement in try block after exception code");
    //    }
    //    catch(Exception e)
    //    {
    //         // System.out.println(e); 

    //         System.out.println(e.getMessage());

    //         //System.out.println("You can print custom message in catch block");

    //         //Generating Exception in Catch block

    //         System.out.println("Generating Exception in Catch block");

    //         int data = 100/0;
    //    }

    //    System.out.println("Code after exception in Main");

    // try
    // {
    //     String s = null;
    //     System.out.println(s.length());
    // }
    // catch(NullPointerException e)
    // {
    //     System.out.println(e.getMessage());
    // }

    // try
    // {
    //     String s = "Tony";

    //     int num = Integer.parseInt(s);

    // }
    // catch(NumberFormatException e)
    // {
    //     System.out.println(e.getMessage());
    // }

    // try
    // {
    //     int arr[] = new int[5];
    //     arr[10] = 11;
    // }
    // catch(ArrayIndexOutOfBoundsException e)
    // {
    //     System.out.println(e.getMessage());
    // }

    //    System.out.println("Code After The Exception");
        
    // }

    // int num = 100/0;
    // // System.out.println("Code after exception");


    // // System.out.println("Trying to handle an Exception from Disfferent Exception Class");
    // // try
    // // {
    // //     int num = 100/0;

    // //     System.out.println("num is "+num);

    // // }
    // // catch(ArrayIndexOutOfBoundsException e)
    // // {
    // //     System.out.println(e.getMessage());
    // //     System.out.println("Custom msg in Catch");

    // // }

    // PrintWriter pw;

    // try
    // {
    //     pw = new PrintWriter("ExceptionIO.txt");// May throw an exception
    //     pw.println("PrintWriter msg");
    //     pw.write("Writing text from the VS Code");

    //     System.out.println("Normal code after an Exception line in try, that means No Exception Occurs");
    // }
    // catch(FileNotFoundException e)
    // {
    //     System.out.println(e.getMessage());
    //     System.out.println("Exception is occured!");
    // }


    // try
    // {
    //     //int arr[] = new int[5];
    //     //arr[5] = 100/0;

    //     //arr[10] = 100;

    //     String s = null;
    //     System.out.println(s.length());
    // }
    // catch(ArithmeticException e)
    // {
    //     System.out.println(e.getMessage());
    // }
    // catch(ArrayIndexOutOfBoundsException e)
    // {
    //     System.out.println(e.getMessage());
    // }
    // catch(Exception e)
    // {
    //     System.out.println("Custom msg in Exception class");
    //     System.out.println(e.getMessage());
    // }
    // catch(ArithmeticException e)
    // {
    //     System.out.println(e.getMessage());
    // }


    //Nested try and catch blocks

    // System.out.println("Outer try block starts");

    // try
    // {
    //     System.out.println("Inner try1 block starts");
    
    //     try
    //     {
    //         int num = 100/0;
    //         System.out.println(num);

    //     }
    //     catch(ArithmeticException e)
    //     {
    //         System.out.println("Arithmetic Exception handled");
    //     }

    //     System.out.println("Inner try2 block starts");

    //     try
    //     {
    //         int arr[] = new int[5];

    //         arr[10] = 11;
    //     }
    //     catch(ArrayIndexOutOfBoundsException e)
    //     {
    //         System.out.println("ArrayIndexOOBException handled");
    //     }

    //     System.out.println("Other code in Outer try block");

    // }
    // catch(Exception e)
    // {
    //     System.out.println("Handled by the Exception class");
    // }


    //try inside try inside try

    // System.out.println("Outer try starts");

    // try
    // {
    //     try
    // {
    //     System.out.println("Inner tr1 block starts");

    //    try
    //    {

    //         try
    //         {
    //             System.out.println("Inner try1 starts");
    //             int arr[] = new int[5];
    //             arr[10] = 11;
    //         }

    //         catch(ArithmeticException e)
    //         {
    //             System.out.println("catch in try in Inner try1 handled as ArithmtcExcptn");
    //         }
    //    }
    //    catch(ArithmeticException e)
    //    {
    //         System.out.println("catch in Inner try1 block ");
    //    }

    // }
    // catch(ArrayIndexOutOfBoundsException e)
    // {
    //      System.out.println("Catch by outer try block");
    // }
    
    // }


    // catch(Exception e)
    // {
    //     System.out.println("Handled by main Outer catch Exception");
    // }

    //Finally without exception

    // try
    // {
    //     int num = 100/10;
    //     System.out.println(num);
    // }
    // //System.out.println("You can not place any code between try and catch, compile time error");
    // catch(ArithmeticException e)
    // {
    //     System.out.println("Exception handled");
    // }

    // finally
    // {
    //     System.out.println("Finally is executed always");
    // }


    //Finally with exception

    // try
    // {
    //     int num = 100/0;
    //     System.out.println(num);
    // }
    // //System.out.println("You can not place any code between try and catch, compile time error");
    // catch(ArithmeticException e)
    // {
    //     System.out.println("Exception handled");
    // }

    // finally
    // {
    //     System.out.println("Finally is executed always");
    // }

    // System.out.println("Code in Main After Exception");













    }

    
}
