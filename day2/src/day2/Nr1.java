package day2;

import java.io.FilterInputStream;
import java.util.Locale;
import java.util.Scanner;

public class Nr1 {
	public static void main(String[] args) {
		Scanner rl = new Scanner(new FilterInputStream( System.in) { //chroni przed zamkniêciem
			@Override
			public void close() {};
		});
		rl.useLocale(Locale.US);
		System.out.println("Podaj wzrost:");
		float wzrost = rl.nextFloat();
		System.out.println("Twój wzrost: " + wzrost);
		
		rl.close(); //zamykaj¹c skancer zamykamy strumieñ wejœcia i local.us juz nie dzia³a, a to daje mo¿liwoœæ wpisania kropki.
		
		Scanner nrl = new Scanner(System.in);
		
		int nowyWzr = nrl.nextInt();
		System.out.println("Nowy wzrost: " + nowyWzr);
		nrl.close();
		
	
}
}
