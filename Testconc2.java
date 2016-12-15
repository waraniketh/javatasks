package test1;
import java.util.*;
public class Testconc2  {
	public static void main(String[] args) {
	List<String> cis=new ArrayList<String>();
	cis.add("aniketh");
	cis.add("aniketh1");int i=0;
	cis.add("abhinav");
	ListIterator<String> itr=cis.listIterator();
		while(itr.hasNext())
		{
	System.out.println(itr.next());
	}	System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@2");
		while(itr.hasPrevious())
		{
	System.out.println(itr.previous());
i++;	}System.out.println(i);i=0;		
	System.out.println(i);}
    }
