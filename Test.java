
import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{

			Scanner s=new Scanner(System.in);
			int[][] a=new int[2][2];
			int[][] b=new int[2][2];
			int[][] c=new int[2][2];
			System.out.println("enter your first matrix ");
			for(int i=0;i<2;i++)
			{
			for(int j=0;j<2;j++)
			{
			a[i][j]=s.nextInt();
			}
			}
			System.out.print("enter your second matrix");
			for(int i=0;i<2;i++)
			{
			for(int j=0;j<2;j++)
			{
				
			b[i][j]=s.nextInt();
			}
			}
			System.out.println("sum of matrix is");
			s.close();
		for(int i=0;i<2;i++)
		{
		for(int j=0;j<2;j++)
		{
			
		c[i][j]=a[i][j]+b[i][j];	
		System.out.print(c[i][j]+"\t");
		}
		System.out.println();
		}
		
	}}}

	

