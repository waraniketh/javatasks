package aniketh2;
import java.io.*;
import java.util.*;
public class Quest {
	public static void main(String[] args)throws Exception {
    RandomAccessFile rts=new RandomAccessFile("d:\\Aniketh.txt","rw");
    int i=0;
    RandomAccessFile rts1=new RandomAccessFile("d:\\Aniketh.txt","rw");
    Scanner s=new Scanner(System.in);
    String[] str=new String[10];
    while(i<10)
    {str[i]=s.nextLine();i++;
    }s.close();
    for(int j=0;j<10;j++){
    rts.writeBytes(str[j]+"\n");}rts.close();
	for(i=0;i<10;i++)
	if(i==3||i==4)
	System.out.print(rts1.readLine()+"\n");
	else
    rts1.readLine();
    rts1.close();
    }
}
