package programs1;
import java.util.*;
public class Implementations {
	public static void main(String[] args)throws InterruptedException {
    List<Float> list=new ArrayList<Float>();  
    list.add(0,Float.parseFloat("10"));
    list.add(1,Float.valueOf(12));
    list.add(2,Float.valueOf(78));
    list.add(3,Float.valueOf(23));
    list.add(4,Float.valueOf(20));
    list.add(5,Float.valueOf(40)); 
    list.add(90.0f);
    list.add(new Float(23.4));
    Iterator<Float> op=list.iterator();
    while(op.hasNext())
    {System.out.println(op.next());	
   Thread.sleep(1000);} 
    Collections.sort(list);
    System.out.println(list);
    System.out.println(Collections.min(list));
    Collections.shuffle(list);
    System.out.println(list);
    System.out.print(Collections.binarySearch(list,12.0f));
	}
}
