package nov25;
import java.util.*;
public class Anusirexample {
public static void main(String[] args) {
Integer[] sort;int j=0;
Map<Integer,String> map=new HashMap<Integer,String>();
Map<Integer,String> map1=new TreeMap<Integer,String>();
Scanner s=new Scanner(System.in);System.out.println("number of students");
System.out.println("enter format is Integer,String");
int numofstud=s.nextInt();
for(int i=0;i<numofstud;i++){
map.put(s.nextInt(),s.next());}
System.out.println(map);
Set<Integer> set=map.keySet();sort=new Integer[set.size()];
Iterator<Integer> itr=set.iterator();
while(itr.hasNext()){
sort[j++]=itr.next();}
Arrays.sort(sort);
for(int y=0;y<sort.length;y++){
System.out.println(sort[y]);map1.put(sort[y],map.get(sort[y]));
}
System.out.println(map1);
s.close();}}
