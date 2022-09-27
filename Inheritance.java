
abstract class Animal
{
    Animal()
    {
        System.out.println("Constrctr in Animal class which is abstract");
    }
   abstract void walk();

   void normFn()
   {
        System.out.println("Normal Fn in Animal class");

   }

   static void staticFn()
   {
        System.out.println("Normal static Fn in Animal class");
   }

}

class Horse extends Animal
{
    Horse()
    {
        System.out.println("Constrctr in Horse class");
    }
    void walk()
    {
        System.out.println("Walk with Horse");
    }

}

class Rabbit extends Animal
{
    void walk()
    {
        System.out.println("Walk with Rabbit");
    }
}

public class Inheritance
{
    public static void main(String[] args) 
    {
        Horse horse = new Horse();
        horse.walk();

        horse.normFn();

       // horse.staticFn(); No Err but should be called by class name, not by object

        Animal.staticFn();

        // Animal animal = new Animal();
        // animal.walk();

        Rabbit rabit = new Rabbit();
        rabit.walk();

        
    }

}


// class Shape
// {
//     String color;

//     void area()
//     {
//         System.out.println("Area in Shape class");
//     }
// }

// class Triangle extends Shape
// {
//     void area(int l, int h)
//     {
//         System.out.println("Area in Triangle class");
    
//         System.out.println((l*h)/2);
//     }

// }

// class EquilateralTriangle extends Triangle
// {
//     void area(int l, int h, int p)
//     {
//         System.out.println("Area in EquilateralTriangle class");
//         System.out.println((l*h)/2);
//     }
// }

// public class Inheritance 
// {
//     public static void main(String[] args) 
//     {
//         // Triangle t1 = new Triangle();
//         // t1.color = "Blue";
//         // System.out.println(t1.color);

//         // t1.area(4, 7);

//         EquilateralTriangle et1 = new EquilateralTriangle();
//         et1.area();
//         et1.area(7, 4);
//         et1.area(7, 4, 4);
        
//     }

// }
