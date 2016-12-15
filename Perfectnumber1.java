package tasks1;import java.util.*;
public class Perfectnumber1 {
	public static void main(String[] args) {
		System.out.print("enter your number ");
   Scanner s=new Scanner(System.in);
      int y=s.nextInt();int sum=0;
      for(int i=1;i<100;i++)
      {
    	  if(y%i==0)
    	  { sum=sum+i;
    	  }	  
      }
      if(sum/2==y||sum==y)
	System.out.println("entered number is mgical");
	
	}

}
