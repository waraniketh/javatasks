public class Chirstmastree {
	public static void main(String[] args) {
		int count = 1;
		
		for(int l=1;l<5;l++){
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5 - i; j++) {
				System.out.print(" ");
			}

			for (int k = 0; k < count; k++) {
				System.out.print("*");

			}
			count = count + 2;
			System.out.println();
		}
		count=1+l;
		
		}
		System.out.println("     *");
		System.out.println("**************");
	}
}
