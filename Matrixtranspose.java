import java.util.Scanner;


public class Matrixtranspose {
public static void main(String args[]){
		int i,j;
		Scanner s = new Scanner(System.in);
		int arr[][] = new int[2][2];
	
	 	for(i = 0; i < 2; i++)
	  	{
	   	    for(j = 0; j < 2; j++) 
	     	    {
	        	arr[i][j] = s.nextInt();
	        	System.out.print(" ");
	            }
	  	}s.close();
		System.out.println("The matrix you entered is ");
	  	for(i = 0; i < 2; i++)
	    	{
	      	    for(j = 0; j < 2; j++)
	            {
	          	System.out.print(arr[i][j]+" ");
	            }
	            System.out.println(" ");
	        }  
	 	System.out.println("The transpose of the matrix is");
	  	for(i = 0; i <2; i++)
	    	{
	      	    for(j = 0; j < 2; j++)
	            {
	                System.out.print(arr[j][i]+" ");
	            }
	            System.out.println(" ");
	        }
	    }
	 }