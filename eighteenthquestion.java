package tasks1;import java.util.*;
public class eighteenthquestion {
	public int[] sort(int p[]){
		int temp=0;
	    for(int i=0;i<p.length;i++)
	    {
	    for(int h=0;h<p.length-1;h++)
	    {
	    if(p[h]>p[h+1]){
	    temp=p[h];
	    p[h]=p[h+1];
	    p[h+1]=temp;}	
	    }
	    }return p;	
	}
	public static void main(String[] args) {	
	/*System.out.println("enter how many elements you want to enter");
	int k=s.nextInt();
    int[] y=new int[k];
    System.out.println("sorted array is");
    for(int h=0;h<y.length;h++)
    {
    	System.out.print(y[h]+" ");
	}*/
	}

}
