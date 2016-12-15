package tasks1;
import java.util.*;
public class Thirdquestion {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);int rev=0;
		System.out.println("please enter your number");
		int r=s.nextInt();
		while(r!=0)
		{
		rev=(rev*10)+(r%10);
		r=r/10;
		}
		System.out.println(rev);
		s.close();

	}

}
