package tasks1;
import java.util.*;
public class Fourthquestion1 {
public static void main(String[] args) {
LinkedList<Integer> list=new LinkedList<Integer>();int i=0,j;
list.add(100);
list.add(56);
list.add(82);
list.add(23);
list.add(91);
System.out.println(list);
//list.add(1,10);
//System.out.println(list);
j=list.size();
while(j>0){if(i<list.size()-1){
list.set(i,list.get(i+1));}j--;i++;
}list.set(list.size()-1,null);
System.out.println("after removing first element");
System.out.println(list);
}
}
