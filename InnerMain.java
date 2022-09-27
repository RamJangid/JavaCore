public class InnerMain 
{
    public static void main(String[] args) 
    {
        // Outer outer = new Outer();
        // outer.demo();

        //Outer.Inner inner = outer.new Inner(); static Inne class, no need to use obj of Outer class

        Outer.Inner inner = new Outer.Inner();

        inner.innerX = 11;// Inner is private then can not create the object 
        inner.showX();
        
    }
    
}
