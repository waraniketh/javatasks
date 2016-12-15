package aniketh2;

import java.util.Scanner;

public class Pattern2 {
	public static void main(String[] args){
		 {
	
				int i,j,nl;
				Scanner sobj=new Scanner(System.in);
				System.out.println("enter number of lines");
				nl=sobj.nextInt();
				sobj.close();
				for(i=0;i<nl;i++)
				{
					for(j=0;j<i;j++)
					{
						System.out.print("  ");

					}

					for(j=0;j<nl-i;j++)
					{
			
						char c=(char)('a'+j);
						System.out.print(c+" ");

					}

					for(j=nl-i-2;j>=0;j--)
					{
						char c=(char) ('a'+j);
						System.out.print(c+" ");
					}
					System.out.println();
				}
			}
		}



	}

