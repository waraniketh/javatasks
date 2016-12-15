package tasks1;
import java.util.*;
public class Sixteenquestion {

	public static void main(String[] args) {
    int a=0,b=1,n;Scanner s=new Scanner(System.in);int tot;
    System.out.println("how many digits you want to print");
   n=s.nextInt();System.out.print(a+" ");System.out.print(b+" ");
    for(int i=0;i<n;i++)
    {
    tot=a+b;
    System.out.print(tot+" ");
    a=b;
    b=tot;
    }
	}
}
