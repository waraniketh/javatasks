package nov25;
import java.util.*;
public class Task2 {
	public static void main(String[] args){
    Map<String,Integer> map=new HashMap<String,Integer>();
    System.out.print("Enter number of elemnts");
	Scanner s=new Scanner(System.in);
	int i=s.nextInt();
	while(i>0){
   System.out.println("enter "+i+" Person name");
   String j=s.next();
   System.out.println(" Enter the salary 0f "+j);
   Integer k=s.nextInt();
	map.put(j,k);
	i--;}
    System.out.println(map);
    Set<String> sort = map.keySet();
    String[] str = new String[sort.size()];
    Iterator<String> itr1 = sort.iterator();
    int l=0;
    while(itr1.hasNext()){
    str[l]=itr1.next();
    l++;}
    Arrays.sort(str);l=0;
    for(int z = 0;z<str.length;z++)
    {System.out.println(str[z]+"\t\t"+map.get(str[z]));}
    System.out.println("enter the salary you want to find");
     Object val=s.next();
     while(itr1.hasNext()){
     if(map.containsValue(val)){
     System.out.println(map.get(str[l]) +"value found");} 	 
     l++;}
	}}