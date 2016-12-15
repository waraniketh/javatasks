package programs1;
import java.util.Arrays;
import java.util.Collections;
import java.io.*;
import java.util.*;
public class Arraylist1 {
	public static void main(String[] args)throws IOException {
	BufferedReader br1=new BufferedReader(new InputStreamReader(System.in));	
	ArrayList list=new ArrayList();System.out.println("enter elemnets you want to elemnts");
	int r=Integer.parseInt(br1.readLine());
	for(int p=0;p<r;p++){
	list.add(p,new Integer(br1.readLine()));
	}
	ArrayList list1=new ArrayList();
	ListIterator is=list.listIterator();
	//for printing user entered elements
	while(is.hasNext()){
	System.out.println(is.next());
	}//for perfoming reverse operation
	for(int i=list.size()-1;i>=0;i--){
	list1.add(list.get(i));}
	Iterator ir=list1.iterator();
	System.out.println("after sorting");
	while(ir.hasNext()){
	System.out.println(ir.next());
	System.out.println(list);
	}
	}
    }
