import java.util.*;
public class obj
{
  //instance variables
  public int ins=10;

  //class static variable
  public static int instance=20;

  //class static final variable
  public static final int zx;
  public String demo4;
  public int demo5;
  public float demo6;



  public static class subclass
  {
    subclass()
    {
      System.out.println("creation of sub class");
    }

    static void sub1()
    {
      System.out.println("calling static method");
    }

    void sub2()
    {
      System.out.println("calling non static method");
    }
  }
  public static void main(String a[])
  {
    //local variables

    //reference variable
    obj o=new obj();

    obj.subclass subobj=new obj.subclass();
    obj.subclass.sub1();
    subobj.sub2();
    String demo1="naveen";
    int demo2=10;
    float demo3=(float)99.89;
    System.out.println(demo1+" "+demo2+" "+demo3);
    System.out.println(o.demo4+" "+o.demo5+" "+o.demo6+" "+zx+" "+instance);
  }
  //static initializer block
  static
  {
    zx=67;
    System.out.println("came b");
  }
  static
  {
    System.out.println("came a");
  }
}
