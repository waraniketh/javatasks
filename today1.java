package programs1;
import java.util.*;
public class today1 {
	public static void main(String[] args)throws Exception {
  HashSet<Integer> hs=new HashSet();
  hs.add(10);
  hs.add(11);
  hs.add(4);
  hs.add(10);
  hs.add(2);
  Iterator<Integer> itr3=hs.iterator();
  while(itr3.hasNext())
  {
	  System.out.println(itr3.next());
  }
  }
  }
