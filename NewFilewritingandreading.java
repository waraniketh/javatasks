package aniketh2;
import java.io.*;
import java.util.*;
public class NewFilewritingandreading {
	public static void main(String[] args)throws Exception {
		String[] str2=new String[10];int i=0;Scanner st=new Scanner(System.in);
        FileWriter faw=new FileWriter("d:\\Aniketh.txt");
        FileReader faw1=new FileReader("d:\\Aniketh.txt");
        BufferedWriter ty=new BufferedWriter(faw);
        BufferedReader ty1=new BufferedReader(faw1);
        System.out.print("enter your ten lines please");
        for ( i=0;i<10;i++)
        {
        str2[i]=st.next();
        ty.write(str2[i]);
        }ty.close();
        ty1.close();
        st.close();
	}

}
