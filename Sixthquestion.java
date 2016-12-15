package tasks1;
import java.util.*;
public class Sixthquestion {

	public static void main(String[] args) {
  int a,b;Scanner s=new Scanner(System.in);
  a=s.nextInt();
  b=s.nextInt();System.out.println(a);
  System.out.println(b);
  a=a+b;
	b=a-b;
	a=a-b;
	System.out.println("after swapping");
	System.out.println(a);
	System.out.println(b);
	s.close();
	}
}
