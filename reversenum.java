
public class reversenum {

	public static void main(String[] args) {
   int i=1351;
   int rev=0;
   System.out.println(i);
   while(i!=0)
   {
	rev=(rev*10)+(i%10); 
	
	i=i/10;
   }  
   System.out.println(rev);   
  
	}

}
