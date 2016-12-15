package tasks1;
import java.util.Scanner;
public class Seventtenthquestion {
	public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("enter the number you want to find factorial");
 int r=s.nextInt();int fact=1;
 for(int i=0;i<r;i++)
 {
	 fact=fact*(r-i);
 }
 System.out.println(fact);
 s.close();
	}

}
