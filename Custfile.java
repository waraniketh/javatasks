package aniketh2;
import java .io.*;
import java.util.StringTokenizer;
public class Custfile {
	static int CustId=0;
	static String CustName=null;
	static int CustAge=12;
	static int CustSal=0;
	static int i=0;
	static char grade='c';
	static char[] iu=new char[100];
	static String hus=null;
	

	public static void main(String[] args) throws Exception{
		try
		{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Customer Id");
		CustId=Integer.parseInt(br.readLine());
		System.out.println("Enter Customer Name");
		CustName= br.readLine();
		System.out.println("Enter Customer Age");
		CustAge= Integer.parseInt(br.readLine());
		System.out.println("Enter Customer salary");
		CustSal= Integer.parseInt(br.readLine());
		System.out.println("Enter Customer grade");
		grade=(char)br.read();
		System.out.println("Id is "+ CustId);
		System.out.println("Name is "+ CustName);
		System.out.println("Age is "+ CustAge);
		System.out.println("Salary is "+ CustSal);
		System.out.println("Grade is "+ grade);
		}
		catch(IOException ex)
		{
		System.out.println(ex.toString());
		}
        try {
        FileWriter pr=new FileWriter("D:\\Aniketh.txt");	
        pr.write("customer salary "+CustSal+",");
        pr.write("customer age "+CustAge+",");
        pr.write("customer name  "+CustName+",");
        pr.write("custmoer id  "+CustId+",");
        pr.write("grade "+grade+",");
        pr.close();}
        catch(Exception er)
        {	
        }
        try{
        FileReader tt=new FileReader("D:\\Aniketh.txt");	
        while(tt.ready()){
        iu[i]=(char)tt.read();
        i++;}
        tt.close();
        }
        catch(Exception e)
        {
        	System.out.println(e);
        }
      
        hus=String.copyValueOf(iu,0,iu.length);
        StringTokenizer hy=new StringTokenizer(hus,",");
        while(hy.hasMoreTokens())
        {
        	System.out.println(hy.nextToken());
        }
        }
	}

	

