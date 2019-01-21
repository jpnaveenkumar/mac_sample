import java.util.*;
public class error_han
{
  void recur()
  {
    try
    {
      recur();
    }
    catch(Throwable t)
    {
      System.out.println("error came : "+t);
      //System.exit(1);
    }
  }
  public static void main(String ap[])
  {
    try
    {
      try
      {
        int r=4/0;
      }
      catch(ArrayIndexOutOfBoundsException e)
      {
        System.out.println("inner");
      }
    }
    catch(Exception e)
    {
      System.out.println("outer");
    }
    new error_han().recur();
  }
}
