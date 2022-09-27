class MyThread4 extends Thread
{

    public void run()
    {
        int i=1;
        while(i<=10)
        {
            System.out.println("$$Thread1 is running "+i);
           
            i++;
        }
    }
}

class MyThread5 extends Thread
{

    public void run()
    {
        int i=1;
        while(i<=10)
        {
            System.out.println("##Thread2 is running "+i);
           
            i++;
        }
    }
}

public class MultiThreadingPriority 
{
    public static void main(String[] args) 
    {
       
        MyThread4 t1 = new MyThread4();
        MyThread5 t2 = new MyThread5();
    
        //System.out.println(t1.getState());

        t1.start();
        // try 
        // {
        //     t1.join();
        // } 
        // catch (InterruptedException e) 
        // {
        //     e.printStackTrace();
        // }

       

        //System.out.println(t1.getState());


        t2.start();
      
        try 
        {
            t1.sleep(5000);
            //Thread.sleep(5000);
        } 
        catch (InterruptedException e) 
        {
            
            e.printStackTrace();
        }
        
    }
    
}


// class MyThread extends Thread
// {

//     public void run()
//     {
//         int i=1;
//         while(i<=10)
//         {
//             System.out.println("$$Thread is running "+this.getName());
           
//             i++;
//         }
//     }
// }


// public class MultiThreadingPriority 
// {
//     public static void main(String[] args) 
//     {
//         MyThread t1 = new MyThread();
//         MyThread t2 = new MyThread();
//         MyThread t4 = new MyThread();
//         MyThread t5 = new MyThread();

//         t1.setPriority(Thread.MAX_PRIORITY);
//         t2.setPriority(10);
        
//         t4.setPriority(Thread.MIN_PRIORITY);

//         t5.setPriority(Thread.NORM_PRIORITY);

//         t1.start();
//         t2.start();
//         t4.start();
//         t5.start();



        
//     }
    
// }
