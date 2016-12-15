package nov25;
import java.util.*;
public class Hashmap1 {
	public static void main(String[] args) {
   Map<Integer,String> map=new HashMap<Integer,String>();
	map.put(101,"aniketh");
	map.put(102,"abhinav");
	map.put(103,"reddy");
	map.put(104,"reddy");
	map.put(105,"war");
	map.put(106,"kill");
	System.out.println(map.get(106));
	if(map.containsKey(102))
	{System.out.println(map.get(103));}
	Set<Integer> ikey=map.keySet();
	for(Integer y:ikey)
	{
	System.out.println(y);
	}	
	for(Integer y1:ikey)
	{
	System.out.println(y1+"      "+map.get(y1));	
	}
	
	}
    }
