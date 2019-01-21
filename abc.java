import java.util.*;

public class abc extends Thread
{

  public void print()
  {
    for(int i=0;i<5;i++)
    {
      System.out.println(i);
      try{
      Thread.sleep(1000);
    }
    catch(Exception e)
    {
      e.printStackTrace();
    }
    }
  }
  public synchronized void println()
  {
    for(int i=0;i<5;i++)
    {
      System.out.println(i);
      try{
      //Thread.sleep(1000);
    }
    catch(Exception e)
    {
      e.printStackTrace();
    }
    }
  }
  public void run()
  {
    System.out.println("Thread is running "+this.getName());
    println();
  }
  public static void main(String ar[])
  {
    abc t1=new abc();
    abc t2=new abc();
    //Thread td=new Thread(t);
    //Thread tdd=new Thread(t);
    t1.start();
    t2.start();
  }
}
