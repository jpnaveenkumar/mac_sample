interface inter
{
  public void cac1();
  public void cac2();
}
abstract class abss
{
  protected abstract void vell();
}
class temp extends abss implements inter
{
  @Override
  public  void vell()
  {
    System.out.println("abstract method is called");
  }

  @Override
  public void cac1()
  {
    System.out.println("interface method1 is called");
  }

  @Override
  public void cac2()
  {
    System.out.println("interface method2 is called");
  }
}
public class temp_main
{
  public static void main(String a[])
  {
    temp t=new temp();
    t.vell();
    t.cac1();
    t.cac2();
  }
}
