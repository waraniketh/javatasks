package aniketh2;

import java.util.Scanner;

public class kill {

	public static void main(String[] args) {
		int i,j,k,nc;
		String s;
		Scanner dp= new Scanner(System.in);
		System.out.println("Enter number of characters: ");		
		nc=dp.nextInt();
		System.out.println("\n Enter the String :");
		s=dp.next();
		
		dp.close();
		
		for(i=0;i<nc;i++)
		{
			for(j=0;j<(nc-i);j++)
			{
			System.out.print(" ");
			}
			for(k=0;k<=i;k++)
			{
			System.out.print(s.charAt(k));
			System.out.print(" ");
			}
			System.out.print("\n");
			}
			for(i=nc-1;i>0;i--)
		    {
			for(j=-1;j<nc-i;j++)
			{
			System.out.print(" ");}
			for(k=0;k<i;k++)
			{
			System.out.print(s.charAt(k)+" ");
			}
			System.out.println();
			}
			}
			}

	


