class MyEarnings extends Thread
{
    int total = 0;

    public void run()
    {
        synchronized(this)
        {
            for(int i=1; i<=10; i++)
            {
                total = total+100;
                System.out.println("Thread name is "+this.getName()+" Total in run() is "+total);
            }
            notify();//lock released
        }
      
    }
}


public class WaitNotifyAll 
{
    public static void main(String[] args) 
    {
        MyEarnings t1 = new MyEarnings();

        t1.start();

        //System.out.println("Total in main is "+t1.total);

        synchronized(t1)
        {
            try 
            {
                t1.wait();//main thread will release lock and in wait state untill other thread finish their task and notify
                System.out.println("Total in main is "+t1.total);
            } 
            catch (InterruptedException e) 
            {
                
                e.printStackTrace();
            }
        }
        
    }
    
}
