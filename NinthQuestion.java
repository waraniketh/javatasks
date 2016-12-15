package tasks1;
import java.util.*;
public class NinthQuestion {

	public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
       System.out.println("please enter your number of lines you want to print");
       int y=s.nextInt();int sum=0;
       for(int i=1;i<=y;i++){
       for(int j=1;j<=i;j++){
    	sum=sum+1;   
       System.out.print(sum+" ");}
       System.out.println("\n");
       }
	}

}
