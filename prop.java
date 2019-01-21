import java.util.*;
import java.io.*;
public class prop
{
  public static void main(String a[])
  {
    try{
    FileReader fr=new FileReader("naveen.properties");

    Properties p=new Properties();
    p.load(fr);

    String nav=p.getProperty("compay");
    String desig=p.getProperty("desig");

    System.out.println("company : "+nav);
    System.out.println("company : "+desig);

    Properties p1=new Properties();
    p.setProperty("company","sahaj");
    p.setProperty("desig",3);

    FileWriter fw=new FileWriter("kumar.properties");
    p.store(fw,"any string here");
  }
  catch(Exception e)
  {
    e.printStackTrace();
  }
  }
}
