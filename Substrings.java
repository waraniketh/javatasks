package programs1;
import java.util.*;
import java.io.*;
public class Substrings {
	public static void main(String[] args)throws IOException {
	ArrayList<String> atr=new ArrayList<String>();
	System.out.println("please enter your strings");
	BufferedReader bwr=new BufferedReader(new InputStreamReader(System.in));
	int y=Integer.parseInt(bwr.readLine());
	for(int i=0;i<y;i++){
	atr.add(bwr.readLine());	
	}
	System.out.println(atr);
	Collections.sort(atr);
	System.out.print(atr);
	Iterator<String> itr1=atr.iterator();
	while(itr1.hasNext())
	{
	System.out.println(itr1.next());
	}
	}
    }
