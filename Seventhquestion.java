package tasks1;
import java.util.*;
public class Seventhquestion {
	public static void main(String[] args) {Scanner s=new Scanner(System.in);
    System.out.println("enter how many numbers you want to enter");
    int n=s.nextInt();int max1,max2;
		int[] a=new int[n];
		for(int i=0;i<n;i++){
			a[i]=s.nextInt();}
        max1=0;max2=0;
        for(int h=0;h<n;h++)
        { if(max1<a[h])
         {   max2=max1;
        	 max1=a[h];
        	 	}}
        System.out.println("maximum number "+max1);
        System.out.println("next maximum number "+max2);s.close();
	}

}
