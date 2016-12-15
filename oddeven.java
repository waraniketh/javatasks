import java.util.Scanner;


public class oddeven {
static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
  
		String r;int count=0;
  r=scan.nextLine();
	char[] c=r.toCharArray();
	for(int i=0;i<c.length;i++)
	{
	switch(c[i]){
	case 'a':
	case 'e':
	case 'i':
	case 'o':
	case 'u':
	count=count+1;
	default:	
		}
	}
System.out.println(count);	
	}
	}


