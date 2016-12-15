package tasks1;
import java.util.*;
public class Thirteenquestion {
public static void main(String[] args) {
String d;
Scanner s=new Scanner(System.in);
System.out.println("please enter your string"); 
d=s.next();
String a="aeiouAEIOU";
int o=0;
char[] q=new char[d.length()];
d.getChars(0,d.length(),q,0);
char[] i=new char[d.length()];
int[] f=new int[d.length()];
    for(int k=0;k<d.length();k++)
    {for(int h=0;h<a.length();h++){
    if(d.charAt(k)==a.charAt(h))
    { i[o]=d.charAt(k);f[o]=k;
    o++;}}}
    /*
for(int r=0;r<o;r++)
{System.out.print(f[r]);
System.out.print(i[r]);}*/
 for(int g=0;g<o;g++){   
q[f[o-g-1]]=i[g];
}
for(int u=0;u<q.length;u++)
{
System.out.print(q[u]);	
}s.close();	}
  }

