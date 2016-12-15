package nov24;
import java.util.*;
public class Hashmap {
	static Map<String,String> map=new TreeMap<String,String>();int i=0,count1,count2,count3;
	public void count(String[] str1){ while(i<str1.length){
	if(map.get(str1[i])=="solo")
	{count1++;}
	if(map.get(str1[i])=="happy"){count2++;}
	if(map.get(str1[i])=="killaer"){count3++;}
	i++;}System.out.println(map.get(str1[count1])+count2);}
	public static void main(String[] args) {
    String[] str={"s","s","s","s","xl","xl","lo","lo"};
    map.put("s","solo");
	map.put("xl","happy");
	map.put("lo","killer");	
	System.out.println(map);
	Hashmap ty=new Hashmap();
	ty.count(str);
	}
}
