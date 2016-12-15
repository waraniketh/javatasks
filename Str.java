package aniketh2;

import java.util.StringTokenizer;

public class Str {

	public static void main(String[] args) {
    String gg="I am a string";char a[]=new char[gg.length()];
    StringTokenizer f=new StringTokenizer(gg);
    while(f.hasMoreTokens())
    System.out.print(f.nextToken().concat(" "));
     gg.getChars(0,gg.length(),a,0);
     for(int i=0;i<a.length;i++)
     {
    	 System.out.print(a[i]+"keka");
     }	 
	}

}
