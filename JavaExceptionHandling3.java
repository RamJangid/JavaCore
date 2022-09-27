public class JavaExceptionHandling3
{
    static void Fn() throws ArithmeticException
    {
        System.out.println("Inside Fn() Method");
        throw new ArithmeticException("This is devide by zero");
    }

    public static void main(String[] args) 
    {
        try
        {
            Fn();

        }
        catch(ArithmeticException e)
        {
            System.out.println(e.getMessage());
        }
        
    }


}
  


// class ThrowAndThrows
// {
//     void Fn(int num) throws ArithmeticException
//     {
//         if(num<1)
//         {
//             //throw new ArithmeticException("Number should be greater then 1");//unchecked Exception

//             num = 100/0;
//         }
//         else
//         {
//             System.out.println("Square is "+num*num);
//         }

//     }
// }

// public class JavaExceptionHandling3
// {
//     public static void main(String[] args) 
//     {
//         ThrowAndThrows obj = new ThrowAndThrows();

//         //obj.Fn(-1); Exception not handled so Program will be termintaed
//         //Handle in try catch

//         try
//         {
//             obj.Fn(-1);
//         }
//         catch(ArithmeticException e)
//         {
//             System.out.println(e.getMessage());
//         }



//         System.out.println("Code in main");

        
//     }
// }



// import java.io.IOException;

// //3. throws declared by method() new IoException created so if either need to catch by main or throws 
// class M 
// {
//     void method() throws IOException
//     {
//         throw new IOException("Device Err");

//     }
// }

// public class JavaExceptionHandling3 
// {
//     public static void main(String[] args) throws IOException
//     {
//         M m = new M();
//         m.method();
//         System.out.println("Code in main");
        
//     }

// }


// //2. throws declared by method() but no new IoException created so if we do not catch by main, only main must inform by throws 
// class M 
// {
//     void method() throws IOException
//     {
//         System.out.println("No new IoException created");
//     }
// }

// public class JavaExceptionHandling3 
// {
//     public static void main(String[] args) throws IOException
//     {
//         M m = new M();
//         m.method();
//         System.out.println("Code in main");
        
//     }

// }

// //1. throws in method() and caught by main
// class M 
// {
//     void method() throws IOException
//     {
//         throw new IOException("Device Err");
//     }
// }

// public class JavaExceptionHandling3 
// {
//     public static void main(String[] args) 
//     {
//         M m = new M();

//         try
//         {
//             m.method();
//         }
//         catch(IOException e)
//         {
//             System.out.println("Exception handled by main");
//             System.out.println(e.getMessage());
//         }

//         System.out.println("Code in main");
        
//     }

    
// }
