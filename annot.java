import java.lang.annotation.*;
import java.lang.reflect.*;
@Retention(RetentionPolicy.RUNTIME)
@interface namaannotation
{
  int good();
  int value() default 200;
}

class mon
{
  @namaannotation(good=29,value=33)
  public void call(){
    System.out.println("get ready");
  }
}
@Override
class annot
{
  public static void main(String a[])
  {
    mon m=new mon();
    Method met=null;
    try{
      met=m.getClass().getMethod("call");
    }catch(Exception e){e.printStackTrace();}


    namaannotation na=met.getAnnotation(namaannotation.class);
    System.out.println("value is: "+na.good());
  }
}
