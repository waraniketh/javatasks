package tasks1;
import java.util.*;
import java.io.*;
public class Aniketh23 {
public static void main(String[] args) throws Exception{
ArrayList<Integer> ar1=new ArrayList<Integer>();
BufferedReader br1=new BufferedReader(new InputStreamReader(System.in));
int p,q;Integer r,s,swap=0;

int y=Integer.parseInt(br1.readLine());
for(int i=0;i<y;i++){
ar1.add(Integer.parseInt(br1.readLine()));
}
System.out.print(ar1);		
System.out.println("enter objects you want to swap");
r=Integer.parseInt(br1.readLine());
s=Integer.parseInt(br1.readLine());
p=ar1.indexOf(r);
q=ar1.indexOf(s);
swap=ar1.get(p);
ar1.set(p,ar1.get(q));
ar1.set(q,swap);
ListIterator it=ar1.listIterator();
System.out.println(it.previous());
System.out.print(ar1);
System.out.println(ar1.isEmpty());
}
}
// everything ok