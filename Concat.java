package aniketh2;

import java.util.Scanner;
public class Concat
{
      	public static void main(String args[])
	{
       	String st1,st2;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your String1");
		st1 = s.nextLine();
		System.out.println("Enter your String2");
		st2 = s.nextLine();s.close();
               char[] Array1 = st1.toCharArray();
       	char[] Array2 = st2.toCharArray();
       	int count=Array1.length+Array2.length;
       	char[] Array3=new char[count];
       	for( int i=0; i<Array1.length; i++) 
		{
           		Array3[i]=Array1[i];
           		
       	}
       	for(int j=0;j<Array2.length;j++)
       		{
            Array3[Array1.length+j]=Array2[j];      		
       		
       		
       		
       		}
       	for( int i=0; i<Array3.length; i++) 
		{
           		System.out.print(Array3[i]);
           		
       	}
       	
	
	}
}


