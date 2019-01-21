package example1;
import example.*;
public class pack_demo2
{
  public int exAdd(int g)
  {
    pack_demo pp=new pack_demo();
    int ans=pp.add(2,3)+g;
    return ans;
  }
  public static void main(String a[])
  {
    pack_demo2 pd=new pack_demo2();
    System.out.println(pd.exAdd(5));
  }
}
