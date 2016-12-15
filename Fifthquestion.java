package tasks1;
import java.util.*;
public class Fifthquestion {
	public static void main(String[] args) {
	int i;Scanner s=new Scanner(System.in);	
  System.out.print("number of lines");
   i=s.nextInt();
	for(int j=1;j<=i;j++)
	{System.out.print("* ");
	for(int y=1;y<j;y++)
	{	System.out.print("* ");
		System.out.print("* ");
	}
	System.out.println();
	}
	s.close();
	}
}
