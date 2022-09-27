class InvalidAgeException extends Exception
{
    // public InvalidAgeException(String str)
    // {
    //     super(str);
    // }

    //You can also do this without Constructor if you do not want to forward the Err msg
}


public class CustomException 
{

    static void validateAge(int age) throws InvalidAgeException
    {
        if(age<18)
        {
            //throw new InvalidAgeException("Age must be >= 18");
            throw new InvalidAgeException();
        }
        else
        {
            System.out.println("Valid for vote");
        }
    }

    public static void main(String[] args) 
    {
        try
        {
            validateAge(11);
        }
        catch(InvalidAgeException e)
        {
            System.out.println("Handled the Exception");
            System.out.println(e.getMessage());
        }

        System.out.println("Normal Flow");
        
    }


    
}
