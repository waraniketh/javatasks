package tasks1;
import tasks1.eighteenthquestion;
import tasks1.Binarysearch;
import java.util.*;
public class Own {
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int r=0;
	System.out.print("enter elements you want to enter ");
    r=s.nextInt();
	int[] h=new int[r];
	for(int i=0;i<h.length;i++)
	{
	h[i]=s.nextInt();	
	}
	eighteenthquestion yt=new eighteenthquestion();
	int f[]=yt.sort(h);
	for(int i=0;i<r;i++)
	{
	System.out.print(f[i]);	
	}
	System.out.println("element you want to search");
	int k=s.nextInt();
	Binarysearch bs=new Binarysearch();
	int o=bs.Binarysearch1(f,k);
	System.out.println(o);
	}

	
	
	
}
