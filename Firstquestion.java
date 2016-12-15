package tasks1;
import java.util.*;
public class Firstquestion {
	public static void main(String[] args) {
     int i=0;int[] g; 
     Scanner s=new Scanner(System.in);
     System.out.print("enter number of digits u want to enter");
     i=s.nextInt();int q=0;
     g=new int[i];
     System.out.print("enter digits u want to enter");
     for(int k=0;k<i;k++)
     {
     g[k]=s.nextInt();
     }
    
    for(int y=0;y<g.length;y++)
    {
    q=g[y];	
    for(int o=y+1;o<g.length;o++)
    {
    if(q==g[o])
    System.out.println(q);
    }}
    s.close();}
	}

