import java.util.*;
public class excep
{
  void sdf()
  {
    throw new NumberFormatException("not found");
  }
  public static void main(String a[])
  {
    int ar[]=new int[2];
    excep eee=new excep();
    try
    {
      //int s=56/0;
      //ar[6]=3;
      //String gh="hfsdf";
      //gh.charAt(9);
      eee.sdf();
      ArithmeticException ee=new ArithmeticException("ArithmeticException daaw");
      ee.initCause(new NullPointerException("null found"));
      throw ee;
    }
    catch(NullPointerException e)
    {
      System.out.println("null error occured");
    }
    catch(ArrayIndexOutOfBoundsException e)
    {
      System.out.println("index out of bound");
      return;
      //System.exit(0);
    }
    catch(ArithmeticException e)
    {
      System.out.println(e);
      System.out.println("number format error occured "+e.getCause()+" ");
    }
    catch(Exception e)
    {
      System.out.println("error occured"+e);
    }
    finally
    {
      System.out.println("closing exception");
    }
  }
}
