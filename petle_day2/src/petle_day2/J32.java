package petle_day2;

import java.util.Scanner;

public class J32 {

	public static void main(String[] args) {
		Scanner rl = new Scanner(System.in);
		System.out.println("Podaj wiek: ");
		int wiek = rl.nextInt();
		
		if(wiek>18) {
			System.out.println("mo¿esz g³osowaæ");
		}
		else {
			System.out.println("Nie mo¿esz. Idz do domu!");
		}

	}

}
