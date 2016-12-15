package test1;
import java.util.*;
public class Testconc3 {
	public static void main(String args[]) {
		Map<String, Integer> map1 = new HashMap<String, Integer>();
		map1.put("aniketh", 20);
		map1.put("aniketh1", 201);
		map1.put("aniketh2", 202);
		map1.put("aniketh3", 203);
		System.out.println(map1);
		int i = 0;
		Set<String> set1 = map1.keySet();Iterator<String> itr=set1.iterator();
		String[] str2 = new String[set1.size()];
		while (itr.hasNext()) {
		System.out.println(str2[i++]=itr.next());
		}Arrays.sort(str2);
		for(String str3:str2){
			System.out.println(str3);}
		map1.put(str2[i],map1.get(str2[i]));
		System.out.print(map1);
	}
}
