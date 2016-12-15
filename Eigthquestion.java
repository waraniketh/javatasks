package tasks1;
import java.util.*;
public class Eigthquestion {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter your number");
	int u=s.nextInt();int count=0;int y=0;y=u;
	if(u%2!=0&&u%3!=0&&u%5!=0&&u%7!=0)
	{System.out.println("you entered a prime number");}
	else{
	while(u!=1)
	{
	if(u%2==0)
	{	count=count+2;
	u=u/2;}
	else if(u%3==0)
	{count=count+3;	
	u=u/3;}
	else if(u%5==0){
	count=count+5;
	u=u/5;}
	else if(u%7==0)
	{count=count+7;
	u=u/7;}
    if(u%2!=0&&u%3!=0&&u%5!=0&&u%7!=0)
    break;	
	}}
	System.out.println(count+1);
if(y==(count+1)||y==(count+1)/2)
System.out.println("you entered a perfect number");s.close();
}}
