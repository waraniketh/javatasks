package tasks1;
import java.util.*;
public class Twelethquestion {
	public static void main(String[] args) {
   Scanner s=new Scanner(System.in);
   System.out.print("please enter your number");
   int a=s.nextInt();int[] l=new int[5];int i=0;int w=0;
   while(a!=0)
   {
	   l[i]=a%10;
	   a=a/10;
	   i++;
   }  
for(int u=0;u<l.length;u++)
{
if(l[u]==1||l[u]==0){
   w=w+1;}	
else
{
	System.out.print("sorry you entered a non binary digit");break;
	}
}if(w==l.length)
	System.out.print("congrats you entered a binary digit");
	}

}
