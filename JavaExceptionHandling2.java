import java.io.IOException;

// import java.io.BufferedReader;
// import java.io.FileNotFoundException;
// import java.io.FileReader;

class JavaExceptionPropagation // For UnChecked Exception, it do by default propagation, for Checked no propagation
{
    void m() throws IOException
    {
        //int num = 100/0;

        throw new IOException("Device error");//Err (if we use throws then no err)Either throws or try catch is must for checked, checked means COMPILE TIME CHECKED
    }

    void n() throws IOException
    {
        m();
    }

    void p()
    {
        try
        {
            n();
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}

public class JavaExceptionHandling2
{
    public static void main(String[] args) 
    {
        JavaExceptionPropagation obj = new JavaExceptionPropagation();
        obj.p();

        System.out.println("Code in main");
    }
    
}




// class UserDefinedException extends Exception
// {
//     UserDefinedException(String str)
//     {
//         //calling parent Exception class Constructor
//         super(str);
//     }
// }

// public class JavaExceptionHandling2 
// {

//     public static void toCheckUserDefinedException() throws UserDefinedException
//     {
        
//         throw new UserDefinedException("User defined Exception");
    
//     }

//     public static void main(String[] args) 
//     {
        
//         try
//         {
//             toCheckUserDefinedException(); //Same class ka hi h, even static but no need to put class name like Class_Name.Fn();
//         }
//         catch(UserDefinedException e)
//         {
//             System.out.println(e.getMessage());
//             e.printStackTrace();// not write in sop
//             System.out.println("With Custom msg in catch block");
//         }
        
//         System.out.println("Code in main");
        
//     }

    
// }


// public class JavaExceptionHandling2 
// {

//     public static void fileCheckFn() throws FileNotFoundException
//     {
//         FileReader file = new FileReader("C:\\Users\\91820\\Music\\FullStackDeveloper\\JavaCode\\ExceptionIO.txt");
//         BufferedReader fileinput = new BufferedReader(file);
        
//         throw new FileNotFoundException("File not found, throw new obj of this class");
    
//     }

//     public static void main(String[] args) 
//     {
        
//         try
//         {
//             fileCheckFn(); //Same class ka hi h, even static but no need to put class name like Class_Name.Fn();
//         }
//         catch(FileNotFoundException e)
//         {
//             System.out.println(e.getMessage());
//             e.printStackTrace();// not write in sop
//             System.out.println("With Custom msg in catch block");
//         }
        
//         System.out.println("Code in main");
        
//     }

    
// }



// public class JavaExceptionHandling2 
// {
//     public static void validate(int age) throws ArithmeticException
// {
//     if(age < 18)
//     {
//         throw new ArithmeticException("Age is less than 18");
//     }
//     else
//     {
//         System.out.println("You are eligible for vote");
//     }
    
// }

//     public static void main(String[] args) 
//     {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter the age");

//         int age = sc.nextInt();
        
//         try
//         {
//             validate(age); //Same class ka hi h, even static but no need to put class name like Class_Name.Fn();
//         }
//         catch(ArithmeticException e)
//         {
//             System.out.println(e.getMessage());
//             System.out.println("With Custom msg in catch block");
//         }
        
//         System.out.println("Code in main");


        
//     }

    
// }
