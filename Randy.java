package aniketh2;
import java.io.*;
import java.util.*;
public class Randy {
	public static void main(String[] args) throws IOException{
    byte[] h={'r','e','d','d','y'};
    byte[] h1={'a','n','i','k','e','t','h'};int r=0;
String str4;
    RandomAccessFile tr=new RandomAccessFile("D://Aniketh.txt","rw");
	tr.writeBytes("maari\n");
	tr.writeBytes("don");
	tr.close();
	RandomAccessFile tr1=new RandomAccessFile("D://Aniketh.txt","rw");
    while((r=tr1.read())!=-1){
	str4=tr1.readLine();
    System.out.println((char)r+str4);} 
    tr1.close();
	}
}
