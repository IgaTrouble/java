package petle_day2;

import java.util.Scanner;

public class J36 {

	public static void main(String[] args) {
		Scanner rl = new Scanner(System.in);
		System.out.println("Podaj liczby, kt�re chcesz doda�: ");
		int suma = 0;
		do {
			if (rl.hasNextInt()) {      // czy jest kolejna liczba
				int n = rl.nextInt();
				if(n!=0) {
					suma += n;
				} else {
					break;
				}	
			} else {
				System.out.println("Z�a liczba");	
			}	
			} while (true);
			System.out.println("Suma wszystkich liczb to: " + suma);
		rl.close();

	}

}