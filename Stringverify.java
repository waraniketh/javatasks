package aniketh2;

import java.util.Scanner;

public class Stringverify {
	public static void main(String[] args) {
   String str1="Aniketh";
   char[] a=new char[str1.length()];String f,g;
   Scanner scan=new Scanner(System.in);
   str1.getChars(0,str1.length(),a,0);
   System.out.print("enter character you want to replace");
   f=scan.next();
   System.out.print("enter character you want to replace with");
   g=scan.next();scan.close();
   for(int i=0;i<a.length;i++)
   {
if (f.charAt(0)==a[i])
   a[i]=g.charAt(0);
   }
   for(int i=0;i<a.length;i++)
   {
	System.out.print(a[i]);
   }
	}
}
