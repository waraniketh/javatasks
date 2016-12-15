package tasks1;
import java.util.Scanner;
public class Eleventh {
public static void main(String[] args) {String c="s";int y=0;
Scanner s=new Scanner(System.in);System.out.println("enter your string");
  String i=s.nextLine();int count=0;
  System.out.println("enter chracter you want to find occurance");c=s.next();
   while(y<i.length())
   {if(c.charAt(0)==i.charAt(y)){
   count=count+1;y++;}
   else{
   y++;	}   
   }	   
   System.out.println("required character occurs "+count);
	s.close();}

}
