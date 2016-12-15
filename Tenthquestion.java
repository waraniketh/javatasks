package tasks1;
import java.util.*;
public class Tenthquestion {

	public static void main(String[] args) {
     Scanner s=new Scanner(System.in);
     System.out.println("please enter your number");
     int r=s.nextInt();int great=0;
	 int[] a=new int[5];int i=0;
	 while(r!=0)
	 {
	 a[i]=r%10;
	 r=r/10;i++;
	 }	 
	 for(int j=0;j<a.length;j++)
	 {
		 if(great<a[j])
		great=a[j]; 
	 }
	System.out.println(great);s.close();
	}

}
