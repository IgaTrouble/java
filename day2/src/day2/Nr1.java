package day2;

import java.io.FilterInputStream;
import java.util.Locale;
import java.util.Scanner;

public class Nr1 {
	public static void main(String[] args) {
		Scanner rl = new Scanner(new FilterInputStream( System.in) { //chroni przed zamkni�ciem
			@Override
			public void close() {};
		});
		rl.useLocale(Locale.US);
		System.out.println("Podaj wzrost:");
		float wzrost = rl.nextFloat();
		System.out.println("Tw�j wzrost: " + wzrost);
		
		rl.close(); //zamykaj�c skancer zamykamy strumie� wej�cia i local.us juz nie dzia�a, a to daje mo�liwo�� wpisania kropki.
		
		Scanner nrl = new Scanner(System.in);
		
		int nowyWzr = nrl.nextInt();
		System.out.println("Nowy wzrost: " + nowyWzr);
		nrl.close();
		
	
}
}
