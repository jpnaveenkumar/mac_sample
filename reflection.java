import java.lang.reflect.*;
interface a{}
class refl implements a
{
  public refl()
  {

  }
  public refl(String s)
  {
    System.out.println("came to constructor");
    this.a=s;
  }
  public void method1(){System.out.println("camee");}
  public void method2(){}
  public String a;
  public int v,b,h;
}
public class reflection
{
  public static void main(String a[])
  {
    try{
    refl rr=new refl();
    Class nama=String.class;
    Class r1=refl.class;
    Constructor ccc=r1.getConstructor(new Class[]{String.class});
    String ss=null;
    Class inter[]=nama.getInterfaces();
    Object c=r1.newInstance();
    Object[] args=new Object[]{"naveenkumar"};
    refl s=(refl)ccc.newInstance(args);
    for(Class temp: inter)
    {
      System.out.println("Interfaces : "+temp.getName());
    }
    System.out.println(nama.getName());
    Method[] me=nama.getMethods();
    for(Method m:me)
    {
      System.out.println("method : "+m.getName()+" "+m.getReturnType()+" "+Modifier.toString(m.getModifiers()));
    }
    try{
      Field[] f=nama.getFields();
      for(Field ff:f){
        System.out.println(ff.getName()+" "+ff.getType()+" "+ff.get(ff));
      }
    }catch(Exception e)
    {
    }
    Constructor[] cons=nama.getConstructors();
    for(Constructor cc: cons)
    {
      System.out.println("Constructor :"+cc.getName());
    }
    try{
      Method m=r1.getMethod("method1");
      m.invoke(c);
      Class<?>[] param={Integer.class};
      //Method mm=nama.getMethod("substring",param);
      //System.out.println("result="+mm.invoke(s,3));
    }
    catch(Exception e)
    {
      System.out.println(e);
    }
    }catch(Exception e){}
  }
}
