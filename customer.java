import java.util.Scanner;
public class customer {

	
	public static void main(String[] args) {
   String name;int quan,price;double per,totamt;
   Scanner s=new Scanner(System.in);
   name=s.nextLine();
   quan=s.nextInt();
   price=s.nextInt();
    s.close();
   totamt=(quan*price);
   per=totamt/10000;
   System.out.println("percentage spent on purchase of products by "+name +" is "+(per*100));

	}

}
