import java.util.*;
public class enumm extends Object
{
  public enum company
  {
    zoho,google,naveen;
  }
  public enum food
  {
    i ("idly"),
    d ("dosa");

    private String nama;
    private food(String na)
    {
      this.nama=na;
    }

     public String toString()
     {
       return nama.toString();
     }
  }
  interface zxc
  {
    public void sss();
  }
  public enum food1 implements zxc
  {
    c("a","b");
    String h1;
    String h2;
    private food1(String g,String h)
    {
      h1=g;
      h2=h;
    }
    public void sss()
    {
      System.out.println("working");
    }
  }
  public static void main(String a[])
  {
    ArrayList<String> al=new ArrayList<String>();
    ArrayList<String> al1=new ArrayList<String>();
    for(company c:company.values())
    {
      al.add(c.name());
      System.out.println(c+" "+c.name());
    }

    for(food c1:food.values())
    {
      al1.add(c1.toString());
      System.out.println(c1.toString());
      System.out.println(c1.name());
    }

    System.out.println("testing :");
    for(food1 c1:food1.values())
    {
      //al1.add(c1.toString());
      System.out.println(c1.toString());
      System.out.println(c1.name());
    }

    String ch="i";
    food fd=food.valueOf(ch);
    System.out.println(fd);

    System.out.println(food.i.name());
    food1.c.sss();
  }
}
