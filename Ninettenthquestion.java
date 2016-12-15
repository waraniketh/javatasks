package tasks1;import java.util.*;
public class Ninettenthquestion {
public static void main(String[] args) {
System.out.println("enter your string");
Scanner s=new Scanner(System.in);
String h=s.nextLine();
    String[] k=h.split(",");
    for(int i=0;i<k.length;i++)
   System.out.println(k[i]);
    System.out.print("number of tokens"+k.length);
	}

}
