package tasks1;
import java.util.Scanner;
public class StringReverse {
public static void main(String[] args) {
String str="";int j=0;
System.out.print("enter the string");
Scanner s=new Scanner(System.in);
str=s.nextLine();str=str+" ";
String tr="";String nar="";String[] str1=new String[str.length()];
for(int i=0;i<str.length();i++){	
if(str.charAt(i)==' ')
{	
nar=tr;
str1[j]=nar;j++;
tr = "";
}	
else
{
tr=tr+str.charAt(i);
}}
for(int o=j-1;o>=0;o--){
System.out.print(str1[o]+" ");	
}
s.close();}}
