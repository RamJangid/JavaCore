public class FinalFinallyFinalize 
{

    public static void main(String[] args) 
    {
        // final int age = 21;
        // age = 25;compile time Err
        // System.out.println(age);

        FinalFinallyFinalize obj = new FinalFinallyFinalize();

        System.out.println("HashCode of the Obj is "+obj.hashCode());
        obj = null;

        System.out.println("Calling Garbage Collector");
        System.gc();
        System.out.println("End of Garbage Collection");
    }

    protected void finalize()
    {
        System.out.println("Called the finalize method");

    }
    
}
