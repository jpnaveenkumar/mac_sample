class A
{
  public void got()
  {
    System.out.println("method of class A called");
  }
  public void overload()
  {
    System.out.println("method 1 is overloaded");
  }
  public void overload(int a,int b)
  {
    System.out.println("method 2 is overloaded");
  }
}
class B extends A
{
  @Override
  public void got()
  {
    System.out.println("method of class B called");
  }
  public void overload()
  {
    System.out.println("method 3 is overloaded");
  }
}
class D
  {
    // public void calll(A oo)
    // {
    //   System.out.println("called vall1");
    // }
    public void calll(B oo)
    {
      System.out.println("called vall2");
    }
    public void calll(String oo)
    {
      System.out.println("called vall3");
    }
    public void calll(Object oo)
    {
      System.out.println("called vall4");
    }
  }

class m2
{
  void call(A obj)
  {
    System.out.println("called m2");
  }
}
class m1 extends m2
{
  void call(B obj)
  {
    System.out.println("called m1");
  }
}
class m3 extends m1
{
  void call(Object obj)
  {
    System.out.println("called m3");
  }
}
public class Driver
{
  public static void main(String a[])
  {
     B b=new B();
    // b.got();
    // b.overload();
    //upcasting
    A aa=new B();
    // aa.got();
     A aaa=new A();
    // aaa.got();
    // //Downcasting
     B bb=(B)aa;
    // bb.got();
    // aaa.overload();
    // aaa.overload(12,23);
    m3 mmm=new m3();
    mmm.call(aaa);
    D dd=new D();
    dd.calll(bb);
  }
}
