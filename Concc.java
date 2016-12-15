package test1;
import java.util.*;
public class Concc {
	public static void main(String[] args) {
	HashMap<String,Integer> cis=new HashMap<String,Integer>();
	cis.put("aniketh",20);
	cis.put("aniketh1",201);
	cis.put("abhinav",100);
	Set<String> itr1=cis.keySet();System.out.println(itr1);
	Iterator<String> itr=itr1.iterator();
		itr.next();
		itr.remove();while(itr.hasNext()){System.out.println(itr.next());
	}
	}

}
