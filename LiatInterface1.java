package tasks1;
import java.util.*;
import java.io.*;
public class LiatInterface1 {
public static void main(String[] args) throws Exception{
	Scanner s=new Scanner(System.in);int i=0,j=0;
	//FileWriter fw=new FileWriter("d://Aniketh1.txt");
	//fw.write(12);fw.close();
	System.out.println("enter number of lines you want to enter");
	int y=s.nextInt();String[] str1=new String[y];
	for(int k=0;k<y;k++){
	str1[k]=s.nextLine();}
	FileOutputStream fs=new FileOutputStream("d://Aniketh.txt",true);
	while(j<str1.length){
	byte[] ch=new byte[str1[j].length()];
	str1[j].getBytes(0,str1[j].length(),ch,0);
    fs.write(ch);
	j++;
	}fs.close();s.close();}}
