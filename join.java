class joins1 extends Thread
{
  public void run()
  {
    for(int i=0;i<100;i++)
    {
      //try{this.join();}catch(Exception e){e.printStackTrace();}
      System.out.println(this.getName()+" "+i);
    }
  }
}
class joins2 extends Thread
{
  public void run()
  {
    for(int i=0;i<100;i++)
    {
      //try{this.join();}catch(Exception e){e.printStackTrace();}
      System.out.println(this.getName()+" "+i);
    }
  }
}
public class join
{
  public static void main(String a[])
  {
    joins1 j1=new joins1();
    joins1 j3=new joins1();
    joins2 j2=new joins2();
    j1.setName("t1");
    j2.setName("t2");
    j3.setName("t3");
    j1.start();
    j3.start();
    try{j3.join();}catch(Exception e){e.printStackTrace();}
    j2.start();
  }
}
