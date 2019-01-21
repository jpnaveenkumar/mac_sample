import java.io.*;
class file1
{
  public static void main(String a[])
  {
    File f=new File("check.txt");
    System.out.println(f.lastModified());
  }
}
