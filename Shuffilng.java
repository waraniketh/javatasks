package wordcount;

import java.io.BufferedReader;

import java.io.FileReader;
import java.util.HashMap;
import java.util.*;
public class Shuffilng {

	public static void main(String[] args) throws Exception {
		FileReader fis = new FileReader("/home/hduser/war1");
		BufferedReader bif = new BufferedReader(fis);
		String[] collecting=new String[4];
		int you = 0;
		int k = 0,p=0;
		HashMap ani=new HashMap(); 
		while (bif.ready()) {
			String[] splitting = bif.readLine().split(" ");
			String[] splitting1 = new String[splitting.length];
			
			k = 0;
			for (int i = 0; i < splitting.length; i++) {
				String check = splitting[i];
				int count = 0;
				int check2 = 0;
				for (int j = 0; j < splitting.length; j++) {

					for (int b = 0; b < k; b++) {
						if (check.equals(splitting1[b])) {
							check2 = 1;

						}
					}

					if (check2 != 1) {
						count += 1;
					}
				}
				splitting1[k++] = check;

				if (count > 0) {
					//System.out.println(check + "  " + count);
					 collecting[p++]=check + String.valueOf(count);
                     ani.put(check,count);
				}
			}
			
		}
		bif.close();
		
		for(int b=0;b<collecting.length;b++){
			System.out.println(collecting[b]);
		
		}
		
		Iterator<String> itr=ani.keySet().iterator();
		while(itr.hasNext()){
			String str=(String)itr.next();
			System.out.println(str+" "+ani.get(str));
		}

	}

}
