package git1;

import java.util.Random;
import java.util.Scanner;

public class Kaulins {
	static int mestKaulinu(int reizes) {
		int skaitlis;
		Random rand= new Random();
		int min = 0;
		
		for(int i=1; i<=reizes;i++){
		skaitlis=rand.nextInt(6)+1;
		System.out.println("Uzkrita skaitlis: "+skaitlis);
		if(skaitlis < min)
			min=skaitlis;
		}
		
		return min;
	}

	public static void main(String[] args) {
		int  reizes;
		Scanner scan=new Scanner(System.in);
		System.out.println("Cik reizes mest kaulinu?");
		reizes= scan.nextInt();
		System.out.println("Mazakais skaitlis no visiem meiteniem: "+mestKaulinu(reizes));
		

	}

}
