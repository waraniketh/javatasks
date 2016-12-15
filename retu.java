import java.io.*;
public class retu {
	 
	public static void main(String[] args)throws Exception {
		File of=new File("d:\\Aniketh.txt");	
    of.createNewFile();
    System.out.println(of.exists());
	try{
	FileReader pr=new FileReader("D:\\Aniketh.txt");
    while(pr.ready()){
    System.out.print((char)pr.read());}
    pr.close();
    }
	catch (Exception er){
	}
	PrintWriter p=new PrintWriter(of);
	p.write("aniketh");
	p.write(12+"\n");
	p.write('Q');
	p.close();
	}
	}
