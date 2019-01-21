class local extends Thread
{
  ThreadLocal tl=new ThreadLocal();
  public int rr;
  void disp()
  {
    rr=34;
    System.out.println(tl.get());
  }
  public void run()
  {
    if(currentThread().getName().equals("Thread-0"))
      tl.set("call1");
    else
      tl.set("call2");

    disp();
    //System.out.println(this.tl.get()+" "+currentThread().getName());
  }
}
public class localtthread
{
  public static void main(String a[])
  {
    local l1=new local();
    local l2=new local();

    //l1.tl.set("call1");
    //l2.tl.set("call2");
    l1.start();
    l2.start();

    System.out.println(l1.tl.get()+" "+Thread.currentThread().getName()+" "+l1.rr);
    System.out.println(l2.tl.get()+" "+Thread.currentThread().getName()+" "+l2.rr);
  }
}
