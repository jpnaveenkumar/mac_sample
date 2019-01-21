class namaException extends Exception
{
  public namaException(String msg)
  {
    super(msg);
  }
}
class test
{
  public String checkAns(String fnd) throws namaException
  {
    if(fnd.equals("male"))
      return "true";
    else{
      namaException ee=new namaException("Invalid Answer");
      ee.initCause(new ClassNotFoundException("no zeros"));
      throw ee;
    }
  }
}
public class cus_exp
{
  public static void main(String a[])
  {
    test t=new test();
    try{
        t.checkAns("female");
    }
    catch(namaException e){
        //System.out.println(e.getCause());
        e.printStackTrace();
    }
  }
}
