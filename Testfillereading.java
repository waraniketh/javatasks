package test1;

import java.io.*;
import java.util.*;

public class Testfillereading {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("d://Aniketh.txt",true);
		OutputStreamWriter ofs = new OutputStreamWriter(fos);
		BufferedWriter bfs = new BufferedWriter(ofs);	
		Scanner s=new Scanner(System.in);System.out.print("s,s,i,i,i,s");for(int u=0;u<10;u++){
		bfs.write(s.next()+"\n");bfs.write(s.next()+"\n");
		bfs.write(String.valueOf(s.nextInt())+"\n");
		bfs.write(String.valueOf(s.nextInt())+"\n");bfs.write(String.valueOf(s.nextInt())+"\n");
		bfs.write(s.next());}
		bfs.close();
		String[] str1=new String[60];
		int[] check=new int[10];int i=0,k=0,h=0;
		BufferedReader bfs1 = new BufferedReader(new InputStreamReader(new FileInputStream("d://Aniketh.txt")));
		while(bfs1.ready()){
	    str1[k]=bfs1.readLine();
	    if(k==(3+6*h)){
		check[i]=Integer.parseInt(str1[k]);
		i++;
		h++;}
		k++;}
		int count=0,j=0;
		while(j<10){
		if(check[j]>35){
		System.out.println(check[j]);count++;}j++;}
		bfs1.close();
		System.out.println("number of students passed are"+count);	
	}

}
