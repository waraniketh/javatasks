package programs1;
import java.util.ArrayList;import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Secondlargestnumber {
 ArrayList<Integer> y1=new ArrayList<Integer>();
 Iterator<Integer> itr2=y1.iterator();int t=0;Integer yi,pq;
public Integer input(){
try{    BufferedReader br1=new BufferedReader(new InputStreamReader(System.in));
    System.out.println("enter numbers you want to enter");
    int r=Integer.parseInt(br1.readLine());
for(int i=0;i<r;i++)
{
y1.add(i,new Integer(br1.readLine()));	
}
for(Integer o:y1)
{System.out.println(o);
}
Integer ob1=y1.get(0);
 while(t<y1.size())
 {if(ob1>y1.get(t)){
 ob1=ob1;
 }else{ pq=ob1;
 ob1=y1.get(t);	
 }
 t++;
 }yi=ob1;
System.out.println(yi);
}
catch(Exception e){
e.printStackTrace();	
}
return pq;}
public static void main(String[] args) {
Secondlargestnumber ur=new Secondlargestnumber();
Integer ty=ur.input();
System.out.println(" the largest number "+ty);
}
}
