public class Outer
{
    private static int outerX;//

    public static class Inner //Inner class can be Private as it is inside a class Outer
    {
        public int innerX;

        void showX()
        {
            System.out.println(outerX+" "+innerX);//You can access privtae members of Outer class in Inner Class
        }
    }


    public void demo()
    {
        //creating Inner(member of Outer class inside Outer class) directly possible

        Inner inner = new Inner();
        inner.innerX = 7;
       // inner.outerX; Err, can access directly, why need obj of Inner to access

       System.out.println("Calling showX Fn in demo class of Outer by Inner obj");

        inner.showX();

        System.out.println("Outer var value in Outer class Fn demo is "+outerX);
    }
}


// public class Outer 
// {
    
//     class Inner  //Member type Inner class
//     {
//         private int x;

//        // public static int y; Err Inner is Member type member of Outer class so it can not have static members in it

//       // public static final int  y = 10; No Err with final you can write static
//         public Inner(int x)
//         {
//             this.x = x;
//         }

//         public int getX()
//         {
//             return x;
//         }

//         public void setX(int x)
//         {
//             this.x = x;
//         }
//     }
    
// }
