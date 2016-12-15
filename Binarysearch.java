package tasks1;
import java.util.*;
public class Binarysearch {
public int Binarysearch1(int yourarray[],int u){
int start=0;int end=yourarray.length-1,mid=0;
while(start<=end){
mid=(start+end)/2;
if(yourarray[mid]==u)
return mid;
else if(yourarray[mid]<u) 
start=mid+1;
else
end=mid-1;}
return -1;
}		
public static void main(String[] args) {Binarysearch o=new Binarysearch();
Scanner s=new Scanner(System.in);int n=0;
System.out.println("enter how many elements you want to enter");
n=s.nextInt();
int[] d=new int[n];
System.out.println("enter your elements");
for(int i=0;i<n;i++)
{
d[i]=s.nextInt();	
}
System.out.println("enter element you want to search");
int search=s.nextInt();
int q=o.Binarysearch1(d,search);System.out.println(q);
s.close();
}
}
