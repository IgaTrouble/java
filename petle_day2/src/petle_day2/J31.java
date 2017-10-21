package petle_day2;

import java.util.Scanner;

public class J31 {

	public static void main(String[] args) {
		Scanner rl = new Scanner(System.in);
		System.out.println("Podaj pierwszego stringa: ");
		String zmienna = rl.nextLine();
		System.out.println("Podaj drugiego stringa: ");
		String zmienna2 = rl.nextLine();
		String literka = String.valueOf(zmienna2.charAt(zmienna2.length()-3));
		System.out.println(literka);
		// System.out.println(zmienna.split(literka)); //adres referencji
		for (String i : zmienna.split(literka)) {
			System.out.println(i);
		}
	}
		
		public static void print(String[] tab) {
			for (String i : tab) {
				System.out.println("bo" + i);
			}
			
		}

}
