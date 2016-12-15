package aniketh2;
import java.util.*;
public class task6 {
	public static void main(String[] args) {
	String str=" I Am Aniketh         reddy      from        hyd";	
     StringTokenizer st=new StringTokenizer(str," ");
      System.out.println(st.countTokens());
	while(st.countTokens()>0)
	{
	System.out.print(st.nextToken()+" ");		
	}
	}

}
