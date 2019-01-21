public class thread extends Thread
{
  public void run()
  {
    System.out.println(Thread.currentThread().getName());    
    thread t1=new thread();
    thread t2=new thread();
    t1.start();
    t2.start();
  }
  public static void main(String a[])
  {
    thread t=new thread();
    t.start();
  }
}
