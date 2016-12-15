package tasks1;
import java.util.*;
public class Linkedlist1 {
public static void main(String args[]){
LinkedList<Integer> list=new LinkedList<Integer>();
int w;boolean j=false;
Scanner s=new Scanner(System.in);
list.add(230);	
list.add(34);
list.add(12);
list.add(57);
list.add(92);
list.add(78);
list.add(89);
System.out.println(list);System.out.println(list.get(0));
System.out.println("enter element you want to search");
Integer iy=s.nextInt();w=list.size();
int i=0;
while(w>0){
if(list.get(i)==iy){
j=true;break;
}i++;w--;
}System.out.println(j);s.close();
}
}
