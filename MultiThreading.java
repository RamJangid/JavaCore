// class MyThread1 extends Thread
// {
//     public void run()
//     {
//         int i=1;
//         while(i<=10)
//         {
//             System.out.println("Thread 1 is running");
           
//             i++;
//         }
//     }
// }

// class MyThread2 extends Thread
// {
//     public void run()
//     {
//         int i=1;
//         while(i<=10)
//         {
//             System.out.println("Thread 2 is running");
       
//             i++;
//         }
//     }
// }

// class MyThread1 implements Runnable
// {
//     public void run()
//     {
//         int i=1;
//         while(i<=10)
//         {
//             System.out.println("$$Thread 1 is running "+i);
           
//             i++;
//         }
//     }
// }

// class MyThread2 implements Runnable
// {
//     public void run()
//     {
//         int i=1;
//         while(i<=10)
//         {
//             System.out.println("##Thread 2 is running "+i);
           
//             i++;
//         }
//     }
// }


// public class MultiThreading 
// {
//     public static void main(String[] args) 
//     {
//         System.out.println("Main Thread starting here");
//         // MyThread1 t1 = new MyThread1();
//         // MyThread2 t2 = new MyThread2();

//         // t1.start();
//         // t2.start();

//         MyThread1 t1 = new MyThread1();
//         MyThread2 t2 = new MyThread2();
//         //t1.start(); error because MyThread1 did not extends Thread, it implemets Runnable which only has run() Fn, do not have start() Fn

//         Thread thread1 = new Thread(t1);
//         Thread thread2 = new Thread(t2);

//         thread1.start();
//         thread2.start();

//         System.out.println("Main Thread ending here");
        
//     }
    
// }


class MyThread1 extends Thread
{
    public MyThread1(String name)
    {
        super(name);
    }
    public void run()
    {
        int i=1;
        while(i<=10)
        {
            System.out.println("##Thread 1 is running");
           
            i++;
        }
    }
}



class MyThread2 extends Thread
{
    public MyThread2(String name)
    {
        super(name);
    }
    public void run()
    {
        int i=1;
        while(i<=10)
        {
            System.out.println("$$Thread 2 is running");
           
            i++;
        }
    }
}


class MyThread3 extends Thread implements Runnable
{

    MyThread3(Runnable r, String name)
    {
        super(r,name);
    }
    public void run()
    {
        int i=1;
        while(i<=10)
        {
            System.out.println("@@Thread 3 is running");
           
            i++;
        }
    }
}

public class MultiThreading 
{
    public static void main(String[] args) 
    {
        System.out.println("Main Thread starting here");
        
        MyThread1 thread1 = new MyThread1("Name Thread1 ");
        thread1.start();

        System.out.println("Thread1 name is "+thread1.getName());
        System.out.println("Thread1 ID is "+thread1.getId());


        MyThread2 thread2 = new MyThread2("Name Thread2 ");
        thread2.start();

        System.out.println("Thread2 name is "+thread2.getName());
        System.out.println("Thread2 ID is "+thread2.getId());
        

        Runnable ref=null;
        MyThread3 thread3 = new MyThread3(ref,"Thread3");

        thread3.start();
        
        System.out.println("Thread3 name is "+thread3.getName()); //Thread3 name is "Thread-0"
        System.out.println("Thread3 ID is "+thread3.getId());
        
        System.out.println("Main Thread ending here");

        
    }
    
}
