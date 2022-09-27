class Table
{
    public void printTable(int num)
    {
        System.out.println("Before Synchronized");

        synchronized(this)
        {
            for(int i=1; i<=10; i++)
            {
                System.out.println(num*i);
            }
        }

        System.out.println("After Synchronized");
    }
}


class MyThread7 extends Thread
{
    Table resource; //You have to define Table type ref here because you can  use in run() method
    public MyThread7(Table resource)
    {
        //resource.printTable(4); You should not print table here because run() method will show you random ourput
        this.resource = resource;

    }
    public void run()
    {
        //System.out.println("Thread7");
        resource.printTable(4);

    }
}

class MyThread10 extends Thread
{
    Table resource; //You have to define Table type ref here because you can  use in run() method
    public MyThread10(Table resource)
    {
        //resource.printTable(7); You should not print table here because run() method will show you random ourput
        this.resource = resource;

    }
    public void run()
    {
        //System.out.println("Thread10");
        resource.printTable(7);
        
    }
}

public class SynchronizedDone 
{
    public static void main(String[] args) 
    {

        Table resource = new Table();

        MyThread7 t1 = new MyThread7(resource);
        MyThread10 t2 = new MyThread10(resource);

        t1.start();
        t2.start();

        
    }
    
}


// class Table
// {
//     public synchronized void printTable(int num)
//     {
//         for(int i=1; i<=10; i++)
//         {
//             System.out.println(num*i);
//         }
//     }
// }


// class MyThread7 extends Thread
// {
//     Table resource; //You have to define Table type ref here because you can  use in run() method
//     public MyThread7(Table resource)
//     {
//         //resource.printTable(4); You should not print table here because run() method will show you random ourput
//         this.resource = resource;

//     }
//     public void run()
//     {
//         //System.out.println("Thread7");
//         resource.printTable(4);

//     }
// }

// class MyThread10 extends Thread
// {
//     Table resource; //You have to define Table type ref here because you can  use in run() method
//     public MyThread10(Table resource)
//     {
//         //resource.printTable(7); You should not print table here because run() method will show you random ourput
//         this.resource = resource;

//     }
//     public void run()
//     {
//         //System.out.println("Thread10");
//         resource.printTable(7);
        
//     }
// }

// public class SynchronizedDone 
// {
//     public static void main(String[] args) 
//     {

//         Table resource = new Table();

//         MyThread7 t1 = new MyThread7(resource);
//         MyThread10 t2 = new MyThread10(resource);

//         t1.start();
//         t2.start();

        
//     }
    
// }
