package day2;

import java.util.Scanner;

public class CwJ25 {

	public static void main(String[] args) {
		Scanner rl = new Scanner(System.in);
		System.out.println("Podaj co tam chcesz: ");
		String zliczak = rl.nextLine();
		System.out.println("Liczba znaków: " + zliczak.length());
		
		rl.close();

	}

}
