package day2_if;

import java.util.Scanner;

public class CwJ27 {

	public static void main(String[] args) {
		Scanner rl = new Scanner(System.in); 
		System.out.println("Podaj liczbê: ");
		double liczba = rl.nextDouble();
		if(liczba > 0 && liczba < 1) {
			System.out.println("Brawo trafi³eœ! liczba jest w przedziale od 0 do 1");
		}
		else {
			System.out.println("Spróbuj ponownie");
		}
		rl.close();
	}

}
