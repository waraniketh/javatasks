package nov25;
import java.util.*;import java.io.*;
public class Restaurantmenu {
	public static void main(String[] args)throws Exception {
    Map<Integer,String> map=new HashMap<Integer,String>();
    map.put(1,"dosa");
    map.put(2,"idli");
	map.put(3,"wada");
	map.put(4,"masala dosa");
	map.put(5,"pesarat");for(int i=1;i<map.size();i++){
	System.out.println(i+"\t"+map.get(i));}
	System.out.println("enter your choice");
	BufferedReader bwr=new BufferedReader(new InputStreamReader(System.in));
	 Integer j=Integer.parseInt(bwr.readLine());if(j>0&&j<6){
	 System.out.println(map.get(j));}
	 Set<Integer> check=map.keySet();
	 Iterator<Integer> itr1=check.iterator();String value=bwr.readLine();
	 }
	}
    
