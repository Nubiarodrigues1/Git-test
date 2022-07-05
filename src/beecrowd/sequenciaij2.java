package beecrowd;
import java.util.Locale;
import java.util.Scanner;

public class sequenciaij2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		int cont = 0;
		for(int i = 1, j = 7; i <= 9; ) {
			System.out.println("I=" + i + " J=" +j);
			cont++;
			j--;
			if(cont == 3) {
				cont = 0;
				i += 2;
				j = 7;
			}
		}
	}

}