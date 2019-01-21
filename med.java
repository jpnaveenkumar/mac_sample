import java.io.*;
class seria implements Serializable
{
  public int a;
  public String gh;
  public char vv;
  public transient String xx;
  seria(int a,String gh,char dd,String vb)
  {
    this.a=a;
    this.gh=gh;
    this.vv=dd;
    this.xx=vb;
  }
}
public class med
{
  public static void main(String a[])
  {
    seria ss=new seria(12,"naveenkumar",'v',"happy");
    try
    {
    FileOutputStream fos=new FileOutputStream("med.ser");
    ObjectOutputStream oos=new ObjectOutputStream(fos);
    oos.writeObject(ss);
    FileInputStream fis=new FileInputStream("med.ser");
    ObjectInputStream ois=new ObjectInputStream(fis);
    seria sss=(seria)ois.readObject();
    System.out.println(sss.a+" "+sss.gh+" "+sss.vv+" "+sss.xx);
    }
    catch(Exception e)
    {
      e.printStackTrace();
    }
  }
}
