package petle_day2;

import java.util.Scanner;

public class J33 {

	public static void main(String[] args) {
		Scanner rl = new Scanner(System.in);
		System.out.println("Podaj napis: ");
		String napis = rl.nextLine();
		while(true) {
		System.out.println("Podaj liczba: ");
		int liczba = rl.nextInt();	
		if(liczba <=napis.length()) {
			for(int i=1; i<=napis.length(); i+= liczba) {
				System.out.println(napis.charAt(i));
		}
			break;
		} else {
			System.out.println("Podaj liczbê z przedzia³uod 1 do: " + napis.length());
		}

		}
	rl.close();
	}

}
