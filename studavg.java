
import java.util.Scanner;
public class studavg {
	public static void main(String[] args) {
		int[] a=new int[5];int i=0;
	int sum=0;double avg=0;
	int verify=0;
		String str;
Scanner s=new Scanner(System.in);
System.out.println("enter the name of the student");
str=s.nextLine();
System.out.println("enter the marks of the student");
for(i=0;i<5;i++){
a[i]=s.nextInt();	
}
s.close();
for(int j=0;j<5;j++){
	sum=sum+a[j];
}
for(i=0;i<a.length;i++)
{
if(a[i]<35)
verify=3;

}	
if(verify==3){
System.out.println("you failed");
}
else{
	System.out.println("total marks scored by the student "+sum);
	System.out.println(avg=(sum/5)+((sum%5)*(10))/5);	
if(avg<100&&avg>=85)
System.out.println("name of student is "+str+" grade"+" A+");	
else if(avg<85&&avg>=75)
System.out.println("name of student is "+str+" grade"+" A");
else if(avg<75&&avg>=65)
System.out.println("name of student is "+str+" grade"+" B");
else if(avg<65&&avg>=50)
System.out.println("name of student is "+str+" grade"+" B");
else if (avg<50)
System.out.println("name of student is "+str+" fail");
}}}
