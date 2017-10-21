package petle_day2;

import java.util.Scanner;

public class J30 {

	public static void main(String[] args) {
		Scanner rl = new Scanner(System.in);
		System.out.println("Podaj liczbê: " );
		int liczba = rl.nextInt();
		for(int i=1; i<=liczba; i+=2) {
			System.out.println("drukuj " + i);
		}
			rl.close();
	}

}
