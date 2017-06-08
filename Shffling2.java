package wordcount;

import java.util.Scanner;

public class Shffling2 {
	public static void main(String[] args) {
		System.out.println("enter your string");
		Scanner s = new Scanner(System.in);
		String vowelcheck = "aeiou";
		String str = s.nextLine();
		for (int i = 0; i < vowelcheck.length(); i++) {
			int count = 0;
			for (int j = 0; j < str.length(); j++) {
				if (vowelcheck.charAt(i)==str.charAt(j)) {
					count += 1;
				}

			}
			if (count > 0) {
				System.out.println(vowelcheck.charAt(i) + " " + count);
			}
		}
	}
}
