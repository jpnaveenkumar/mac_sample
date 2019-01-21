import java.util.*;
class A
{
  public int a;
  private String b;
  protected char c;

  String getB()
  {
    return b;
  }
  void setB(String b)
  {
    this.b=b;
  }
}
class C
{
  C()
  {
    A aa=new A();
    System.out.println(aa.b);
  }
}
public class B extends A
{
  public static void main(String ff[])
  {
    A obja=new A();
    C c=new C();
    obja.setB("naveen");
    System.out.println(obja.getB());
  }
}
