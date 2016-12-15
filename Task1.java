package nov25;
import java.util.*;
public class Task1 {
public static void main(String[] args) {
System.out.println("enter the choice");
Scanner s=new Scanner(System.in);  
int i=s.nextInt();
  Map<Integer,String> map=new HashMap<Integer,String>();
  map.put(1,"tea");
  map.put(2,"coffee");
  map.put(3,"water");
  map.put(4,"juice");
  System.out.println(map.get(i));
  Map<Integer,Integer> map1=new HashMap<Integer,Integer>();
  map1.put(10,1000);
  map1.put(20,2000);
  map1.put(30,3000);
  map1.put(40,4000);
  System.out.println("enter the drink");
  Integer str=s.nextInt();
  Set<Integer> s1=map1.keySet();
  Iterator<Integer> itr1=s1.iterator();
	  while(itr1.hasNext())
	  { Integer iop=itr1.next();Integer str4=map1.get(iop);
		  if(str4==str)
		  {System.out.println(itr1.next());	 
		  }else
			  {System.out.println("failed");}}}}
