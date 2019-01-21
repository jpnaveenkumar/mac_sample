import example.*;
import example1.*;
import example3.*;
public  class cmd extends pack_demo
{
  public void addd()
  {
    System.out.println(add(2,8));
  }
  public static void main(String args[])
  {
    // pack_demo2 pp=new pack_demo2();
    // pack_demo3 p3=new pack_demo3();
    // System.out.println(p3.gett());
    // System.out.println(pp.exAdd(4));
    cmd c=new cmd();
    pack_demo pd=new pack_demo();
    c.addd();
    //System.out.println(args[0]+" "+args[1]);
  }
}
