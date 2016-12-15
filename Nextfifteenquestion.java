package tasks1;
import java.util.Scanner;
public class Nextfifteenquestion {
	public static void main(String[] args) {
		int i;Scanner s=new Scanner(System.in);	
	  System.out.print("number of stars you want to print");
	   i=s.nextInt();
		for(int j=1;j<=i;j++)
		{
		if(j%2==1)
		{
		   for(int k=j;k>0;k--){
			System.out.print("* ");
		}}System.out.println();}
		s.close();
		}
}
