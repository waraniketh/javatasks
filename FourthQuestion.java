package tasks1;
import java.util.*;
public class FourthQuestion {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("please enter your number");
        int sum=0;
        int k=s.nextInt();
        while(k!=0){
    	sum=sum+k%10;
    	k=k/10;      
        }if(sum<10&&sum==1)
        {
        System.out.print("magical number");
        }else
        	{while(sum!=0)
        	{k=k+sum%10;
        	sum=sum/10;
        		}if(k<10&&k==1)
                {System.out.println("magical number");}}
	}}
