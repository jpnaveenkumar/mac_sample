import java.util.*;

class A extends Thread
{
  public static int sum=0;
  public void run()
  {
    synchronized(this)
    {
      System.out.println("calculating sum....");
      try{
        this.wait();
      }
      catch(Exception e)
      {
        e.printStackTrace();
      }
      //wait();
      System.out.println("The sum is: "+sum);
    }
  }
}
class B extends Thread
{
  public int i=10;
  public A aa;
  B(A aaa)
  {
    this.aa=aaa;
  }
  public void run()
  {
    for(int i=0;i<10;i++)
    {
      A.sum=A.sum+i;
      try{
        Thread.sleep(500);
      }
      catch(Exception e)
      {
        e.printStackTrace();
      }
    }
      synchronized(this.aa)
      {
        this.aa.notify();
      }
  }
}
public class C
{
  public static void main(String a[])
  {
    A aobj=new A();
    B b =new B(aobj);
    aobj.start();
    b.start();
  }
}
