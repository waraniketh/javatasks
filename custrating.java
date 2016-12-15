import java.util.Scanner;
public class custrating {
	public static void main(String[] args) {
	
Scanner s=new Scanner(System.in);
int[] a=new int[10];float avg; 
int sum=0;
for(int i=0;i<10;i++){
System.out.println("enter the customer rating of "+(i+1)+"st customer");
	a[i]=s.nextInt();	
	sum=sum+a[i];

}
s.close();
avg=sum/10;
System.out.println(avg);
	}	
	
	
	
	
	}


