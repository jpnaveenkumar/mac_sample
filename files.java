import java.io.*;
public class files
{
  public static void main(String a[])
  {
    try
    {
      FileWriter fw=new FileWriter("check.txt");
      BufferedWriter bw=new BufferedWriter(fw);
      bw.write("naveen:kumar");
      bw.write("\n");
      bw.write("home:town");
      bw.close();
      FileReader fr=new FileReader("check.txt");
      BufferedReader br=new BufferedReader(fr);
      String txt;
      while((txt=br.readLine())!=null)
      {
        String[] det=txt.split(":");
        System.out.println(det[0]+"-"+det[1]);
      }
    }
    catch(Exception e)
    {
      e.printStackTrace();
    }
  }
}
