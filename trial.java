import java.util.*;
class sem implements Comparable<sem>
{
  public int data;
  public String name;
  public boolean gender;

  sem(int d,String n,boolean g)
  {
    this.data=d;
    this.name=n;
    this.gender=g;
  }

  public int compareTo(sem se)
  {
    if(this.name.equals(se.name))
      return 0;
    else if(this.name.compareTo(se.name)>0)
      return 1;
    else
      return -1;
  }
}
public class trial
{
  public static void main(String a[])
  {
    ArrayList<sem> aa=new ArrayList<sem>();
    sem ss1=new sem(1,"naveen",false);
    sem ss2=new sem(2,"kumar",false);
    sem ss3=new sem(3,"dhoni",false);
    aa.add(ss1);
    aa.add(ss3);
    aa.add(ss2);

    Collections.sort(aa);

    for(sem itr: aa)
    {
      System.out.println(itr.data+" "+itr.name+" "+itr.gender);
    }

    LinkedList l1=new LinkedList();
    l1.add(1);
    l1.add(2);
    l1.add("jskdf");
    System.out.println(l1.get(0)+" "+l1.get(1)+" "+l1.get(2));

    PriorityQueue pq=new PriorityQueue();
    pq.add("a");
    pq.add("b");
    pq.add("c");
    System.out.println(pq.poll());
    System.out.println(pq.peek());

    TreeSet ts=new TreeSet();
    ts.add(100);
    ts.add(232);
    ts.add(34);
    ts.add(56);
    //ts.add("naveen");
    Iterator itr=ts.iterator();
    while(itr.hasNext())
    {
      System.out.print(itr.next()+" ");
    }

    HashMap<String,Integer> hm=new HashMap<String,Integer>();
    hm.put("naveen",1);
    hm.put("kumar",2);
    hm.put(null,3);

    System.out.println();
    Set<Map.Entry<String,Integer>> sh=hm.entrySet();
    for(Map.Entry<String,Integer> x: sh)
    {
      System.out.print(x.getKey());
      System.out.println(x.getValue());
    }
    // Set<String> itrr=hm.keySet();
    // for(String key : itrr)
    // {
    //     System.out.println("value is : "+hm.get(key));
    // }

    HashSet<String> hs=new HashSet<String>();
    hs.add("doni");
    hs.add("koli");
    for(String key : hs)
    {
        System.out.println("value is : "+key);
    }

    Hashtable<String,String> ht=new Hashtable<String,String>();
    ht.put("naveen","don");
    ht.put("dfdf","donu");
    Set<Map.Entry<String,String>> sd=ht.entrySet();
    for(Map.Entry<String,String> mam: sd){
      System.out.println(mam.getKey()+" "+mam.getValue());
    }
  }
}
