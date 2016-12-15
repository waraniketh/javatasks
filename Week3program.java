package tasks1;
import java.util.Stack;
public class Week3program {
	public static void main(String[] args) {
    Stack str=new Stack();	
    for(int i=0;i<10;i++)
    {
    str.push(new Integer(10));
    str.push(new Integer(9));
    }
    while(!str.isEmpty())
    {
    System.out.print(str.pop());
    System.out.print(",");
    }
	}

}
