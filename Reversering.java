package tasks1;
import java.io.*;
public class Reversering {
	static byte[] b=new byte[100];static int count=0;
public static void main(String[] args) throws Exception {
	FileInputStream fis=new FileInputStream("d://Aniketh.txt");
	FileOutputStream fos=new FileOutputStream("d://Aniketh1.txt");
	try{while(fis.read(b)!=-1){
    //int i=fis.read();	  
    fos.write(b);
    count++;}
      }
catch(IOException e){
	System.out.println(e.getMessage());
}System.out.print(count);	fis.close();fos.close();
}

}
