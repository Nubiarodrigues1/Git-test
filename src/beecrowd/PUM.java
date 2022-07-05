package beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class PUM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int p = 0;
		for(int i = 0;i<n;i++) {
			System.out.printf((p+1)+" "+(p+2)+" "+(p+3)+" " + "PUM%n");
			p+=4;
			
		}

	}

}
